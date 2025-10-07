'use client';

import { useState, useEffect } from 'react';
import { useRouter } from 'next/navigation';
import { LogOut, User, Bell, Palette, ChevronRight, Loader2 } from 'lucide-react';
import { Button } from '@/components/ui/button';
import { Card, CardContent, CardHeader, CardTitle, CardDescription } from '@/components/ui/card';
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

  const getInitials = (username: string) => {
    return username.charAt(0).toUpperCase();
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
    <main className="container mx-auto max-w-2xl py-8 px-4">
      <div className="text-center mb-8">
        <h1 className="text-4xl font-headline font-bold text-primary">Profile & Settings</h1>
        <p className="mt-2 text-lg text-muted-foreground">Manage your account and preferences.</p>
      </div>

      <Card>
        <CardHeader className="flex flex-row items-center gap-4">
          <Avatar className="h-16 w-16">
            {/* In a real app, this would come from the user's profile */}
            <AvatarImage src={`https://i.pravatar.cc/150?u=${username}`} alt={username} />
            <AvatarFallback className="text-2xl">{getInitials(username)}</AvatarFallback>
          </Avatar>
          <div>
            <CardTitle className="text-2xl">{username}</CardTitle>
            <CardDescription>{user?.email}</CardDescription>
          </div>
        </CardHeader>
        <CardContent className="space-y-6 pt-6">
          <div className="space-y-4">
            <h3 className="text-lg font-medium flex items-center"><Bell className="mr-2 h-5 w-5" /> Notifications</h3>
            <div className="flex items-center justify-between rounded-md border p-4">
              <p className="text-sm">Email Notifications</p>
              <Switch defaultChecked />
            </div>
             <div className="flex items-center justify-between rounded-md border p-4">
              <p className="text-sm">Push Notifications</p>
              <Switch />
            </div>
          </div>

          <Separator />

          <div className="space-y-4">
            <h3 className="text-lg font-medium flex items-center"><Palette className="mr-2 h-5 w-5" /> Appearance</h3>
            <button className="flex items-center justify-between w-full rounded-md border p-4 text-left hover:bg-accent transition-colors">
              <p className="text-sm">Theme</p>
              <div className="flex items-center text-sm text-muted-foreground">
                <span>Light</span>
                <ChevronRight className="h-4 w-4 ml-1" />
              </div>
            </button>
          </div>

          <Separator />
          
          <Button variant="outline" className="w-full" onClick={handleLogout}>
            <LogOut className="mr-2 h-4 w-4" />
            Logout
          </Button>

        </CardContent>
      </Card>
    </main>
  );
}
