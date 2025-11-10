
'use client';

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
import { Button } from './ui/button';
import Image from 'next/image';
import { Loader2, UploadCloud } from 'lucide-react';

interface AvatarUploadDialogProps {
  isOpen: boolean;
  onOpenChange: (open: boolean) => void;
  previewUrl: string | null;
  isUploading: boolean;
  onConfirm: () => void;
}

export default function AvatarUploadDialog({
  isOpen,
  onOpenChange,
  previewUrl,
  isUploading,
  onConfirm,
}: AvatarUploadDialogProps) {
  return (
    <AlertDialog open={isOpen} onOpenChange={onOpenChange}>
      <AlertDialogContent>
        <AlertDialogHeader>
          <AlertDialogTitle>Update Profile Picture?</AlertDialogTitle>
          <AlertDialogDescription>
            This will replace your current avatar. Do you want to proceed?
          </AlertDialogDescription>
        </AlertDialogHeader>
        <div className="flex justify-center py-4">
          {previewUrl && (
            <Image
              src={previewUrl}
              alt="Avatar preview"
              width={200}
              height={200}
              className="rounded-full aspect-square object-cover"
            />
          )}
        </div>
        <AlertDialogFooter>
          <AlertDialogCancel disabled={isUploading}>Cancel</AlertDialogCancel>
          <AlertDialogAction onClick={onConfirm} disabled={isUploading}>
            {isUploading ? (
              <Loader2 className="mr-2 h-4 w-4 animate-spin" />
            ) : (
              <UploadCloud className="mr-2 h-4 w-4" />
            )}
            {isUploading ? 'Uploading...' : 'Confirm & Upload'}
          </AlertDialogAction>
        </AlertDialogFooter>
      </AlertDialogContent>
    </AlertDialog>
  );
}

    