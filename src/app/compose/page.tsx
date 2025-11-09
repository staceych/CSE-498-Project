
'use client';

import { useState, useMemo, ChangeEvent, useEffect } from 'react';
import { Loader2, MailCheck, Paperclip, Wand2 } from 'lucide-react';
import { useRouter } from 'next/navigation';

import { Card, CardContent, CardDescription, CardFooter, CardHeader, CardTitle } from '@/components/ui/card';
import { Button } from '@/components/ui/button';
import { Label } from '@/components/ui/label';
import { Switch } from '@/components/ui/switch';
import { Textarea } from '@/components/ui/textarea';
import { useToast } from '@/hooks/use-toast';
import { PlaceHolderImages, type ImagePlaceholder } from '@/lib/placeholder-images';
import { transcribeVoiceMessage } from '@/ai/flows/transcribe-voice-message';
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
  const [transcript, setTranscript] = useState('');
  const [generateTranscript, setGenerateTranscript] = useState(false);
  const [isTranscribing, setIsTranscribing] = useState(false);
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


  const handleGenerateTranscript = async (blob: Blob) => {
    setIsTranscribing(true);
    setTranscript('Generating transcript...');
    try {
      const reader = new FileReader();
      reader.readAsDataURL(blob);
      reader.onloadend = async () => {
        const base64Audio = reader.result as string;
        const result = await transcribeVoiceMessage({ audioDataUri: base64Audio });
        setTranscript(result.transcript);
        setIsTranscribing(false);
      };
    } catch (error) {
      console.error('Transcription failed:', error);
      setTranscript('Could not generate transcript. Please try again.');
      toast({
        title: 'Transcription Failed',
        description: 'An error occurred while generating the transcript.',
        variant: 'destructive',
      });
      setIsTranscribing(false);
    }
  };

  const handleAudioRecordingComplete = (blob: Blob | null) => {
    setAudioBlob(blob);
    setTranscript('');
    if (blob && generateTranscript) {
      handleGenerateTranscript(blob);
    }
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
            transcript: generateTranscript ? transcript : null,
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
    setTranscript('');
    setGenerateTranscript(false);
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
                <CardDescription>Record a message of up to 5 minutes. 
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

                {audioBlob && (
                  <div className="space-y-4 rounded-lg border bg-background/80 p-4">
                    <div className="flex items-center justify-between">
                        <Label htmlFor="transcript-switch" className="flex items-center gap-2">
                            <Wand2 className="w-4 h-4" />
                            Generate Transcript (optional)
                        </Label>
                        <Switch
                            id="transcript-switch"
                            checked={generateTranscript}
                            onCheckedChange={(checked) => {
                                setGenerateTranscript(checked);
                                if (checked && audioBlob && !transcript) {
                                    handleGenerateTranscript(audioBlob);
                                }
                            }}
                        />
                    </div>
                    {generateTranscript && (
                        <>
                            <Textarea
                                value={transcript}
                                readOnly
                                placeholder="Your transcript will appear here..."
                                className="h-32 bg-background/50"
                            />
                            {isTranscribing && <div className="flex items-center text-sm text-muted-foreground"><Loader2 className="mr-2 h-4 w-4 animate-spin" />Generating...</div>}
                        </>
                    )}
                  </div>
                )}
              </CardContent>
              <CardFooter>
                <Button
                  size="lg"
                  className="w-full"
                  onClick={handleOpenSendDialog}
                  disabled={!audioBlob || isSending || (generateTranscript && isTranscribing)}
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
