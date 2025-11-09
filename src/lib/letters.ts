
'use client';

import { db, storage } from './firebase';
import { collection, writeBatch, serverTimestamp, doc, runTransaction, getDoc, deleteDoc, updateDoc } from 'firebase/firestore';
import { ref, uploadBytes, getDownloadURL } from 'firebase/storage';
import type { ImagePlaceholder } from './placeholder-images';
import { errorEmitter } from '@/firebase/error-emitter';
import { FirestorePermissionError } from '@/firebase/errors';
import { format } from 'date-fns';

export type VoiceLetter = {
  id: string;
  senderId: string;
  recipientId: string;
  audioUrl: string;
  photoUrls: string[];
  backgroundStyleId: string | null;
  transcript: string | null;
  sentDate: any; // Can be Date or Firebase Timestamp
  isRead?: boolean;
};


type SendLetterPayload = {
    from: string; 
    to: string[]; // An array of recipient user IDs
    audio: Blob;
    photos: File[];
    background: ImagePlaceholder | null;
    transcript: string | null;
}

const DAILY_LETTER_LIMIT_PER_FRIEND = 2;

/**
 * Uploads a file to Firebase Storage and returns its download URL.
 * @param file The file (audio or photo) to upload.
 * @param path The path in Firebase Storage where the file should be stored.
 * @returns A promise that resolves with the public download URL of the uploaded file.
 */
const uploadFileAndGetURL = async (file: Blob | File, path: string): Promise<string> => {
    const storageRef = ref(storage, path);
    const snapshot = await uploadBytes(storageRef, file);
    const downloadURL = await getDownloadURL(snapshot.ref);
    return downloadURL;
};

export const sendLetter = async (payload: SendLetterPayload): Promise<void> => {
    const { from: senderId, to: recipientIds, audio, photos, background, transcript } = payload;
    
    if (!senderId) {
        throw new Error("User not authenticated.");
    }

    try {
        await runTransaction(db, async (transaction) => {
            const todayStr = format(new Date(), 'yyyy-MM-dd');
            const senderDocRef = doc(db, 'users', senderId);
            const senderDoc = await transaction.get(senderDocRef);

            if (!senderDoc.exists()) {
                throw new Error("Sender's user profile not found.");
            }
            
            const senderData = senderDoc.data();
            let dailyLimits = senderData.dailyLetterLimits || { date: todayStr, counts: {} };

            // Reset counts if the date has changed
            if (dailyLimits.date !== todayStr) {
                dailyLimits = { date: todayStr, counts: {} };
            }
            
            const newCounts = { ...dailyLimits.counts };

            // Pre-fetch recipient names for potential error messages
            const recipientDocs = await Promise.all(
                recipientIds.map(id => getDoc(doc(db, 'users', id)))
            );

            // First, check if the limit would be exceeded for any recipient
            for (let i = 0; i < recipientIds.length; i++) {
                const recipientId = recipientIds[i];
                const currentCount = newCounts[recipientId] || 0;
                if (currentCount >= DAILY_LETTER_LIMIT_PER_FRIEND) {
                    const recipientName = recipientDocs[i].exists() ? recipientDocs[i].data()?.username : 'this friend';
                    // Throw a specific error with the friend's name
                    throw new Error(`DAILY_LIMIT_REACHED:${recipientName}`);
                }
                newCounts[recipientId] = currentCount + 1;
            }
            
            // If all checks pass, proceed with uploads and writes
            const commonLetterIdForStorage = doc(collection(db, 'letters')).id;
            
            const audioPath = `voiceLetters/${commonLetterIdForStorage}/voice.webm`;
            const audioUrl = await uploadFileAndGetURL(audio, audioPath);
            
            const photoUrls = await Promise.all(
                photos.map((photo, index) =>
                    uploadFileAndGetURL(photo, `voiceLetters/${commonLetterIdForStorage}/photo_${index}_${photo.name}`)
                )
            );

            // Create a letter document for each recipient
            for (const recipientId of recipientIds) {
                const letterDocRef = doc(collection(db, 'letters'));

                const letterData: Omit<VoiceLetter, 'sentDate' | 'isRead'> & { sentDate: any, isRead: boolean } = {
                    id: letterDocRef.id,
                    senderId: senderId,
                    recipientId: recipientId,
                    audioUrl: audioUrl,
                    photoUrls: photoUrls,
                    backgroundStyleId: background?.id || null,
                    transcript: transcript || null,
                    sentDate: serverTimestamp(),
                    isRead: false,
                };
                transaction.set(letterDocRef, letterData);
            }

            // Update the user's letter count map
            transaction.update(senderDocRef, {
                dailyLetterLimits: {
                    date: todayStr,
                    counts: newCounts
                }
            });
        });

    } catch (error: any) {
        // Re-throw the daily limit error to be handled by the UI
        if (error.message.startsWith('DAILY_LIMIT_REACHED')) {
            throw error;
        }

        console.error('sendLetter failed:', error);
        
        let errorPath = 'letters/unknown';
        let operation: 'create' | 'write' = 'create';
        
        if (error.code === 'storage/unauthorized') {
            operation = 'write';
            errorPath = error.message.split('"').find((s: string) => s.startsWith('voiceLetters/')) || 'storage/unknown';
        } else if (error.code === 'permission-denied') {
            operation = 'create';
            errorPath = 'letters/some-id';
        }

        const contextualError = new FirestorePermissionError({
          path: errorPath,
          operation: operation,
          requestResourceData: { info: "Attempted to create a letter." }
        });

        errorEmitter.emit('permission-error', contextualError);
        throw new Error(`Failed to send letter. Please check your security rules and try again.`);
    }
};

/**
 * Deletes a voice letter from Firestore.
 * @param letterId The ID of the letter to delete.
 */
export const deleteLetter = async (letterId: string): Promise<void> => {
    const letterDocRef = doc(db, 'letters', letterId);
    try {
        await deleteDoc(letterDocRef);
        // Note: This does not delete associated files from Storage to keep it simple.
        // A more robust implementation would use a Cloud Function to handle file cleanup.
    } catch (error) {
        console.error("Error deleting letter:", error);

        const contextualError = new FirestorePermissionError({
            path: `letters/${letterId}`,
            operation: 'delete'
        });

        errorEmitter.emit('permission-error', contextualError);
        throw new Error('Failed to delete letter. Please check security rules.');
    }
};


/**
 * Marks a specific letter as read by the recipient.
 * @param letterId The ID of the letter to update.
 */
export const markLetterAsRead = async (letterId: string): Promise<void> => {
    const letterDocRef = doc(db, 'letters', letterId);
    try {
        await updateDoc(letterDocRef, { isRead: true });
    } catch (error) {
        // This is a non-critical operation, so we can fail silently
        // or just log it without bothering the user.
        console.warn(`Could not mark letter ${letterId} as read:`, error);
        
        // However, if it's a permissions error, it could be useful to debug.
        // We'll emit it, but not throw, to avoid breaking the UI flow.
        if (error instanceof Error && (error.message.includes('permission-denied') || error.message.includes('insufficient permissions'))) {
            const contextualError = new FirestorePermissionError({
                path: `letters/${letterId}`,
                operation: 'update',
                requestResourceData: { isRead: true }
            });
            errorEmitter.emit('permission-error', contextualError);
        }
    }
};
