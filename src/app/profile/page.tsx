
'use client';

import { useState, useEffect } from 'react';
import { useRouter } from 'next/navigation';
import { LogOut, User, ChevronRight, Loader2, UserCircle2 } from 'lucide-react';
import { Button } from '@/components/ui/button';
import { Avatar, AvatarFallback } from '@/components/ui/avatar';
import { Switch } from '@/components/ui/switch';
import { useToast } from '@/hooks/use-toast';
import { auth, db } from '@/lib/firebase';
import { doc, getDoc } from "firebase/firestore";
import type { User as FirebaseUser } from 'firebase/auth';
import { Card, CardContent, CardHeader, CardTitle } from '@/components/ui/card';

type UserProfile = {
  username: string;
  friendLink: string;
  friends: string[];
};

export default function ProfilePage() {
  const [user, setUser] = useState<FirebaseUser | null>(null);
  const [userProfile, setUserProfile] = useState<UserProfile | null>(null);
  const [isLoading, setIsLoading] = useState(true);
  const router = useRouter();
  const { toast } = useToast();

  useEffect(() => {
    const unsubscribe = auth.onAuthStateChanged(async (currentUser) => {
      if (currentUser) {
        setUser(currentUser);
        // Fetch user profile from Firestore
        const userDocRef = doc(db, "users", currentUser.uid);
        const userDoc = await getDoc(userDocRef);
        if (userDoc.exists()) {
          setUserProfile(userDoc.data() as UserProfile);
        }
      } else {
        router.push('/login');
      }
      setIsLoading(false);
    });

    return () => unsubscribe();
  }, [router]);

  const handleLogout = () => {
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

  if (isLoading || !userProfile) {
    return (
      <div className="flex justify-center items-center h-screen">
        <Loader2 className="h-8 w-8 animate-spin" />
      </div>
    );
  }

  const { username, friendLink, friends } = userProfile;

  return (
    <main className="container mx-auto max-w-4xl py-8 px-4">
      <div className="grid md:grid-cols-3 gap-8 mb-8">
        <div className="md:col-span-1 flex flex-col items-center text-center">
            <UserCircle2 className="w-32 h-32 text-gray-300" strokeWidth={1} />
            <h1 className="text-3xl font-bold mt-2">{username}</h1>
        </div>
        
        <div className="md:col-span-2 bg-accent/50 rounded-lg p-6 relative">
            <Button variant="outline" size="sm" className="absolute top-4 right-4 bg-white">Edit</Button>
            <div className="space-y-6">
                <div className="flex justify-between items-center border-b pb-4">
                  <span className="font-medium">Username</span>
                  <span className="text-muted-foreground">{username}</span>
                </div>
                <div className="flex justify-between items-center border-b pb-4">
                  <span className="font-medium">Password</span>
                  <span className="text-muted-foreground">**********</span>
                </div>
                <div className="flex justify-between items-center border-b pb-4">
                  <span className="font-medium">Friend Link</span>
                  <span className="text-muted-foreground">{friendLink}</span>
                </div>
                <div className="flex justify-between items-center">
                  <span className="font-medium">Transcripts On</span>
                  <Switch defaultChecked />
                </div>
                 <Button variant="outline" className="w-full mt-4" onClick={handleLogout}>
                    <LogOut className="mr-2 h-4 w-4" />
                    Logout
                </Button>
            </div>
        </div>
      </div>

      <Card>
          <CardHeader>
              <CardTitle>Friends ({friends.length})</CardTitle>
          </CardHeader>
          <CardContent>
              <div className="flex items-center justify-between">
                  <div className="flex -space-x-4">
                  {friends.slice(0, 5).map((friendId, i) => (
                      <Avatar key={i} className="border-2 border-background">
                      <AvatarFallback className="bg-gray-200">
                          <User className="h-5 w-5 text-gray-400" />
                      </AvatarFallback>
                      </Avatar>
                  ))}
                  {friends.length > 5 && (
                    <Avatar className="border-2 border-background">
                        <AvatarFallback>+{friends.length - 5}</AvatarFallback>
                    </Avatar>
                  )}
                  </div>
                  <Button variant="ghost" size="icon" onClick={() => router.push('/friends')}>
                      <ChevronRight className="h-6 w-6 text-gray-400" />
                  </Button>
              </div>
          </CardContent>
      </Card>
    </main>
  );
}
