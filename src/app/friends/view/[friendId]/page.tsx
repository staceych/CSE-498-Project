
'use client';

import { useState, useEffect } from 'react';
import { collection, query, where, getDocs, doc, getDoc, arrayRemove, writeBatch } from 'firebase/firestore';
import { useUser, useFirestore, useMemoFirebase } from '@/firebase';
import { Avatar, AvatarFallback, AvatarImage } from '@/components/ui/avatar';
import { Card, CardContent, CardDescription, CardHeader, CardTitle } from '@/components/ui/card';
import { Button } from '@/components/ui/button';
import {
  AlertDialog,
  AlertDialogAction,
  AlertDialogCancel,
  AlertDialogContent,
  AlertDialogDescription,
  AlertDialogFooter,
  AlertDialogHeader,
  AlertDialogTitle,
} from '@/components/ui/alert-dialog';
import { Loader2, Inbox, UserX } from 'lucide-react';
import { useParams, useRouter } from 'next/navigation';
import { useToast } from '@/hooks/use-toast';
import type { VoiceLetter } from '@/lib/letters';
import VoiceLetterCard from '@/components/voice-letter-card';

type UserProfile = {
  id: string;
  username: string;
  avatar?: string;
  avatarColor?: string;
};

export default function FriendViewPage() {
  const { user: currentUser } = useUser();
  const firestore = useFirestore();
  const [friendProfile, setFriendProfile] = useState<UserProfile | null>(null);
  const [isLoading, setIsLoading] = useState(true);
  const [isUnfriending, setIsUnfriending] = useState(false);
  const [showUnfriendDialog, setShowUnfriendDialog] = useState(false);
  const [letters, setLetters] = useState<VoiceLetter[]>([]);
  const [isLettersLoading, setIsLettersLoading] = useState(true);
  
  const params = useParams();
  const router = useRouter();
  const { toast } = useToast();
  const friendId = params.friendId as string;

  useEffect(() => {
    if (!friendId || !firestore) return;

    const fetchFriendProfile = async () => {
      setIsLoading(true);
      try {
        const friendDocRef = doc(firestore, 'users', friendId);
        const friendDocSnap = await getDoc(friendDocRef);

        if (friendDocSnap.exists()) {
          setFriendProfile({ id: friendDocSnap.id, ...friendDocSnap.data() } as UserProfile);
        } else {
          console.error("Friend not found");
          toast({ title: "Friend not found", variant: "destructive" });
          router.push('/friends/list');
        }
      } catch (error) {
        console.error("Error fetching friend profile:", error);
        toast({ title: "Error fetching profile", description: "Could not load friend's data.", variant: "destructive" });
      } finally {
        setIsLoading(false);
      }
    };

    fetchFriendProfile();
  }, [friendId, router, toast, firestore]);
  
  useEffect(() => {
    if (!firestore || !currentUser?.uid || !friendId) return;

    const fetchLetters = async () => {
        setIsLettersLoading(true);
        try {
            const lettersQuery = query(
                collection(firestore, 'letters'),
                where('senderId', '==', friendId),
                where('recipientId', '==', currentUser.uid)
            );
            const querySnapshot = await getDocs(lettersQuery);
            const fetchedLetters = querySnapshot.docs.map(doc => {
                const data = doc.data();
                return {
                    ...data,
                    id: doc.id,
                    sentDate: data.sentDate.toDate ? data.sentDate.toDate() : data.sentDate,
                } as VoiceLetter;
            }).sort((a, b) => new Date(b.sentDate).getTime() - new Date(a.sentDate).getTime());
            
            setLetters(fetchedLetters);
        } catch (error) {
            console.error("Error fetching letters:", error);
            toast({
                title: "Failed to load letters",
                description: "There was an issue fetching letters from this friend.",
                variant: "destructive"
            });
        } finally {
            setIsLettersLoading(false);
        }
    };
    
    fetchLetters();
  }, [firestore, currentUser?.uid, friendId, toast]);


  const handleUnfriend = async () => {
    if (!currentUser || !friendProfile || !firestore) return;

    setIsUnfriending(true);
    try {
        const batch = writeBatch(firestore);

        const currentUserRef = doc(firestore, "users", currentUser.uid);
        batch.update(currentUserRef, {
            friends: arrayRemove(friendProfile.id)
        });

        const friendUserRef = doc(firestore, "users", friendProfile.id);
        batch.update(friendUserRef, {
            friends: arrayRemove(currentUser.uid)
        });

        await batch.commit();

        toast({
            title: "Friend Removed",
            description: `You are no longer friends with ${friendProfile.username}.`
        });

        router.push('/friends/list');

    } catch (error) {
        console.error("Error unfriending:", error);
        toast({
            title: "Error",
            description: "Could not remove friend. Please check your Firestore security rules.",
            variant: "destructive"
        });
        setIsUnfriending(false);
        setShowUnfriendDialog(false);
    }
  }

  const handleLetterDeleted = (letterId: string) => {
    setLetters(prevLetters => prevLetters.filter(letter => letter.id !== letterId));
  };


  if (isLoading) {
    return (
      <div className="flex justify-center items-center h-screen">
        <Loader2 className="h-8 w-8 animate-spin" />
      </div>
    );
  }

  if (!friendProfile) {
    // This case is mostly handled by the effect, but as a fallback.
    return (
      <div className="flex justify-center items-center h-screen">
        <p>Friend not found.</p>
      </div>
    );
  }

  return (
    <>
      <main className="container mx-auto max-w-4xl py-8 px-4">
        <div className="flex flex-col md:flex-row md:items-start md:justify-between gap-4 text-center md:text-left mb-8">
            <div className='flex flex-col items-center md:flex-row md:items-center gap-6'>
                <Avatar className="w-32 h-32">
                {friendProfile.avatar && <AvatarImage src={friendProfile.avatar} alt={friendProfile.username} />}
                <AvatarFallback 
                  className="text-5xl"
                  style={{ backgroundColor: friendProfile.avatarColor }}
                >
                    {friendProfile.username.charAt(0).toUpperCase()}
                </AvatarFallback>
                </Avatar>
                <h1 className="text-4xl font-headline font-bold text-primary">{friendProfile.username}</h1>
            </div>
          <Button variant="outline" onClick={() => setShowUnfriendDialog(true)} disabled={isUnfriending}>
            <UserX className="mr-2 h-4 w-4" />
            Unfriend
          </Button>
        </div>

        <Card>
          <CardHeader>
            <CardTitle>Letters from {friendProfile.username}</CardTitle>
            <CardDescription>Here are the voice letters you&apos;ve received from them.</CardDescription>
          </CardHeader>
          <CardContent>
            {isLettersLoading ? (
                <div className="flex justify-center py-12">
                    <Loader2 className="h-8 w-8 animate-spin" />
                </div>
            ) : letters.length > 0 ? (
                <div className="space-y-4">
                    {letters.map((letter) => (
                        <VoiceLetterCard 
                            key={letter.id} 
                            letter={letter} 
                            onLetterDeleted={handleLetterDeleted}
                        />
                    ))}
                </div>
            ) : (
                <div className="text-center py-12 px-6 border-2 border-dashed rounded-lg">
                    <Inbox className="mx-auto h-12 w-12 text-muted-foreground" />
                    <h3 className="mt-4 text-lg font-medium">No Letters Yet</h3>
                    <p className="mt-1 text-sm text-muted-foreground">
                        When {friendProfile.username} sends you a letter, it will appear here.
                    </p>
                </div>
            )}
          </CardContent>
        </Card>
      </main>
      
      <AlertDialog open={showUnfriendDialog} onOpenChange={setShowUnfriendDialog}>
        <AlertDialogContent>
          <AlertDialogHeader>
            <AlertDialogTitle>Are you sure?</AlertDialogTitle>
            <AlertDialogDescription>
              This will permanently remove {friendProfile.username} from your friends list. This action cannot be undone.
            </AlertDialogDescription>
          </AlertDialogHeader>
          <AlertDialogFooter>
            <AlertDialogCancel disabled={isUnfriending}>Cancel</AlertDialogCancel>
            <AlertDialogAction onClick={handleUnfriend} disabled={isUnfriending} className="bg-destructive hover:bg-destructive/90">
              {isUnfriending && <Loader2 className="mr-2 h-4 w-4 animate-spin" />}
              Unfriend
            </AlertDialogAction>
          </AlertDialogFooter>
        </AlertDialogContent>
      </AlertDialog>
    </>
  );
}
