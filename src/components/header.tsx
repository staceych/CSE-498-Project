'use client';

import Link from 'next/link';
import { useRouter } from 'next/navigation';
import { Home, Users, LogOut, Mail } from 'lucide-react';
import { Button } from '@/components/ui/button';
import { auth } from '@/lib/firebase';
import { useToast } from '@/hooks/use-toast';

export default function Header() {
  const router = useRouter();
  const { toast } = useToast();

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

  return (
    <header className="fixed top-0 left-0 right-0 z-50 bg-background border-b">
      <div className="container mx-auto flex items-center justify-between h-16 px-4">
        <Link href="/" className="flex items-center gap-2 text-primary font-bold text-lg">
          <Mail className="h-6 w-6" />
          <span className="hidden sm:inline">VoiceMail</span>
        </Link>
        <nav className="flex items-center gap-2 sm:gap-4">
          <Button variant="ghost" asChild>
            <Link href="/" className="flex items-center gap-2">
              <Home className="h-4 w-4" />
              <span className="hidden sm:inline">Home</span>
            </Link>
          </Button>
          <Button variant="ghost" asChild>
            <Link href="/friends" className="flex items-center gap-2">
              <Users className="h-4 w-4" />
              <span className="hidden sm:inline">Friends</span>
            </Link>
          </Button>
          <Button variant="outline" size="sm" onClick={handleLogout}>
            <LogOut className="h-4 w-4 sm:mr-2" />
            <span className="hidden sm:inline">Logout</span>
          </Button>
        </nav>
      </div>
    </header>
  );
}
