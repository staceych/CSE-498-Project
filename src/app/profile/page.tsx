
'use client';

import { useState, useEffect, useRef, ChangeEvent } from 'react';
import { useRouter } from 'next/navigation';
import { LogOut, ChevronRight, Loader2, Copy, Bell, Edit, Check, X, Camera } from 'lucide-react';
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
import { Input } from '@/components/ui/input';
import { updateUsername, uploadProfilePicture } from '@/lib/user';
import AvatarUploadDialog from '@/components/avatar-upload-dialog';

type UserProfile = {
  username: string;
  email: string;
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

  const [isEditingUsername, setIsEditingUsername] = useState(false);
  const [newUsername, setNewUsername] = useState('');
  const [isUpdatingUsername, setIsUpdatingUsername] = useState(false);

  const [selectedFile, setSelectedFile] = useState<File | null>(null);
  const [previewUrl, setPreviewUrl] = useState<string | null>(null);
  const [isUploading, setIsUploading] = useState(false);
  const fileInputRef = useRef<HTMLInputElement>(null);

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
        const profileData = docSnap.data() as UserProfile;
        setUserProfile(profileData);
        setNewUsername(profileData.username);
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

  const handleUsernameUpdate = async () => {
    if (!user || !firestore || !userProfile) return;
    if (newUsername.trim() === '' || newUsername === userProfile.username) {
      setIsEditingUsername(false);
      return;
    }

    setIsUpdatingUsername(true);
    try {
      await updateUsername(firestore, user.uid, newUsername);
      toast({
        title: 'Username Updated',
        description: `Your username has been changed to ${newUsername}.`,
      });
      setIsEditingUsername(false);
    } catch (error: any) {
      toast({
        title: 'Update Failed',
        description: error.message,
        variant: 'destructive',
      });
    } finally {
      setIsUpdatingUsername(false);
    }
  };

  const handleAvatarClick = () => {
    fileInputRef.current?.click();
  };

  const handleFileChange = (event: ChangeEvent<HTMLInputElement>) => {
    const file = event.target.files?.[0];
    if (file) {
      if (file.size > 5 * 1024 * 1024) {
        toast({
          title: 'File too large',
          description: 'Please select an image smaller than 5MB.',
          variant: 'destructive',
        });
        return;
      }
      setSelectedFile(file);
      setPreviewUrl(URL.createObjectURL(file));
    }
  };

  const handleUploadConfirm = async () => {
    if (!selectedFile || !user || !firestore) return;

    setIsUploading(true);
    try {
      await uploadProfilePicture(firestore, user.uid, selectedFile);
      toast({
        title: 'Avatar Updated',
        description: 'Your new profile picture has been saved.',
      });
    } catch (error: any) {
      toast({
        title: 'Upload Failed',
        description: error.message || 'Could not upload your profile picture. Check security rules and try again.',
        variant: 'destructive',
      });
    } finally {
      setIsUploading(false);
      setSelectedFile(null);
      setPreviewUrl(null);
    }
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
    <>
    <main className="container mx-auto max-w-4xl py-8 px-4">
       <div className="flex flex-col items-center text-center mb-8">
            <div className="relative group">
              <input
                type="file"
                ref={fileInputRef}
                onChange={handleFileChange}
                className="hidden"
                accept="image/png, image/jpeg, image/gif"
              />
              <Avatar className="w-32 h-32 border-4 border-background cursor-pointer" onClick={handleAvatarClick}>
                {avatar && <AvatarImage src={avatar} alt={username} />}
                <AvatarFallback 
                  className="text-5xl"
                  style={{ backgroundColor: avatarColor }}
                >
                    {username?.charAt(0).toUpperCase()}
                </AvatarFallback>
              </Avatar>
              <div className="absolute inset-0 bg-black/50 rounded-full flex items-center justify-center opacity-0 group-hover:opacity-100 transition-opacity cursor-pointer" onClick={handleAvatarClick}>
                  <Camera className="w-8 h-8 text-white" />
              </div>
            </div>
            <div className="relative mt-4">
              {!isEditingUsername ? (
                <div className="flex items-center gap-2">
                  <h1 className="text-3xl font-bold">{username}</h1>
                  <Button variant="ghost" size="icon" className="h-8 w-8" onClick={() => setIsEditingUsername(true)}>
                    <Edit className="h-5 w-5" />
                  </Button>
                </div>
              ) : (
                <div className="flex items-center gap-2">
                  <Input 
                    value={newUsername} 
                    onChange={(e) => setNewUsername(e.target.value)} 
                    className="text-xl h-10"
                    disabled={isUpdatingUsername}
                  />
                  <Button size="icon" className="h-10 w-10" onClick={handleUsernameUpdate} disabled={isUpdatingUsername}>
                    {isUpdatingUsername ? <Loader2 className="h-5 w-5 animate-spin" /> : <Check className="h-5 w-5" />}
                  </Button>
                  <Button variant="ghost" size="icon" className="h-10 w-10" onClick={() => { setIsEditingUsername(false); setNewUsername(username); }} disabled={isUpdatingUsername}>
                    <X className="h-5 w-5" />
                  </Button>
                </div>
              )}
            </div>
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
                        <button className="flex items-center justify-between w-full text-left" onClick={() => router.push('/friends/list')}>
                            <div className="text-sm text-muted-foreground">View your friends</div>
                            <ChevronRight className="h-6 w-6 text-gray-400" />
                        </button>
                    </CardContent>
                </Card>
                <Card>
                    <CardHeader>
                        <CardTitle>Friend Requests ({friendRequestCount || 0})</CardTitle>
                    </CardHeader>
                    <CardContent>
                        <button className="flex items-center justify-between w-full text-left" onClick={() => router.push('/friends')}>
                             <div className="flex items-center gap-2">
                               {friendRequestCount > 0 ? (
                                    <p className="text-sm text-primary font-semibold flex items-center"><Bell className="h-4 w-4 mr-1"/>You have {friendRequestCount} new request{friendRequestCount > 1 && 's'}!</p>
                               ) : (
                                    <p className="text-sm text-muted-foreground">No new requests.</p>
                               )}
                            </div>
                            <ChevronRight className="h-6 w-6 text-gray-400" />
                        </button>
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

    <AvatarUploadDialog
        isOpen={!!previewUrl}
        onOpenChange={(isOpen) => {
            if (!isOpen) {
                setPreviewUrl(null);
                setSelectedFile(null);
            }
        }}
        previewUrl={previewUrl}
        isUploading={isUploading}
        onConfirm={handleUploadConfirm}
    />
    </>
  );
}

    