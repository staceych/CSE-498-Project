
'use client';

import { useState, useEffect } from 'react';
import { useRouter } from 'next/navigation';
import { LogOut, User, ChevronRight, Loader2, UserCircle2, Copy, Bell, Inbox, Send } from 'lucide-react';
import { Button } from '@/components/ui/button';
import { Avatar, AvatarFallback, AvatarImage } from '@/components/ui/avatar';
import { useToast } from '@/hooks/use-toast';
import { useUser, useFirestore, useAuth } from '@/firebase';
import { doc, onSnapshot, updateDoc, collection, query, where, getDocs, getDoc } from 'firebase/firestore';
import { Card, CardContent, CardHeader, CardTitle, CardDescription } from '@/components/ui/card';
import { Select, SelectContent, SelectItem, SelectTrigger, SelectValue } from '@/components/ui/select';
import { Tabs, TabsContent, TabsList, TabsTrigger } from '@/components/ui/tabs';
import type { VoiceLetter } from '@/lib/letters';
import VoiceLetterCard from '@/components/voice-letter-card';

type UserProfile = {
  username: string;
  email: string; // Ensure email is part of the profile
  friendCode: string;
  friends: string[];
  friendRequestReceived: string[];
  notificationTime?: string;
  avatar?: string;
  avatarColor?: string;
};

type SentLetterWithRecipient = VoiceLetter & {
  recipientName?: string;
};


const timeOptions = [
  "12:00 AM", "1:00 AM", "2:00 AM", "3:00 AM", "4:00 AM", "5:00 AM", 
  "6:00 AM", "7:00 AM", "8:00 AM", "9:00 AM", "10:00 AM", "11:00 AM", 
  "12:00 PM", "1:00 PM", "2:00 PM", "3:00 PM", "4:00 PM", "5:00 PM", 
  "6:00 PM", "7:00 PM", "8:00 PM", "9:00 PM", "10:00 PM", "11:00 PM"
];

