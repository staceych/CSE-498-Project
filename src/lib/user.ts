
'use client';

import { Firestore, collection, doc, getDocs, query, updateDoc, where } from 'firebase/firestore';

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
