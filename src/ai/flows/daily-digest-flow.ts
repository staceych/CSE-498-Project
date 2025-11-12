
'use server';
/**
 * @fileOverview A flow to send daily email digests to users about new voice letters.
 *
 * This file defines a Genkit flow that is designed to be run on a schedule (e.g., hourly).
 * The flow performs the following actions:
 * 1. Initializes a connection to the Firestore database.
 * 2. Fetches all users from the 'users' collection.
 * 3. Determines the current hour to check against user notification preferences.
 * 4. Iterates through each user to see if they should receive a notification at the current time.
 * 5. If a user's preferred `notificationTime` matches the current hour, it queries for any
 *    voice letters they have received in the last 24 hours.
 * 6. For each new letter, it fetches the sender's username.
 * 7. If there are new letters, it constructs an HTML email digest.
 * 8. It then uses the Resend service to send the email to the user.
 *
 * This flow relies on the following external services and configurations:
 * - Firebase Firestore: To access user and letter data. The Firestore instance must be
 *   initialized and accessible.
 * - Resend: For sending emails. A `RESEND_API_KEY` must be configured in the environment
 *   variables for this to work.
 *
 * The main exported function is `sendDailyDigests`, which orchestrates the entire process.
 *
 * - sendDailyDigests - The main flow function.
 */

import { ai } from '@/ai/genkit';
import { run } from 'genkit';
import { z } from 'zod';
import { getFirestore, collection, getDocs, query, where, Timestamp, getDoc, doc } from 'firebase/firestore';
import { initializeApp, getApps, getApp } from 'firebase/app';
import { firebaseConfig } from '@/firebase/config';
import { Resend } from 'resend';
import { format } from 'date-fns';

// Initialize Firebase Admin SDK
// Ensure Firebase is initialized only once
const app = !getApps().length ? initializeApp(firebaseConfig) : getApp();
const db = getFirestore(app);

// Initialize Resend
const resend = new Resend(process.env.RESEND_API_KEY);

interface User {
  id: string;
  email: string;
  username: string;
  notificationTime?: string;
}

interface Letter {
  id: string;
  senderId: string;
  sentDate: Timestamp;
}

interface LetterWithSender extends Letter {
  senderName: string;
}

// Time conversion helper
const convert12hrTo24hr = (time12h: string): number => {
  const [time, modifier] = time12h.split(' ');
  let [hours] = time.split(':');

  if (hours === '12') {
    hours = '0';
  }

  if (modifier === 'PM') {
    hours = (parseInt(hours, 10) + 12).toString();
  }

  return parseInt(hours, 10);
};


export const sendDailyDigests = ai.defineFlow(
  {
    name: 'sendDailyDigests',
    inputSchema: z.void(),
    outputSchema: z.void(),
  },
  async () => {
    
    await run('sendDigests', async () => {
        const now = new Date();
        const currentHour24 = now.getHours();
        
        console.log(`[${format(now, 'yyyy-MM-dd HH:mm:ss')}] Running daily digest flow for hour: ${currentHour24}`);

        // 1. Fetch all users
        const usersSnapshot = await getDocs(collection(db, 'users'));
        const users = usersSnapshot.docs.map(doc => ({ id: doc.id, ...doc.data() } as User));

        for (const user of users) {
            const userNotificationHour = user.notificationTime ? convert12hrTo24hr(user.notificationTime) : null;
            
            console.log(`Checking user ${user.username} (${user.email}). Pref hour: ${userNotificationHour}`);

            // 2. Check if it's the user's notification time
            if (userNotificationHour !== currentHour24) {
                continue;
            }

            console.log(`[+] Match found for ${user.username}. Checking for new letters.`);

            // 3. Find letters received in the last 24 hours
            const twentyFourHoursAgo = Timestamp.fromDate(new Date(now.getTime() - 24 * 60 * 60 * 1000));
            const lettersQuery = query(
                collection(db, 'letters'),
                where('recipientId', '==', user.id),
                where('sentDate', '>=', twentyFourHoursAgo)
            );
            const lettersSnapshot = await getDocs(lettersQuery);

            if (lettersSnapshot.empty) {
                console.log(`No new letters for ${user.username}. Skipping email.`);
                continue;
            }

            const letters: Letter[] = lettersSnapshot.docs.map(doc => ({ id: doc.id, ...doc.data() } as Letter));
            console.log(`Found ${letters.length} new letters for ${user.username}.`);

            // 4. Fetch sender usernames
            const lettersWithSenders: LetterWithSender[] = [];
            for (const letter of letters) {
                let senderName = 'A friend';
                if (letter.senderId === 'THE_CREATORS') {
                    senderName = 'The Creators';
                } else {
                    const senderDoc = await getDoc(doc(db, 'users', letter.senderId));
                    if (senderDoc.exists()) {
                        senderName = senderDoc.data().username || 'A friend';
                    }
                }
                lettersWithSenders.push({ ...letter, senderName });
            }

            // 5. Construct and send email
            const subject = `You have ${lettersWithSenders.length} new voice letter${lettersWithSenders.length > 1 ? 's' : ''}!`;
            
            const emailHtml = `
                <html>
                <body>
                    <h1>You've received new voice letters!</h1>
                    <p>Hi ${user.username}, you have ${lettersWithSenders.length} new letter${lettersWithSenders.length > 1 ? 's' : ''} waiting for you in your inbox.</p>
                    <ul>
                        ${lettersWithSenders.map(l => `<li>A letter from <strong>${l.senderName}</strong> received at ${format(l.sentDate.toDate(), 'p')}.</li>`).join('')}
                    </ul>
                    <p>
                        <a href="https://voicemail.bragg.dev/inbox">Go to your inbox</a> to listen to them now!
                    </p>
                    <p><em>- The VoiceMail Team</em></p>
                </body>
                </html>
            `;
            
            try {
                await resend.emails.send({
                    from: 'VoiceMail <onboarding@resend.dev>',
                    to: [user.email],
                    subject: subject,
                    html: emailHtml,
                });
                console.log(`Email successfully sent to ${user.email}`);
            } catch (error) {
                console.error(`Failed to send email to ${user.email}:`, error);
            }
        }
    });
  }
);