export default function ProfilePage() {
  const { user, isUserLoading } = useUser();
  const firestore = useFirestore();
  const auth = useAuth();
  const [userProfile, setUserProfile] = useState<UserProfile | null>(null);
  const [sentLetters, setSentLetters] = useState<SentLetterWithRecipient[]>([]);
  const [isLettersLoading, setIsLettersLoading] = useState(true);

  const router = useRouter();
  const { toast } = useToast();

  useEffect(() => {
    if (isUserLoading) return;
    if (!user) {
      router.push('/login');
      return;
    }
    
    if (!firestore) return;

    const userDocRef = doc(firestore, 'users', user.uid);
    const unsubscribeProfile = onSnapshot(userDocRef, (docSnap) => {
      if (docSnap.exists()) {
        setUserProfile(docSnap.data() as UserProfile);
      } else {
        console.error("User profile document does not exist.");
      }
    }, (error) => {
      console.error("Error fetching user profile:", error);
      toast({
        title: "Failed to load profile",
        description: "Could not fetch your profile data.",
        variant: "destructive",
      });
    });

    const fetchSentLetters = async () => {
        setIsLettersLoading(true);
        try {
            const lettersQuery = query(
                collection(firestore, 'letters'),
                where('senderId', '==', user.uid)
            );
            const querySnapshot = await getDocs(lettersQuery);
            
            const fetchedLettersPromises = querySnapshot.docs.map(async (letterDoc) => {
                const letterData = letterDoc.data() as Omit<VoiceLetter, 'sentDate'> & { sentDate: any };
                const recipientDocRef = doc(firestore, 'users', letterData.recipientId);
                const recipientDocSnap = await getDoc(recipientDocRef);
                const recipientName = recipientDocSnap.exists() ? recipientDocSnap.data().username : 'Unknown';

                return {
                    ...letterData,
                    id: letterDoc.id,
                    sentDate: letterData.sentDate.toDate ? letterData.sentDate.toDate() : new Date(letterData.sentDate),
                    recipientName: recipientName
                } as SentLetterWithRecipient;
            });

            const fetchedLetters = await Promise.all(fetchedLettersPromises);
            fetchedLetters.sort((a, b) => b.sentDate.getTime() - a.sentDate.getTime());
            
            setSentLetters(fetchedLetters);
        } catch (error) {
            console.error("Error fetching sent letters:", error);
            toast({
                title: "Failed to load sent letters",
                variant: "destructive"
            });
        } finally {
            setIsLettersLoading(false);
        }
    };

    fetchSentLetters();

    return () => {
      unsubscribeProfile();
    };
  }, [user, isUserLoading, router, toast, firestore]);

  const handleLogout = () => {
    if (!auth) return;
    auth.signOut()
      .then(() => {
        router.push('/login');
      })
      .catch((error) => {
        console.error("Logout error:", error);
        toast({
          title: 'Logout Failed',
          description: 'An error occurred while signing out. Please try again.',
          variant: 'destructive',
        });
      });
  };

  const copyFriendCode = () => {
    if (userProfile?.friendCode) {
      navigator.clipboard.writeText(userProfile.friendCode).then(() => {
        toast({
          title: 'Copied!',
          description: 'Friend code copied to clipboard.',
        });
      });
    }
  };

  const handleNotificationTimeChange = async (value: string) => {
    if (!user || !firestore) return;

    const userDocRef = doc(firestore, 'users', user.uid);
    try {
      await updateDoc(userDocRef, { notificationTime: value });
      toast({
        title: 'Preference Saved',
        description: `Your notification time has been updated to ${value}.`,
      });
    } catch (error) {
      console.error("Error updating notification time:", error);
      toast({
        title: 'Update Failed',
        description: 'Could not save your notification preference.',
        variant: 'destructive',
      });
    }
  };
  
  const handleLetterDeleted = (letterId: string) => {
    setSentLetters(prevLetters => prevLetters.filter(letter => letter.id !== letterId));
  };


  if (isUserLoading || !userProfile) {
    return (
      <div className="flex justify-center items-center h-screen">
        <Loader2 className="h-8 w-8 animate-spin" />
      </div>
    );
  }

  const { username, email, friendCode, friends, friendRequestReceived, notificationTime, avatar, avatarColor } = userProfile;
  const friendRequestCount = friendRequestReceived?.length || 0;

  return (
    <main className="container mx-auto max-w-4xl py-8 px-4">
       <div className="flex flex-col items-center text-center mb-8">
            <Avatar className="w-32 h-32 border-4 border-background">
              {avatar && <AvatarImage src={avatar} alt={username} />}
              <AvatarFallback 
                className="text-5xl text-black"
                style={{ backgroundColor: avatarColor }}
              >
                  {username?.charAt(0).toUpperCase()}
              </AvatarFallback>
            </Avatar>
            <h1 className="text-3xl font-bold mt-4">{username}</h1>
            <div className="flex items-center gap-2 mt-2">
                <span className="text-muted-foreground font-mono">{friendCode}</span>
                <Button variant="ghost" size="icon" className="h-7 w-7" onClick={copyFriendCode}>
                    <Copy className="h-4 w-4"/>
                </Button>
            </div>
        </div>

      <Tabs defaultValue="profile" className="w-full">
        <TabsList className="grid w-full grid-cols-2">
          <TabsTrigger value="profile">Profile Details</TabsTrigger>
          <TabsTrigger value="letters">Sent Letters</TabsTrigger>
        </TabsList>
        <TabsContent value="profile">
            <div className="grid md:grid-cols-2 gap-8 mt-6">
                <Card>
                    <CardHeader>
                        <CardTitle>Account</CardTitle>
                    </CardHeader>
                    <CardContent className="space-y-4">
                        <div className="flex justify-between items-center border-b pb-4">
                            <span className="font-medium">Email</span>
                            <span className="text-muted-foreground">{email}</span>
                        </div>
                        <div className='pt-2'>
                          <Button variant="outline" className="w-full" onClick={handleLogout}>
                              <LogOut className="mr-2 h-4 w-4" />
                              Logout
                          </Button>
                        </div>
                    </CardContent>
                </Card>
                <Card>
                    <CardHeader>
                        <CardTitle>Notification Preferences</CardTitle>
                        <CardDescription>Choose when to get your daily summary.</CardDescription>
                    </CardHeader>
                    <CardContent>
                        <div className="flex justify-between items-center">
                            <span className="font-medium">Daily Notification Time</span>
                            <Select
                                onValueChange={handleNotificationTimeChange}
                                defaultValue={notificationTime}
                            >
                                <SelectTrigger className="w-[180px]">
                                    <SelectValue placeholder="Select a time" />
                                </SelectTrigger>
                                <SelectContent position="item-aligned">
                                    {timeOptions.map(time => (
                                        <SelectItem key={time} value={time}>{time}</SelectItem>
                                    ))}
                                </SelectContent>
                            </Select>
                        </div>
                    </CardContent>
                </Card>

                <Card>
                    <CardHeader>
                        <CardTitle>Friends ({friends?.length || 0})</CardTitle>
                    </CardHeader>
                    <CardContent>
                        <div className="flex items-center justify-between">
                            <div className="flex -space-x-4">
                            {friends && friends.length > 0 ? friends.slice(0, 5).map((friendId, i) => (
                                <Avatar key={i} className="border-2 border-background">
                                <AvatarFallback className="bg-gray-200">
                                    <User className="h-5 w-5 text-gray-400" />
                                </AvatarFallback>
                                </Avatar>
                            )) : <p className="text-sm text-muted-foreground">No friends yet. Go add some!</p>}
                            {friends && friends.length > 5 && (
                            <Avatar className="border-2 border-background">
                                <AvatarFallback>+{friends.length - 5}</AvatarFallback>
                            </Avatar>
                            )}
                            </div>
                            <Button variant="ghost" size="icon" onClick={() => router.push('/friends/list')}>
                                <ChevronRight className="h-6 w-6 text-gray-400" />
                            </Button>
                        </div>
                    </CardContent>
                </Card>
                <Card>
                    <CardHeader>
                        <CardTitle>Friend Requests ({friendRequestCount || 0})</CardTitle>
                    </CardHeader>
                    <CardContent>
                        <div className="flex items-center justify-between">
                             <div className="flex items-center gap-2">
                               {friendRequestCount > 0 ? (
                                    <p className="text-sm text-muted-foreground">You have {friendRequestCount} new request{friendRequestCount > 1 && 's'}!</p>
                               ) : (
                                    <p className="text-sm text-muted-foreground">No new requests.</p>
                               )}
                            </div>
                            <Button variant="ghost" size="icon" onClick={() => router.push('/friends')}>
                                <ChevronRight className="h-6 w-6 text-gray-400" />
                            </Button>
                        </div>
                    </CardContent>
                </Card>
            </div>
        </TabsContent>
        <TabsContent value="letters">
            <Card>
                <CardHeader>
                    <CardTitle>Your Sent Letters</CardTitle>
                    <CardDescription>A history of all the letters you've sent.</CardDescription>
                </CardHeader>
                <CardContent>
                    {isLettersLoading ? (
                        <div className="flex justify-center py-12">
                            <Loader2 className="h-8 w-8 animate-spin" />
                        </div>
                    ) : sentLetters.length > 0 ? (
                        <div className="space-y-4">
                            {sentLetters.map((letter) => (
                                <VoiceLetterCard 
                                    key={letter.id} 
                                    letter={letter} 
                                    senderName={userProfile?.username} 
                                    recipientName={letter.recipientName} 
                                    viewContext="sent" 
                                    onLetterDeleted={handleLetterDeleted}
                                />
                            ))}
                        </div>
                    ) : (
                        <div className="text-center py-12 px-6 border-2 border-dashed rounded-lg">
                            <Send className="mx-auto h-12 w-12 text-muted-foreground" />
                            <h3 className="mt-4 text-lg font-medium">No Sent Letters Yet</h3>
                            <p className="mt-1 text-sm text-muted-foreground">
                                When you send a letter, it will appear here.
                            </p>
                        </div>
                    )}
                </CardContent>
            </Card>
        </TabsContent>
      </Tabs>
    </main>
  );
}
