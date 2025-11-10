
'use client';

import { Firestore, collection, doc, getDocs, query, updateDoc, where } from 'firebase/firestore';
import { getStorage, ref, uploadBytes, getDownloadURL } from 'firebase/storage';

/**
 * Updates a user's username after checking for uniqueness.
 * @param firestore The Firestore instance.
 * @param userId The ID of the user to update.
 * @param newUsername The desired new username.
 * @throws Will throw an error if the username is already taken.
 */
export const updateUsername = async (firestore: Firestore, userId: string, newUsername: string): Promise<void> => {
  // 1. Check if the new username is already taken by another user.
  const usersRef = collection(firestore, 'users');
  const q = query(usersRef, where('username', '==', newUsername));
  
  const querySnapshot = await getDocs(q);

  // Check if any documents were found and if the found user is not the current user.
  if (!querySnapshot.empty && querySnapshot.docs[0].id !== userId) {
    throw new Error(`Username "${newUsername}" is already taken. Please choose another.`);
  }

  // 2. If the username is available, update the user's document.
  const userDocRef = doc(firestore, 'users', userId);
  await updateDoc(userDocRef, {
    username: newUsername,
  });
};

/**
 * Uploads a profile picture, gets the URL, and updates the user's document.
 * @param firestore The Firestore instance.
 * @param userId The ID of the user to update.
 * @param file The image file to upload.
 */
export const uploadProfilePicture = async (firestore: Firestore, userId: string, file: File): Promise<void> => {
    const storage = getStorage();
    const filePath = `profilePictures/${userId}`;
    const storageRef = ref(storage, filePath);

    try {
        // 1. Upload the file to Firebase Storage
        const snapshot = await uploadBytes(storageRef, file);

        // 2. Get the public download URL for the file
        const downloadURL = await getDownloadURL(snapshot.ref);

        // 3. Update the user's document in Firestore with the new avatar URL
        const userDocRef = doc(firestore, 'users', userId);
        await updateDoc(userDocRef, {
            avatar: downloadURL,
        });

    } catch (error: any) {
        console.error("Error uploading profile picture:", error);
        // Let the UI handle displaying the error based on the thrown message.
        if (error.code === 'storage/unauthorized') {
            throw new Error("You don't have permission to upload. Check your Storage security rules.");
        }
        throw new Error("Failed to upload profile picture.");
    }
};

    