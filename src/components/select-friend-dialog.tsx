
'use client';

import { useState, useEffect } from 'react';
import {
  Dialog,
  DialogContent,
  DialogHeader,
  DialogTitle,
  DialogDescription,
  DialogFooter,
} from '@/components/ui/dialog';
import { Button } from '@/components/ui/button';
import { Avatar, AvatarFallback, AvatarImage } from '@/components/ui/avatar';
import { Checkbox } from '@/components/ui/checkbox';
import { Loader2, Send, User } from 'lucide-react';
import { doc, getDoc, collection, query, where, getDocs } from 'firebase/firestore';
import { useUser, useFirestore } from '@/firebase';
import { ScrollArea } from './ui/scroll-area';

interface SelectFriendDialogProps {
  open: boolean;
  onOpenChange: (open: boolean) => void;
  onConfirm: (selectedFriendIds: string[]) => void;
  isSending: boolean;
}

type UserProfile = {
  id: string;
  username: string;
  avatar?: string;
  avatarColor?: string;
};

export default function SelectFriendDialog({ open, onOpenChange, onConfirm, isSending }: SelectFriendDialogProps) {
  const { user: currentUser } = useUser();
  const firestore = useFirestore();
  const [friends, setFriends] = useState<UserProfile[]>([]);
  const [selectedFriends, setSelectedFriends] = useState<string[]>([]);
  const [isLoading, setIsLoading] = useState(false);


  useEffect(() => {
    if (!open || !currentUser || !firestore) {
      setFriends([]);
      setSelectedFriends([]);
      return;
    }

    const fetchFriends = async () => {
      setIsLoading(true);
      try {
        const userDocRef = doc(firestore, 'users', currentUser.uid);
        const userDocSnap = await getDoc(userDocRef);

        if (userDocSnap.exists()) {
          const userData = userDocSnap.data();
          const friendIds = userData.friends || [];

          if (friendIds.length > 0) {
            const friendsQuery = query(collection(firestore, 'users'), where('__name__', 'in', friendIds));
            const querySnapshot = await getDocs(friendsQuery);
            const friendsList = querySnapshot.docs.map(doc => ({
              id: doc.id,
              ...doc.data()
            } as UserProfile));
            setFriends(friendsList);
          }
        }
      } catch (error) {
        console.error("Error fetching friends:", error);
      } finally {
        setIsLoading(false);
      }
    };

    fetchFriends();
  }, [open, currentUser, firestore]);

  const handleSelectFriend = (friendId: string) => {
    setSelectedFriends(prev =>
      prev.includes(friendId)
        ? prev.filter(id => id !== friendId)
        : [...prev, friendId]
    );
  };

  const handleConfirm = () => {
    onConfirm(selectedFriends);
  };

  return (
    <Dialog open={open} onOpenChange={onOpenChange}>
      <DialogContent className="sm:max-w-[425px]">
        <DialogHeader>
          <DialogTitle>Send Letter To...</DialogTitle>
          <DialogDescription>Select one or more friends to receive your letter.</DialogDescription>
        </DialogHeader>
        <div className="py-4">
          <ScrollArea className="h-72 w-full">
            <div className="space-y-4 pr-4">
              {isLoading ? (
                <div className="flex justify-center items-center h-full pt-10">
                  <Loader2 className="h-8 w-8 animate-spin text-muted-foreground" />
                </div>
              ) : friends.length > 0 ? (
                friends.map(friend => (
                  <div
                    key={friend.id}
                    className="flex items-center justify-between p-2 rounded-md hover:bg-accent cursor-pointer"
                    onClick={() => handleSelectFriend(friend.id)}
                  >
                    <div className="flex items-center gap-3">
                      <Avatar>
                        {friend.avatar && <AvatarImage src={friend.avatar} alt={friend.username} />}
                        <AvatarFallback style={{ backgroundColor: friend.avatarColor }}>{friend.username.charAt(0).toUpperCase()}</AvatarFallback>
                      </Avatar>
                      <span className="font-medium">{friend.username}</span>
                    </div>
                    <Checkbox
                      checked={selectedFriends.includes(friend.id)}
                      onCheckedChange={() => handleSelectFriend(friend.id)}
                      aria-label={`Select ${friend.username}`}
                    />
                  </div>
                ))
              ) : (
                <div className="text-center text-muted-foreground pt-10">
                  <User className="mx-auto h-12 w-12 text-muted-foreground" />
                  <p className="mt-4 font-medium">No friends yet.</p>
                   <p className="text-sm">You need to add friends before you can send a letter.</p>
                </div>
              )}
            </div>
          </ScrollArea>
        </div>
        <DialogFooter>
          <Button variant="outline" onClick={() => onOpenChange(false)}>Cancel</Button>
          <Button onClick={handleConfirm} disabled={isLoading || isSending || selectedFriends.length === 0}>
             {isSending ? (
                <Loader2 className="mr-2 h-4 w-4 animate-spin" />
             ) : (
                <Send className="mr-2 h-4 w-4" />
             )}
            {isSending ? 'Sending...' : `Send to ${selectedFriends.length} friend${selectedFriends.length !== 1 ? 's' : ''}`}
          </Button>
        </DialogFooter>
      </DialogContent>
    </Dialog>
  );
}
