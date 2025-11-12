
'use client';

import { useState, useMemo, ChangeEvent, useEffect } from 'react';
import { Loader2, MailCheck, Paperclip } from 'lucide-react';
import { useRouter } from 'next/navigation';

import { Card, CardContent, CardDescription, CardFooter, CardHeader, CardTitle } from '@/components/ui/card';
import { Button } from '@/components/ui/button';
import { Label } from '@/components/ui/label';
import { useToast } from '@/hooks/use-toast';
import { type ImagePlaceholder } from '@/lib/placeholder-images';
import { sendLetter } from '@/lib/letters';
import AudioRecorder from '@/components/audio-recorder';
import PhotoUploader from '@/components/photo-uploader';
import BackgroundSelector from '@/components/background-selector';
import SentConfirmationDialog from '@/components/sent-confirmation-dialog';
import SelectFriendDialog from '@/components/select-friend-dialog';
import { useUser } from '@/firebase';

export default function ComposePage() {
  const { user: currentUser, isUserLoading: isAuthLoading } = useUser();
  const [audioBlob, setAudioBlob] = useState<Blob | null>(null);
  const [photos, setPhotos] = useState<File[]>([]);
  const [selectedBackground, setSelectedBackground] = useState<ImagePlaceholder | null>(null);
  const [isSending, setIsSending] = useState(false);
  const [isSent, setIsSent] = useState(false);
  const [isSelectFriendOpen, setIsSelectFriendOpen] = useState(false);
  const [composerKey, setComposerKey] = useState(Date.now());

  const { toast } = useToast();
  const router = useRouter();

  useEffect(() => {
    if (!isAuthLoading && !currentUser) {
      router.push('/login');
    }
  }, [isAuthLoading, currentUser, router]);


  const handleAudioRecordingComplete = (blob: Blob | null) => {
    setAudioBlob(blob);
  };

  const handlePhotosChange = (files: File[]) => {
    setPhotos(files);
  };
  
  const handleOpenSendDialog = () => {
     if (!audioBlob) {
      toast({
        title: 'Cannot Send Letter',
        description: 'A voice message is required to send a letter.',
        variant: 'destructive',
      });
      return;
    }
    setIsSelectFriendOpen(true);
  }

  const handleSendLetter = async (friendIds: string[]) => {
    if (!audioBlob) {
        toast({ title: "No voice message!", variant: "destructive" });
        return;
    }
    if (friendIds.length === 0) {
        toast({ title: "No recipients selected!", variant: "destructive" });
        return;
    }
    if (!currentUser) {
        toast({ title: "You must be logged in to send a letter.", variant: "destructive" });
        return;
    }
    
    setIsSending(true);
    setIsSelectFriendOpen(false);
    
    try {
        await sendLetter({
            from: currentUser.uid,
            to: friendIds,
            audio: audioBlob,
            photos: photos,
            background: selectedBackground,
            transcript: null,
        });

        setIsSent(true); 
    } catch (error: any) {
        if (error.message.startsWith('DAILY_LIMIT_REACHED')) {
            const friendName = error.message.split(':')[1] || 'a friend';
            toast({
                title: "Daily Limit Reached",
                description: `You can only send two letters per day to ${friendName}. Please try again tomorrow!`,
                variant: "destructive",
            });
        } else {
            console.error("Error sending letter:", error);
            toast({
                title: "Failed to Send Letter",
                description: "An unexpected error occurred. Please check security rules and try again.",
                variant: "destructive",
            });
        }
    } finally {
        setIsSending(false);
    }
  };
  
  const resetLetter = () => {
    setAudioBlob(null);
    setPhotos([]);
    setIsSent(false);
    setSelectedBackground(null);
    setComposerKey(Date.now()); // Change the key to force re-mount
  };

  const cardStyle = useMemo(() => ({
    backgroundSize: 'cover',
    backgroundPosition: 'center',
  }), []);

  if (isAuthLoading) {
    return (
      <div className="flex justify-center items-center h-screen">
        <Loader2 className="h-8 w-8 animate-spin" />
      </div>
    );
  }

  return (
    <>
      <div className="flex flex-col items-center justify-center min-h-[calc(100vh-4rem)] p-4 sm:p-6 lg:p-8">
        <main className="w-full max-w-2xl mx-auto flex flex-col gap-8">
          <div className="text-center">
            <h1 className="font-headline text-4xl font-bold tracking-tight text-primary">VoiceMail</h1>
            <p className="mt-2 text-lg text-muted-foreground">Craft a heartfelt message for someone special.</p>
          </div>

          <Card
            className="w-full transition-all duration-500"
            style={{
                ...cardStyle,
                backgroundImage: selectedBackground ? `url(${selectedBackground.imageUrl})` : 'none',
            }}
          >
            <div className="rounded-lg p-6 bg-background/80">
              <CardHeader>
                <CardTitle className="font-headline">Your Voice Letter</CardTitle>
                <CardDescription className="font-semibold">Record a message of up to 5 minutes. 
                                Here are some ideas to get you started: 
                                Is there anything that reminded you of them recently?
                                Whats something you are looking forward to?
                                What has been giving you energy lately?</CardDescription>
              </CardHeader>
              <CardContent className="space-y-6">
                <AudioRecorder key={`audio-${composerKey}`} onRecordingComplete={handleAudioRecordingComplete} />

                <div>
                  <Label className="flex items-center gap-2 mb-2"><Paperclip className="w-4 h-4" />Attach Photos (up to 3)</Label>
                  <PhotoUploader key={`photos-${composerKey}`} onPhotosChange={handlePhotosChange} />
                </div>
              </CardContent>
              <CardFooter>
                <Button
                  size="lg"
                  className="w-full"
                  onClick={handleOpenSendDialog}
                  disabled={!audioBlob || isSending}
                >
                  {isSending ? (
                    <Loader2 className="mr-2 h-4 w-4 animate-spin" />
                  ) : (
                    <MailCheck className="mr-2 h-4 w-4" />
                  )}
                  {isSending ? 'Sending...' : 'Send Your Letter'}
                </Button>
              </CardFooter>
            </div>
          </Card>

          <BackgroundSelector
            selected={selectedBackground}
            onSelect={setSelectedBackground}
          />
        </main>

        <SelectFriendDialog
            open={isSelectFriendOpen}
            onOpenChange={setIsSelectFriendOpen}
            onConfirm={handleSendLetter}
            isSending={isSending}
        />

        <SentConfirmationDialog
          open={isSent}
          onOpenChange={setIsSent}
          onConfirm={resetLetter}
          router={router}
        />
      </div>
    </>
  );
}
