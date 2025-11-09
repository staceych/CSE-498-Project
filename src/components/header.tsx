'use client';

import Link from 'next/link';
import { usePathname } from 'next/navigation';
import { User, Mail, Users, Mailbox } from 'lucide-react';
import { Button } from '@/components/ui/button';

export default function Header() {
  const pathname = usePathname();
  const publicPaths = ['/login', '/signup', '/forgot-password'];
  const isPublicPage = publicPaths.includes(pathname);

  return (
    <header className="fixed top-0 left-0 right-0 z-50 bg-background border-b">
      <div className="container mx-auto flex items-center justify-between h-16 px-4">
        <Link href="/" className="flex items-center gap-2 font-bold text-lg font-headline">
          <span className="text-primary">VoiceMail</span>
        </Link>
        {!isPublicPage && (
          <nav className="flex items-center gap-1 sm:gap-2">
            
            {/* Mailbox icon now links to Inbox */}
            <Button variant="ghost" asChild size="icon">
              <Link href="/inbox" className="flex items-center gap-2">
                <Mailbox className="h-5 w-5" />
                <span className="sr-only">Inbox</span>
              </Link>
            </Button>

            {/* Mail icon (envelope) now links to Compose */}
            <Button variant="ghost" asChild size="icon">
              <Link href="/compose" className="flex items-center gap-2">
                <Mail className="h-5 w-5" />
                <span className="sr-only">Compose</span>
              </Link>
            </Button>

            <Button variant="ghost" asChild size="icon">
              <Link href="/friends" className="flex items-center gap-2">
                <Users className="h-5 w-5" />
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
        )}
      </div>
    </header>
  );
}
