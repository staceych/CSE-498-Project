
'use client';

import { Button } from '@/components/ui/button';
import {
  Card,
  CardContent,
  CardDescription,
  CardHeader,
  CardTitle,
} from '@/components/ui/card';
import { Input } from '@/components/ui/input';
import { Label } from '@/components/ui/label';
import { Checkbox } from '@/components/ui/checkbox';
import { useState, useEffect } from 'react';
import { Loader2 } from 'lucide-react';
import Link from 'next/link';
import { useRouter } from 'next/navigation';
import { signInWithEmailAndPassword, onAuthStateChanged, setPersistence, browserLocalPersistence, browserSessionPersistence } from 'firebase/auth';
import { auth } from '@/lib/firebase';
import { useToast } from '@/hooks/use-toast';


export default function LoginPage() {
  const [email, setEmail] = useState('');
  const [password, setPassword] = useState('');
  const [keepSignedIn, setKeepSignedIn] = useState(true);
  const [isLoading, setIsLoading] = useState(true); // Start as true to handle initial auth check
  const [isSigningInWithEmail, setIsSigningInWithEmail] = useState(false);
  const router = useRouter();
  const { toast } = useToast();

  useEffect(() => {
    const unsubscribe = onAuthStateChanged(auth, (user) => {
      if (user) {
        router.push('/inbox');
      } else {
        setIsLoading(false);
      }
    });

    return () => unsubscribe();
  }, [router]);
  
  const handleLogin = async (e: React.FormEvent) => {
    e.preventDefault();
    setIsSigningInWithEmail(true);

    try {
      // Set session persistence based on the checkbox
      const persistence = keepSignedIn ? browserLocalPersistence : browserSessionPersistence;
      await setPersistence(auth, persistence);
      
      await signInWithEmailAndPassword(auth, email, password);
      router.push('/inbox');
    } catch (error: any) {
      if (error.code === 'auth/wrong-password' || error.code === 'auth/user-not-found' || error.code === 'auth/invalid-credential' || error.code === 'auth/invalid-email') {
         toast({
          title: 'Login Failed',
          description: 'Invalid email or password.',
          variant: 'destructive',
        });
      } else {
         toast({
          title: 'Login Failed',
          description: 'An unexpected error occurred. Please try again.',
          variant: 'destructive',
        });
      }
    } finally {
        setIsSigningInWithEmail(false);
    }
  };
  
  if (isLoading) {
    return (
        <div className="flex justify-center items-center h-screen">
            <Loader2 className="h-8 w-8 animate-spin" />
        </div>
    )
  }

  return (
    <main className="flex flex-col items-center justify-center min-h-screen p-4">
      <div className="text-center mb-8">
        <h1 className="text-5xl font-headline font-bold text-gray-800">Welcome to VoiceMail</h1>
      </div>

      <div className="relative w-full max-w-md">
        <Card className="relative z-20 w-full shadow-lg rounded-lg border-2 border-gray-200">
          <CardHeader>
            <div className="flex justify-between items-baseline">
              <CardTitle className="text-3xl font-bold">Login</CardTitle>
              <CardDescription>
                Don&apos;t have an account?{' '}
                <Link href="/signup" className="text-primary hover:underline">
                  Sign up!
                </Link>
              </CardDescription>
            </div>
          </CardHeader>
          <CardContent className="space-y-4">
            <form onSubmit={handleLogin} className="space-y-4">
              <div className="space-y-2">
                <Label htmlFor="email">Email</Label>
                <Input
                  id="email"
                  type="email"
                  required
                  value={email}
                  onChange={(e) => setEmail(e.target.value)}
                  disabled={isSigningInWithEmail}
                  className="bg-white"
                  autoComplete="email"
                />
              </div>
              <div className="space-y-2">
                <Label htmlFor="password">Password</Label>
                <Input
                  id="password"
                  type="password"
                  required
                  value={password}
                  onChange={(e) => setPassword(e.target.value)}
                  disabled={isSigningInWithEmail}
                  className="bg-white"
                  autoComplete="current-password"
                />
              </div>
              <Button className="w-full" type="submit" disabled={isSigningInWithEmail}>
                {isSigningInWithEmail && <Loader2 className="mr-2 h-4 w-4 animate-spin" />}
                Log In
              </Button>
              <div className="flex items-center justify-between mt-4">
                <div className="flex items-center space-x-2">
                    <Checkbox 
                        id="keep-signed-in"
                        checked={keepSignedIn}
                        onCheckedChange={() => setKeepSignedIn(!keepSignedIn)}
                    />
                    <Label htmlFor="keep-signed-in" className="text-sm font-medium leading-none peer-disabled:cursor-not-allowed peer-disabled:opacity-70">
                        Keep me signed in
                    </Label>
                </div>
                <Link href="/forgot-password" passHref className="text-sm text-primary hover:underline">
                    Forgot your password?
                </Link>
              </div>
            </form>
          </CardContent>
        </Card>
      </div>
    </main>
  );
}