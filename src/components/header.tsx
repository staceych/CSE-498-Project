'use client';

import Link from 'next/link';
import { Home, Users, User, Mail } from 'lucide-react';
import { Button } from '@/components/ui/button';

export default function Header() {

  return (
    <header className="fixed top-0 left-0 right-0 z-50 bg-background border-b">
      <div className="container mx-auto flex items-center justify-between h-16 px-4">
        <Link href="/" className="flex items-center gap-2 text-primary font-bold text-lg">
          <Mail className="h-6 w-6" />
          <span className="hidden sm:inline">VoiceMail</span>
        </Link>
        <nav className="flex items-center gap-1 sm:gap-2">
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
           <Button variant="ghost" asChild>
            <Link href="/profile" className="flex items-center gap-2">
              <User className="h-4 w-4" />
              <span className="hidden sm:inline">Profile</span>
            </Link>
          </Button>
        </nav>
      </div>
    </header>
  );
}
