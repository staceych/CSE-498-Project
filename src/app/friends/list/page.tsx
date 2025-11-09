
'use client';

import { useState, useEffect } from 'react';
import Link from 'next/link';
import { doc, getDoc, collection, query, where, getDocs } from 'firebase/firestore';
import { useUser, useFirestore } from '@/firebase';
import { Avatar, AvatarFallback, AvatarImage } from '@/components/ui/avatar';
import { Card, CardContent } from '@/components/ui/card';
import { Loader2, Users } from 'lucide-react';

type UserProfile = {
  id: string;
  username: string;
  avatar?: string;
  avatarColor?: string;
};

export default function FriendsListPage() {
  const { user: currentUser, isUserLoading: isAuthLoading } = useUser();
  const firestore = useFirestore();
  const [friends, setFriends] = useState<UserProfile[]>([]);
  const [isDataLoading, setIsDataLoading] = useState(true);

  useEffect(() => {
    // Don't fetch data until auth state is confirmed and we have a user and firestore.
    if (isAuthLoading || !currentUser || !firestore) {
      if (!isAuthLoading && !currentUser) {
        // If auth check is done and there's no user, stop loading.
        setIsDataLoading(false);
      }
      return;
    }

    const fetchFriends = async () => {
      setIsDataLoading(true);
      try {
        const userDocRef = doc(firestore, 'users', currentUser.uid);
        const userDocSnap = await getDoc(userDocRef);

        if (userDocSnap.exists()) {
          const userData = userDocSnap.data();
          const friendIds = userData.friends || [];

          if (friendIds.length > 0) {
            // Firestore 'in' queries are limited to 30 items. For a more scalable app,
            // you'd paginate. We'll query up to 30 here.
            const friendsQuery = query(collection(firestore, 'users'), where('__name__', 'in', friendIds.slice(0, 30)));
            const querySnapshot = await getDocs(friendsQuery);
            const friendsList = querySnapshot.docs.map(doc => ({
              id: doc.id,
              ...doc.data()
            } as UserProfile));
            setFriends(friendsList);
          } else {
            setFriends([]);
          }
        }
      } catch (error) {
        console.error("Error fetching friends:", error);
        setFriends([]);
      } finally {
        setIsDataLoading(false);
      }
    };

    fetchFriends();
  }, [currentUser, isAuthLoading, firestore]);

  const isLoading = isAuthLoading || isDataLoading;

  if (isLoading) {
    return (
      <div className="flex justify-center items-center h-screen">
        <Loader2 className="h-8 w-8 animate-spin" />
      </div>
    );
  }

  return (
    <main className="container mx-auto max-w-2xl py-8 px-4">
      <div className="text-center mb-8">
        <h1 className="text-4xl font-headline font-bold text-primary">Your Friends</h1>
        <p className="mt-2 text-lg text-muted-foreground">Select a friend to view their letters.</p>
      </div>

      {friends.length > 0 ? (
        <div className="grid grid-cols-1 sm:grid-cols-2 md:grid-cols-3 gap-6">
          {friends.map((friend) => (
            <Link href={`/friends/view/${friend.id}`} key={friend.id}>
              <Card className="text-center hover:shadow-lg transition-shadow">
                <CardContent className="p-6 flex flex-col items-center gap-4">
                  <Avatar className="w-24 h-24">
                    {friend.avatar && <AvatarImage src={friend.avatar} alt={friend.username} />}
                    <AvatarFallback 
                      className="text-3xl"
                      style={{ backgroundColor: friend.avatarColor }}
                    >
                      {friend.username.charAt(0).toUpperCase()}
                    </AvatarFallback>
                  </Avatar>
                  <p className="font-semibold text-lg">{friend.username}</p>
                </CardContent>
              </Card>
            </Link>
          ))}
        </div>
      ) : (
        <div className="text-center py-16 px-6 border-2 border-dashed rounded-lg">
            <Users className="mx-auto h-12 w-12 text-muted-foreground" />
            <h3 className="mt-4 text-lg font-medium">No Friends Yet</h3>
            <p className="mt-1 text-sm text-muted-foreground">
                You haven&apos;t added any friends. Use the &quot;Add Friend&quot; page to connect with others.
            </p>
            <div className="mt-6">
                <Link href="/friends">
                    <button className="inline-flex items-center px-4 py-2 border border-transparent text-sm font-medium rounded-md shadow-sm text-white bg-primary hover:bg-primary/90">
                        Add Friends
                    </button>
                </Link>
            </div>
        </div>
      )}
    </main>
  );
}
