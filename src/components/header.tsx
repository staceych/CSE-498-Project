'use client';

import Link from 'next/link';
import { User, Mail, ListChecks } from 'lucide-react';
import { Button } from '@/components/ui/button';

export default function Header() {

  return (
    <header className="fixed top-0 left-0 right-0 z-50 bg-background border-b">
      <div className="container mx-auto flex items-center justify-between h-16 px-4">
        <Link href="/" className="flex items-center gap-2 font-bold text-lg font-headline">
          <span className="text-primary">VoiceMail</span>
        </Link>
        <nav className="flex items-center gap-1 sm:gap-2">
          <Button variant="ghost" asChild size="icon">
            <Link href="/" className="flex items-center gap-2">
              <Mail className="h-5 w-5" />
              <span className="sr-only">Home</span>
            </Link>
          </Button>
          <Button variant="ghost" asChild size="icon">
            <Link href="/friends" className="flex items-center gap-2">
              <ListChecks className="h-5 w-5" />
               <span className="sr-only">Friends</span>
            </Link>
          </Button>
           <Button variant="ghost" asChild size="icon">
            <Link href="/profile" className="flex items-center gap-2">
              <User className="h-5 w-5" />
              <span className="sr-only">Profile</span>
            </Link>
          </Button>
        </nav>
      </div>
    </header>
  );
}
