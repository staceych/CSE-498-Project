'use client';

import { usePathname } from 'next/navigation';
import Header from '@/components/header';

export default function ConditionalHeader() {
  const pathname = usePathname();
  const publicPaths = ['/login', '/signup'];
  const isPublicPage = publicPaths.includes(pathname);

  if (isPublicPage) {
    return null;
  }

  return (
    <>
      <Header />
      <div className="pt-16" />
    </>
  );
}
