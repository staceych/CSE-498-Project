
'use client';

import type { VoiceLetter } from '@/lib/letters';
import { PlaceHolderImages } from '@/lib/placeholder-images';
import { Card, CardContent, CardDescription, CardFooter, CardHeader, CardTitle } from '@/components/ui/card';
import { Accordion, AccordionContent, AccordionItem, AccordionTrigger } from '@/components/ui/accordion';
import Image from 'next/image';
import { formatDistanceToNow } from 'date-fns';
import { FileText, ImageIcon, Trash2, Loader2, MailOpen } from 'lucide-react';
import { useMemo, useState } from 'react';
import { Button } from './ui/button';
import {
  AlertDialog,
  AlertDialogAction,
  AlertDialogCancel,
  AlertDialogContent,
  AlertDialogDescription,
  AlertDialogFooter,
  AlertDialogHeader,
  AlertDialogTitle,
} from '@/components/ui/alert-dialog';
import { useToast } from '@/hooks/use-toast';
import { cn } from '@/lib/utils';
import { markLetterAsRead } from '@/lib/letters';


interface VoiceLetterCardProps {
  letter: VoiceLetter;
  senderName?: string;
  recipientName?: string;
  viewContext?: 'sent' | 'received';
  onLetterDeleted?: (letterId: string) => void;
}

export default function VoiceLetterCard({ letter, senderName, recipientName, viewContext = 'received', onLetterDeleted }: VoiceLetterCardProps) {
  const [showDeleteConfirm, setShowDeleteConfirm] = useState(false);
  const [isDeleting, setIsDeleting] = useState(false);
  const [isFlipped, setIsFlipped] = useState(letter.isRead || viewContext === 'sent');
  const { toast } = useToast();

  const background = useMemo(() => {
    return PlaceHolderImages.find(p => p.id === letter.backgroundStyleId);
  }, [letter.backgroundStyleId]);

  const cardStyle = useMemo(() => ({
    backgroundImage: background ? `url(${background.imageUrl})` : 'none',
    backgroundSize: 'cover',
    backgroundPosition: 'center',
  }), [background]);
  
  const hasPhotos = letter.photoUrls && letter.photoUrls.length > 0;
  const hasTranscript = letter.transcript && letter.transcript.trim() !== '';

  const isSentView = viewContext === 'sent';
  
  const title = isSentView 
    ? `Letter to ${recipientName || 'a friend'}`
    : `A letter from ${senderName || 'a friend'}`;
    
  const timestamp = isSentView
    ? `Sent ${formatDistanceToNow(new Date(letter.sentDate), { addSuffix: true })}`
    : `Received ${formatDistanceToNow(new Date(letter.sentDate), { addSuffix: true })}`;

  const handleDelete = async () => {
    setIsDeleting(true);
    try {
      const { deleteLetter } = await import('@/lib/letters');
      await deleteLetter(letter.id);
      toast({
        title: 'Letter Deleted',
        description: 'The voice letter has been permanently removed.',
      });
      onLetterDeleted?.(letter.id);
    } catch (error) {
      console.error('Failed to delete letter:', error);
      toast({
        title: 'Deletion Failed',
        description: 'Could not delete the letter. Please try again.',
        variant: 'destructive',
      });
    } finally {
      setIsDeleting(false);
      setShowDeleteConfirm(false);
    }
  };
  
  const handleCardClick = () => {
    if (!isFlipped) {
      setIsFlipped(true);
      if (viewContext === 'received') {
        markLetterAsRead(letter.id);
      }
    }
  };


  return (
    <>
      <div 
        className="perspective-1000 w-full group"
        onClick={handleCardClick}
      >
        <Card className={cn(
            "w-full relative transition-transform duration-700 transform-style-3d",
            !isFlipped && "cursor-pointer",
            isFlipped ? "[transform:rotateY(0deg)]" : "[transform:rotateY(180deg)]"
        )}>
          {/* Back of Card - Envelope */}
          <div className="absolute inset-0 w-full h-full bg-card backface-hidden [transform:rotateY(180deg)] rounded-lg border flex flex-col items-center justify-center gap-2 text-primary">
            <MailOpen className="w-16 h-16" />
            <p className="font-headline text-lg">Click to open</p>
            <p className="text-sm text-muted-foreground">{title}</p>
          </div>

          {/* Front of Card - Content */}
          <div className="overflow-hidden relative backface-hidden [transform:rotateY(0deg)]" style={cardStyle}>
            <div className="bg-background/80 p-4 sm:p-6">
                <Button 
                    variant="ghost" 
                    size="icon" 
                    className="absolute top-2 right-2 h-8 w-8 z-10 opacity-0 group-hover:opacity-100 transition-opacity"
                    onClick={(e) => {
                      e.stopPropagation(); // Prevent card flip when clicking delete
                      setShowDeleteConfirm(true);
                    }}
                >
                    <Trash2 className="h-4 w-4" />
                    <span className="sr-only">Delete letter</span>
                </Button>

                <CardHeader className="p-0 pb-4">
                    <CardTitle className="font-headline text-2xl">{title}</CardTitle>
                    <CardDescription>
                        {timestamp}
                    </CardDescription>
                </CardHeader>
                <CardContent className="p-0 space-y-4">
                    <audio controls controlsList="nodownload" src={letter.audioUrl} className="w-full" onClick={e => e.stopPropagation()}/>
                    
                    {hasPhotos && (
                        <div className="grid grid-cols-3 gap-2">
                            {letter.photoUrls.map((url, index) => (
                                <div key={index} className="aspect-square relative">
                                    <Image
                                        src={url}
                                        alt={`Attached photo ${index + 1}`}
                                        width={200}
                                        height={200}
                                        className="rounded-md object-cover w-full h-full"
                                    />
                                </div>
                            ))}
                        </div>
                    )}

                    {hasTranscript && (
                        <Accordion type="single" collapsible className="w-full" onClick={e => e.stopPropagation()}>
                            <AccordionItem value="transcript">
                                <AccordionTrigger>
                                    <div className="flex items-center gap-2">
                                        <FileText className="h-4 w-4" />
                                        <span>Read Transcript</span>
                                    </div>
                                </AccordionTrigger>
                                <AccordionContent className="whitespace-pre-wrap text-muted-foreground bg-muted/50 p-4 rounded-md">
                                    {letter.transcript}
                                </AccordionContent>
                            </AccordionItem>
                        </Accordion>
                    )}
                </CardContent>
            </div>
          </div>
        </Card>
      </div>

      <AlertDialog open={showDeleteConfirm} onOpenChange={setShowDeleteConfirm}>
            <AlertDialogContent>
            <AlertDialogHeader>
                <AlertDialogTitle>Are you sure you want to delete this letter?</AlertDialogTitle>
                <AlertDialogDescription>
                This action cannot be undone. This will permanently delete the voice letter
                for both you and the recipient.
                </AlertDialogDescription>
            </AlertDialogHeader>
            <AlertDialogFooter>
                <AlertDialogCancel disabled={isDeleting}>Cancel</AlertDialogCancel>
                <AlertDialogAction onClick={handleDelete} disabled={isDeleting} className="bg-destructive hover:bg-destructive/90">
                {isDeleting && <Loader2 className="mr-2 h-4 w-4 animate-spin" />}
                Delete Letter
                </AlertDialogAction>
            </AlertDialogFooter>
            </AlertDialogContent>
      </AlertDialog>
    </>
  );
}
