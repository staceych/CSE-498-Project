'use client';

import { useState, useEffect } from 'react';
import { Search, Loader2, UserPlus, Check } from 'lucide-react';
import { Input } from '@/components/ui/input';
import { Button } from '@/components/ui/button';
import { Card, CardContent } from '@/components/ui/card';
import { Avatar, AvatarFallback, AvatarImage } from '@/components/ui/avatar';
import { useToast } from '@/hooks/use-toast';
import { auth, db } from '@/lib/firebase';
import { collection, query, where, getDocs, doc, updateDoc, arrayUnion, getDoc } from 'firebase/firestore';
import type { User as FirebaseUser } from 'firebase/auth';

type UserProfile = {
  id: string; // This will be the document ID from Firestore (same as Firebase Auth UID)
  username: string;
  avatar?: string;
};

// Search for users in Firestore
const searchUsers = async (friendLink: string, currentUserId: string): Promise<UserProfile[]> => {
  if (!friendLink.trim()) return [];

  const usersRef = collection(db, 'users');
  // Query for the user with the matching friendLink
  const q = query(usersRef, where('friendLink', '==', friendLink));
  
  try {
    const querySnapshot = await getDocs(q);
    const users: UserProfile[] = [];
    querySnapshot.forEach((doc) => {
      // Exclude the current user from the results
      if (doc.id !== currentUserId) {
        users.push({ id: doc.id, ...doc.data() } as UserProfile);
      }
    });
    return users;
  } catch (error) {
    console.error("Error searching users: ", error);
    return [];
  }
};

export default function FriendsPage() {
  const [currentUser, setCurrentUser] = useState<FirebaseUser | null>(null);
  const [userFriends, setUserFriends] = useState<string[]>([]);
  const [searchQuery, setSearchQuery] = useState('');
  const [searchResults, setSearchResults] = useState<UserProfile[]>([]);
  const [isLoading, setIsLoading] = useState(false);
  const { toast } = useToast();

  useEffect(() => {
    const unsubscribe = auth.onAuthStateChanged(async (user) => {
      setCurrentUser(user);
      if (user) {
        // Fetch current user's friends list
        const userDocRef = doc(db, 'users', user.uid);
        const userDoc = await getDoc(userDocRef);
        if (userDoc.exists()) {
          setUserFriends(userDoc.data().friends || []);
        }
      }
    });
    return () => unsubscribe();
  }, []);

  const handleSearch = async (e: React.FormEvent) => {
    e.preventDefault();
    if (!searchQuery.trim() || !currentUser) return;

    setIsLoading(true);
    const results = await searchUsers(searchQuery, currentUser.uid);
    setSearchResults(results);
    setIsLoading(false);
  };

  const handleAddFriend = async (friend: UserProfile) => {
    if (!currentUser) {
      toast({ title: "Not logged in", description: "You must be logged in to add friends.", variant: 'destructive'});
      return;
    }

    try {
      // Add friend to current user's friend list
      const currentUserRef = doc(db, 'users', currentUser.uid);
      await updateDoc(currentUserRef, {
        friends: arrayUnion(friend.id)
      });

      // Optional: Add current user to friend's friend list (for a two-way friendship)
      const friendRef = doc(db, 'users', friend.id);
      await updateDoc(friendRef, {
        friends: arrayUnion(currentUser.uid)
      });
      
      setUserFriends(prev => [...prev, friend.id]);
      
      toast({
        title: 'Friend Added!',
        description: `You are now friends with ${friend.username}.`,
      });
    } catch (error) {
      console.error("Error adding friend: ", error);
      toast({
        title: 'Error',
        description: 'Could not add friend. Please try again.',
        variant: 'destructive',
      });
    }
  };

  const isFriend = (userId: string) => userFriends.includes(userId);

  return (
    <>
      <main className="container mx-auto max-w-2xl py-8 px-4">
        <div className="text-center mb-8">
          <h1 className="text-4xl font-headline font-bold text-primary">Find Friends</h1>
          <p className="mt-2 text-lg text-muted-foreground">Connect with others using their unique friend link.</p>
        </div>

        <form onSubmit={handleSearch} className="flex gap-2 mb-8">
          <Input
            type="search"
            placeholder="Search by friend link (e.g., username.link)..."
            value={searchQuery}
            onChange={(e) => setSearchQuery(e.target.value)}
            className="flex-grow"
            disabled={isLoading}
          />
          <Button type="submit" disabled={isLoading}>
            {isLoading ? (
              <Loader2 className="mr-2 h-4 w-4 animate-spin" />
            ) : (
              <Search className="mr-2 h-4 w-4" />
            )}
            Search
          </Button>
        </form>

        <div className="space-y-4">
          {isLoading && <p className="text-center text-muted-foreground">Searching...</p>}
          
          {!isLoading && searchResults.length === 0 && searchQuery && (
             <p className="text-center text-muted-foreground">No users found for &quot;{searchQuery}&quot;.</p>
          )}

          {searchResults.map((user) => (
            <Card key={user.id}>
              <CardContent className="flex items-center justify-between p-4">
                <div className="flex items-center gap-4">
                  <Avatar>
                    {user.avatar && <AvatarImage src={user.avatar} alt={user.username} />}
                    <AvatarFallback>{user.username.charAt(0).toUpperCase()}</AvatarFallback>
                  </Avatar>
                  <span className="font-medium">{user.username}</span>
                </div>
                <Button
                  size="sm"
                  onClick={() => handleAddFriend(user)}
                  disabled={isFriend(user.id)}
                >
                  {isFriend(user.id) ? (
                    <>
                      <Check className="mr-2 h-4 w-4" />
                      Friend
                    </>
                  ) : (
                    <>
                     <UserPlus className="mr-2 h-4 w-4" />
                     Add Friend
                    </>
                  )}
                </Button>
              </CardContent>
            </Card>
          ))}
        </div>
      </main>
    </>
  );
}
