
'use client';

import { useState, useEffect } from 'react';
import { collection, query, where, getDocs, doc, getDoc } from 'firebase/firestore';
import { useUser, useFirestore } from '@/firebase';
import { Loader2, Inbox } from 'lucide-react';
import { useRouter } from 'next/navigation';
import type { VoiceLetter } from '@/lib/letters';
import VoiceLetterCard from '@/components/voice-letter-card';
import { Card, CardContent, CardDescription, CardHeader, CardTitle } from '@/components/ui/card';

type LetterWithSender = VoiceLetter & {
    senderName?: string;
};

export default function InboxPage() {
  const { user: currentUser, isUserLoading: isAuthLoading } = useUser();
  const firestore = useFirestore();
  const [letters, setLetters] = useState<LetterWithSender[]>([]);
  const [isLoading, setIsLoading] = useState(true);
  const router = useRouter();

  useEffect(() => {
    if (isAuthLoading) return;
    if (!currentUser) {
      router.push('/login');
      return;
    }
    if (!firestore) return;

    const fetchLettersAndSenders = async () => {
      setIsLoading(true);
      try {
        const lettersQuery = query(
          collection(firestore, 'letters'),
          where('recipientId', '==', currentUser.uid)
        );
        const querySnapshot = await getDocs(lettersQuery);
        
        const fetchedLetters: VoiceLetter[] = querySnapshot.docs.map(doc => {
          const data = doc.data();
          return {
            ...data,
            id: doc.id,
            sentDate: data.sentDate.toDate ? data.sentDate.toDate() : new Date(data.sentDate),
          } as VoiceLetter;
        });

        // Fetch sender info for each letter
        const lettersWithSendersPromises = fetchedLetters.map(async (letter) => {
            if (letter.senderId === 'rmJavgs7XPGmQ00EBaMu80pKYO02') {
                return { ...letter, senderName: ' The VoiceMail Team' };
            }
            const senderDocRef = doc(firestore, 'users', letter.senderId);
            const senderDocSnap = await getDoc(senderDocRef);
            const senderName = senderDocSnap.exists() ? senderDocSnap.data().username : 'a friend';
            return { ...letter, senderName };
        });

        const lettersWithSenders = await Promise.all(lettersWithSendersPromises);

        lettersWithSenders.sort((a, b) => new Date(b.sentDate).getTime() - new Date(a.sentDate).getTime());

        setLetters(lettersWithSenders);
      } catch (error) {
        console.error("Error fetching letters:", error);
      } finally {
        setIsLoading(false);
      }
    };

    fetchLettersAndSenders();
  }, [currentUser, isAuthLoading, firestore, router]);

  const handleLetterDeleted = (letterId: string) => {
    setLetters(prevLetters => prevLetters.filter(letter => letter.id !== letterId));
  };


  if (isAuthLoading || isLoading) {
    return (
      <div className="flex justify-center items-center h-screen">
        <Loader2 className="h-8 w-8 animate-spin" />
      </div>
    );
  }

  return (
    <main className="container mx-auto max-w-2xl py-8 px-4">
      <Card>
          <CardHeader>
            <CardTitle>Your Inbox</CardTitle>
            <CardDescription>Letters you&apos;ve received from your friends.</CardDescription>
          </CardHeader>
          <CardContent>
            {letters.length > 0 ? (
                <div className="space-y-4">
                    {letters.map((letter) => (
                        <VoiceLetterCard 
                            key={letter.id} 
                            letter={letter} 
                            senderName={letter.senderName} 
                            onLetterDeleted={handleLetterDeleted}
                        />
                    ))}
                </div>
            ) : (
                <div className="text-center py-16 px-6 border-2 border-dashed rounded-lg">
                    <Inbox className="mx-auto h-12 w-12 text-muted-foreground" />
                    <h3 className="mt-4 text-lg font-medium">No Letters Yet!</h3>
                    <p className="mt-1 text-sm text-muted-foreground">
                        When a friend sends you a letter, it will appear here.
                    </p>
                </div>
            )}
          </CardContent>
        </Card>
    </main>
  );
}
