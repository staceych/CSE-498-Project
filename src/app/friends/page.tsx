
'use client';

import { useState, useEffect } from 'react';
import { Search, Loader2, UserPlus, Check, Hourglass, X } from 'lucide-react';
import { Input } from '@/components/ui/input';
import { Button } from '@/components/ui/button';
import { Card, CardContent, CardHeader, CardTitle, CardDescription } from '@/components/ui/card';
import { Avatar, AvatarFallback, AvatarImage } from '@/components/ui/avatar';
import { useToast } from '@/hooks/use-toast';
import { useUser, useFirestore } from '@/firebase';
import { collection, query, where, getDocs, doc, updateDoc, arrayUnion, onSnapshot, arrayRemove, getDoc, writeBatch } from 'firebase/firestore';

type UserProfile = {
  id: string;
  username: string;
  email: string;
  friendCode: string;
  avatar?: string;
  avatarColor?: string;
  friends: string[];
  friendRequestReceived: string[];
  friendRequestSent: string[];
};

type UserWithProfile = {
    id: string;
    username: string;
    email: string;
    avatar?: string;
    avatarColor?: string;
}

export default function FriendsPage() {
  const { user: currentUser } = useUser();
  const firestore = useFirestore();
  const [userProfile, setUserProfile] = useState<UserProfile | null>(null);
  const [searchQuery, setSearchQuery] = useState('');
  const [searchResults, setSearchResults] = useState<UserProfile[]>([]);
  const [isLoading, setIsLoading] = useState(false);
  const [requesterProfiles, setRequesterProfiles] = useState<Record<string, UserWithProfile>>({});

  const { toast } = useToast();

  useEffect(() => {
    if (!currentUser || !firestore) return;

    const userDocRef = doc(firestore, 'users', currentUser.uid);
    const unsubscribeProfile = onSnapshot(userDocRef, async (docSnap) => {
      if (docSnap.exists()) {
        const profileData = { id: docSnap.id, ...docSnap.data() } as UserProfile;
        setUserProfile(profileData);

        // Fetch profiles for received requests
        if (profileData.friendRequestReceived) {
            profileData.friendRequestReceived.forEach(async (userId) => {
              if (requesterProfiles[userId]) return; // Don't re-fetch if we already have it
              const userDoc = await getDoc(doc(firestore, 'users', userId));
              if (userDoc.exists()) {
                  const userData = userDoc.data();
                  setRequesterProfiles(prev => ({
                      ...prev,
                      [userId]: {
                          id: userDoc.id,
                          username: userData.username,
                          email: userData.email,
                          avatar: userData.avatar,
                          avatarColor: userData.avatarColor,
                      }
                  }));
              }
            });
        }
      }
    });
    return () => unsubscribeProfile();
  // eslint-disable-next-line react-hooks/exhaustive-deps
  }, [currentUser, firestore]);


  const handleSearch = async (e: React.FormEvent) => {
    e.preventDefault();
    if (!searchQuery.trim() || !currentUser || !firestore) return;

    setIsLoading(true);
    setSearchResults([]);
    try {
        const uppercaseQuery = searchQuery.trim().toUpperCase();
        const q = query(collection(firestore, "users"), where("friendCode", "==", uppercaseQuery));
        const querySnapshot = await getDocs(q);
        const results: UserProfile[] = [];
        querySnapshot.forEach((doc) => {
            if(doc.id !== currentUser.uid) {
                results.push({ id: doc.id, ...(doc.data() as Omit<UserProfile, 'id'>) });
            }
        });
        setSearchResults(results);

        if (results.length === 0) {
           toast({
            title: "No users found",
            description: `No user with the friend code "${uppercaseQuery}".`,
          });
        }
    } catch(error: any) {
        console.error("Error searching users:", error);
        toast({
            title: "Search Failed",
            description: "An error occurred while searching for users.",
            variant: "destructive"
        })
    } finally {
        setIsLoading(false);
    }
  };

  const handleSendFriendRequest = async (friend: UserProfile) => {
    if (!currentUser || !userProfile || !firestore) return;
    
    const currentUserRef = doc(firestore, 'users', currentUser.uid);
    const friendRef = doc(firestore, 'users', friend.id);

    try {
      const batch = writeBatch(firestore);

      // Add current user's ID to the friend's `friendRequestReceived` array
      batch.update(friendRef, {
        friendRequestReceived: arrayUnion(currentUser.uid)
      });
      
      // Add friend's ID to the current user's `friendRequestSent` array
      batch.update(currentUserRef, {
        friendRequestSent: arrayUnion(friend.id)
      });
      
      await batch.commit();

      toast({
        title: 'Friend Request Sent!',
        description: `Your request to ${friend.username} has been sent.`,
      });
    } catch (error: any) {
        console.error("Error sending friend request:", error);
        toast({
            title: "Request Failed",
            description: "Could not send friend request. Please check your Firestore security rules and internet connection.",
            variant: "destructive"
        })
    }
  };

  const handleAcceptFriendRequest = async (requesterId: string) => {
    if (!currentUser || !userProfile || !firestore) return;
    
    const currentUserRef = doc(firestore, 'users', currentUser.uid);
    const requesterRef = doc(firestore, 'users', requesterId);

    try {
      const batch = writeBatch(firestore);

      // Action on Current User (Acceptor's) document:
      // 1. Add requester to friends list
      // 2. Remove requester from received requests list
      batch.update(currentUserRef, {
        friends: arrayUnion(requesterId),
        friendRequestReceived: arrayRemove(requesterId)
      });
      
      // Action on Requester's document:
      // 1. Add current user to their friends list
      // 2. Remove current user from their sent requests list
      batch.update(requesterRef, {
        friends: arrayUnion(currentUser.uid),
        friendRequestSent: arrayRemove(currentUser.uid)
      });

      await batch.commit();

      toast({
        title: 'Friend Added!',
        description: 'You are now friends.'
      });
    } catch(error) {
      console.error("Error accepting friend request:", error);
      toast({
        title: 'Error',
        description: 'Could not accept friend request. Please check your Firestore security rules.',
        variant: 'destructive'
      });
    }
  }
  
  const handleDeclineFriendRequest = async (requesterId: string) => {
      if (!currentUser || !firestore) return;
      const currentUserRef = doc(firestore, 'users', currentUser.uid);
      const friendRef = doc(firestore, 'users', requesterId);
      
      try {
        const batch = writeBatch(firestore);

        // Remove from current user's received requests
        batch.update(currentUserRef, {
            friendRequestReceived: arrayRemove(requesterId)
        });
         // Remove from friend's sent requests
        batch.update(friendRef, {
            friendRequestSent: arrayRemove(currentUser.uid)
        });

        await batch.commit();

        toast({
            title: 'Request Declined'
        })
      } catch (error) {
        console.error("Error declining request:", error);
        toast({
            title: 'Error',
            description: 'Could not decline request.',
            variant: 'destructive'
        })
      }
  }


  const getRelationshipStatus = (userId: string) => {
    if (userProfile?.friends?.includes(userId)) return 'friends';
    if (userProfile?.friendRequestSent?.includes(userId)) return 'sent';
    if (userProfile?.friendRequestReceived?.includes(userId)) return 'received';
    return 'none';
  }

  const FriendRequestList = () => {
    if (!userProfile?.friendRequestReceived || userProfile.friendRequestReceived.length === 0) {
      return null;
    }
    
    return (
      <Card className="mb-8">
        <CardHeader>
          <CardTitle>Friend Requests</CardTitle>
          <CardDescription>Accept or decline requests to connect.</CardDescription>
        </CardHeader>
        <CardContent className="space-y-4">
          {userProfile.friendRequestReceived.map(userId => {
            const requester = requesterProfiles[userId];
            const displayName = requester?.username || requester?.email || '...';
            return (
                <div key={userId} className="flex items-center justify-between p-2 rounded-md bg-accent/50">
                    <div className="flex items-center gap-3">
                        <Avatar>
                           {requester?.avatar && <AvatarImage src={requester.avatar} alt={displayName} />}
                           <AvatarFallback style={{ backgroundColor: requester?.avatarColor }}>{displayName?.charAt(0).toUpperCase() || '?'}</AvatarFallback>
                        </Avatar>
                        <p className="text-sm font-medium">
                             Request from <span className="font-semibold">{displayName}</span>
                        </p>
                    </div>
                    <div className="flex gap-2">
                        <Button size="sm" onClick={() => handleAcceptFriendRequest(userId)}>
                            <Check className="mr-2 h-4 w-4" /> Accept
                        </Button>
                        <Button size="sm" variant="ghost" onClick={() => handleDeclineFriendRequest(userId)}>
                            <X className="mr-2 h-4 w-4" /> Decline
                        </Button>
                    </div>
                </div>
            )
          })}
        </CardContent>
      </Card>
    );
  }

  return (
    <>
      <main className="container mx-auto max-w-2xl py-8 px-4">
        <div className="text-center mb-8">
          <h1 className="text-4xl font-headline font-bold text-primary">Find & Manage Friends</h1>
          <p className="mt-2 text-lg text-muted-foreground">Connect with others using their unique 6-character friend code.</p>
        </div>

        <FriendRequestList />

        <form onSubmit={handleSearch} className="flex gap-2 mb-8">
          <Input
            type="search"
            placeholder="Enter a 6-character friend code..."
            value={searchQuery}
            onChange={(e) => setSearchQuery(e.target.value)}
            className="flex-grow"
            disabled={isLoading}
            maxLength={6}
          />
          <Button type="submit" disabled={isLoading || !searchQuery.trim()}>
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
          
          {!isLoading && searchResults.length > 0 && (
             <h2 className="text-xl font-semibold">Search Results</h2>
          )}

          {searchResults.map((user) => {
            const status = getRelationshipStatus(user.id);
            return (
              <Card key={user.id}>
                <CardContent className="flex items-center justify-between p-4">
                  <div className="flex items-center gap-4">
                    <Avatar>
                      {user.avatar && <AvatarImage src={user.avatar} alt={user.username} />}
                      <AvatarFallback style={{ backgroundColor: user.avatarColor }}>{user.username.charAt(0).toUpperCase()}</AvatarFallback>
                    </Avatar>
                    <div>
                      <span className="font-medium">{user.username}</span>
                      <p className="text-sm text-muted-foreground">{user.friendCode}</p>
                    </div>
                  </div>
                  <Button
                    size="sm"
                    onClick={() => {
                      if (status === 'none') handleSendFriendRequest(user);
                      if (status === 'received') handleAcceptFriendRequest(user.id);
                    }}
                    disabled={status === 'friends' || status === 'sent'}
                  >
                    {status === 'friends' && (<><Check className="mr-2 h-4 w-4" /> Friends</>)}
                    {status === 'sent' && (<><Hourglass className="mr-2 h-4 w-4" /> Sent</>)}
                    {status === 'received' && (<><UserPlus className="mr-2 h-4 w-4" /> Accept Request</>)}
                    {status === 'none' && (<><UserPlus className="mr-2 h-4 w-4" /> Add Friend</>)}
                  </Button>
                </CardContent>
              </Card>
            )
          })}
        </div>
      </main>
    </>
  );
}
