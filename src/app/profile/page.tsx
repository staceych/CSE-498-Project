'use client';

import { useState, useEffect } from 'react';
import { useRouter } from 'next/navigation';
import { LogOut, User, Bell, Palette, ChevronRight, Loader2, UserCircle2 } from 'lucide-react';
import { Button } from '@/components/ui/button';
import { Avatar, AvatarFallback, AvatarImage } from '@/components/ui/avatar';
import { Switch } from '@/components/ui/switch';
import { Separator } from '@/components/ui/separator';
import { useToast } from '@/hooks/use-toast';
import { auth } from '@/lib/firebase';
import type { User as FirebaseUser } from 'firebase/auth';

export default function ProfilePage() {
  const [user, setUser] = useState<FirebaseUser | null>(null);
  const [isLoading, setIsLoading] = useState(true);
  const router = useRouter();
  const { toast } = useToast();

  useEffect(() => {
    const unsubscribe = auth.onAuthStateChanged((currentUser) => {
      if (currentUser) {
        setUser(currentUser);
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

  const getUsername = (email: string | null | undefined) => {
    if (!email) return 'User';
    return email.split('@')[0];
  };

  if (isLoading) {
    return (
      <div className="flex justify-center items-center h-screen">
        <Loader2 className="h-8 w-8 animate-spin" />
      </div>
    );
  }

  const username = getUsername(user?.email);

  return (
    <main className="container mx-auto max-w-4xl py-8 px-4">
      <h1 className="text-xl font-semibold text-muted-foreground mb-6">Personal Profile</h1>
      <div className="grid grid-cols-1 md:grid-cols-3 gap-8 md:gap-12">
        <div className="md:col-span-1 flex flex-col items-center text-center">
          <UserCircle2 className="w-40 h-40 text-gray-300" strokeWidth={1} />
          <h2 className="text-2xl font-bold mt-4">Friends</h2>
          <div className="flex items-center gap-2 mt-4">
            <div className="flex -space-x-4">
              {[...Array(5)].map((_, i) => (
                <Avatar key={i} className="border-2 border-background">
                  <AvatarFallback className="bg-gray-200">
                    <User className="h-5 w-5 text-gray-400" />
                  </AvatarFallback>
                </Avatar>
              ))}
            </div>
            <ChevronRight className="h-6 w-6 text-gray-400" />
          </div>
        </div>

        <div className="md:col-span-2">
          <div className="bg-accent/50 rounded-lg p-6 relative">
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
                <span className="font-medium">Transcripts On</span>
                <Switch defaultChecked />
              </div>
              <div className="flex justify-between items-center">
                <span className="font-medium">Friend Link</span>
                <span className="text-muted-foreground">{username}.link</span>
              </div>
            </div>
          </div>
          <Button variant="outline" className="w-full mt-8" onClick={handleLogout}>
            <LogOut className="mr-2 h-4 w-4" />
            Logout
          </Button>
        </div>
      </div>
    </main>
  );
}
