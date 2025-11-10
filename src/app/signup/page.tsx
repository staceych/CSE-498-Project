
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
import { useState } from 'react';
import { Loader2 } from 'lucide-react';
import Link from 'next/link';
import { useRouter } from 'next/navigation';
import { createUserWithEmailAndPassword } from 'firebase/auth';
import { doc, setDoc, getDoc, collection, serverTimestamp } from "firebase/firestore"; 
import { auth, db } from '@/lib/firebase';
import { useToast } from '@/hooks/use-toast';
import type { VoiceLetter } from '@/lib/letters';

// Function to generate a random light hex color
const getRandomColor = () => {
  const letters = 'BCDEF'.split('');
  let color = '#';
  for (let i = 0; i < 6; i++) {
    color += letters[Math.floor(Math.random() * letters.length)];
  }
  return color;
};


export default function SignUpPage() {
  const [username, setUsername] = useState('');
  const [email, setEmail] = useState('');
  const [password, setPassword] = useState('');
  const [confirmPassword, setConfirmPassword] = useState('');
  const [isLoading, setIsLoading] = useState(false);
  const router = useRouter();
  const { toast } = useToast();

  const handleSignUp = async (e: React.FormEvent) => {
    e.preventDefault();
    if (password !== confirmPassword) {
      toast({
        title: "Passwords don't match!",
        variant: 'destructive',
      });
      return;
    }
    setIsLoading(true);

    try {
      const userCredential = await createUserWithEmailAndPassword(auth, email, password);
      const user = userCredential.user;
      
      const friendCode = user.uid.substring(0, 6).toUpperCase();
      const avatarColor = getRandomColor();

      // Create the user profile document
      await setDoc(doc(db, "users", user.uid), {
        username: username,
        email: email,
        friendCode: friendCode,
        friends: [],
        friendRequestReceived: [],
        friendRequestSent: [],
        avatarColor: avatarColor,
        enableTranscripts: false, // Default to false
      });

// --- Create a copy of the welcome letter for the new user ---
      const masterLetterId = 'xoyahNSWNoDgKanJCADb';
      const masterLetterRef = doc(db, 'letters', masterLetterId);
      const masterLetterSnap = await getDoc(masterLetterRef);

      if (masterLetterSnap.exists()) {
        const masterLetterData = masterLetterSnap.data() as Omit<VoiceLetter, 'id'|'recipientId'>;
        const newLetterRef = doc(collection(db, 'letters'));
        
        // --- THIS IS THE CORRECTED SETDOC ---
        await setDoc(newLetterRef, {
          ...masterLetterData,
          id: newLetterRef.id, // <-- FIX: Set the ID to the NEW document's ID
          recipientId: user.uid, // Set the new user as the recipient
          sentDate: serverTimestamp(), // Set the sent date to now
          isRead: false,
          // Note: The old 'id' and 'recipientId' from masterLetterData
          // are now correctly overwritten.
        });
        // --- End of correction ---

      } else {
        // This is the error-throwing logic we discussed, which is good to keep
        console.error(`CRITICAL: Master welcome letter with ID ${masterLetterId} not found.`);
        throw new Error('permission-denied'); 
      }
      // --- End of welcome letter logic ---

      toast({
        title: 'Account Created!',
        description: 'You can now log in with your new account.',
      });
      router.push('/login');

    } catch (error: any) {
      const errorCode = error.code;
      const errorMessage = error.message;
      console.error('Sign up error:', errorCode, errorMessage);
      let userFriendlyMessage = "An unexpected error occurred.";

      switch (errorCode) {
        case 'auth/invalid-email':
          userFriendlyMessage = 'Please enter a valid email address.';
          break;
        case 'auth/email-already-in-use':
            userFriendlyMessage = 'This email is already in use. Please use another one or log in.';
            break;
        case 'auth/weak-password':
            userFriendlyMessage = 'Password should be at least 6 characters.';
            break;
        case 'permission-denied':
            userFriendlyMessage = 'Could not create user profile. Please check Firestore security rules.';
            break;
        default:
            userFriendlyMessage = 'An unexpected sign-up error occurred. Please try again.';
            break;
      }

      toast({
        title: 'Sign-up Failed',
        description: userFriendlyMessage,
        variant: 'destructive',
      });
    } finally {
      setIsLoading(false);
    }
  };

  return (
    <main className="flex flex-col items-center justify-center min-h-screen p-4">
      <div className="text-center mb-8">
        <h1 className="text-5xl font-headline font-bold text-gray-800">Create Your Account</h1>
      </div>

      <div className="relative w-full max-w-md">
        <Card className="relative z-20 w-full shadow-lg rounded-lg border-2 border-gray-200">
          <CardHeader>
            <div className="flex justify-between items-baseline">
              <CardTitle className="text-3xl font-bold">Sign Up</CardTitle>
              <CardDescription>
                Already have an account?{' '}
                <Link href="/login" className="text-primary hover:underline">
                  Log in!
                </Link>
              </CardDescription>
            </div>
          </CardHeader>
          <form onSubmit={handleSignUp}>
            <CardContent className="space-y-6">
               <div className="space-y-2">
                <Label htmlFor="username">Username</Label>
                <Input
                  id="username"
                  type="text"
                  required
                  value={username}
                  onChange={(e) => setUsername(e.target.value)}
                  disabled={isLoading}
                  className="bg-white"
                  autoComplete="username"
                />
              </div>
              <div className="space-y-2">
                <Label htmlFor="email">Email</Label>
                <Input
                  id="email"
                  type="email"
                  required
                  value={email}
                  onChange={(e) => setEmail(e.target.value)}
                  disabled={isLoading}
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
                  disabled={isLoading}
                  className="bg-white"
                  autoComplete="new-password"
                />
              </div>
              <div className="space-y-2">
                <Label htmlFor="confirm-password">Confirm Password</Label>
                <Input
                  id="confirm-password"
                  type="password"
                  required
                  value={confirmPassword}
                  onChange={(e) => setConfirmPassword(e.target.value)}
                  disabled={isLoading}
                  className="bg-white"
                  autoComplete="new-password"
                />
              </div>
              <Button className="w-full text-lg" type="submit" disabled={isLoading}>
                {isLoading && <Loader2 className="mr-2 h-4 w-4 animate-spin" />}
                Create Account
              </Button>
            </CardContent>
          </form>
        </Card>

        {/* Envelope */}
        <div className="absolute top-1/2 left-0 w-full h-1/2 pt-4">
            {/* Back part of the envelope */}
            <div className="absolute bottom-0 left-0 w-full h-full bg-white border-2 border-gray-800 rounded-t-lg"
                 style={{ clipPath: 'polygon(0 0, 100% 0, 100% 100%, 50% 50%, 0 100%)' }}
            />
            {/* Top flap */}
            <div className="absolute top-0 left-0 w-full h-1/2 bg-white border-b-2 border-gray-800"
                 style={{ clipPath: 'polygon(0 0, 100% 0, 50% 100%)' }}
            >
                <div className="absolute top-0 left-0 w-full h-full border-t-2 border-l-2 border-r-2 border-gray-800"
                    style={{ clipPath: 'polygon(0 0, 100% 0, 50% 100%)' }}
                />
            </div>
             {/* Left flap inner shadow */}
             <div className="absolute bottom-0 left-0 w-1/2 h-1/2 bg-gray-200"
                  style={{ clipPath: 'polygon(100% 0, 0 100%, 0 0)'}}
             />
             {/* Right flap inner shadow */}
             <div className="absolute bottom-0 right-0 w-1/2 h-1/2 bg-gray-200"
                  style={{ clipPath: 'polygon(0 0, 100% 0, 100% 100%)'}}
             />
        </div>
      </div>
    </main>
  );
}
