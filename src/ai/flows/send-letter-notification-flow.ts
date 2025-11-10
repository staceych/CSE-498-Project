
'use server';
/**
 * @fileOverview A flow to send an email notification when a user receives a new letter.
 * 
 * - sendLetterNotification - The main flow function.
 * - SendLetterNotificationInput - The input type for the flow.
 */

import { ai } from '@/ai/genkit';
import { z } from 'zod';
import { Resend } from 'resend';

// Initialize Resend. Make sure RESEND_API_KEY is in your .env file.
const resend = new Resend(process.env.RESEND_API_KEY);

const SendLetterNotificationInputSchema = z.object({
  senderName: z.string(),
  recipientEmail: z.string().email(),
  recipientName: z.string(),
});
export type SendLetterNotificationInput = z.infer<typeof SendLetterNotificationInputSchema>;


export async function sendLetterNotification(input: SendLetterNotificationInput): Promise<{ success: boolean }> {
    return sendLetterNotificationFlow(input);
}


const sendLetterNotificationFlow = ai.defineFlow(
  {
    name: 'sendLetterNotificationFlow',
    inputSchema: SendLetterNotificationInputSchema,
    outputSchema: z.object({ success: z.boolean() }),
  },
  async ({ senderName, recipientEmail, recipientName }) => {
    const subject = `You've received a new voice letter from ${senderName}!`;
    const emailHtml = `
        <html>
        <body>
            <h1>A new letter is waiting for you!</h1>
            <p>Hi ${recipientName},</p>
            <p>You have a new voice letter from <strong>${senderName}</strong> waiting for you in your inbox.</p>
            <p>
                <a href="https://voicemail-427618.web.app/inbox">Go to your inbox</a> to listen now!
            </p>
            <p><em>- The VoiceMail Team</em></p>
        </body>
        </html>
    `;

    try {
      await resend.emails.send({
        from: 'VoiceMail <onboarding@resend.dev>',
        to: [recipientEmail],
        subject: subject,
        html: emailHtml,
      });
      console.log(`Notification email successfully sent to ${recipientEmail}`);
      return { success: true };
    } catch (error) {
      console.error(`Failed to send notification email to ${recipientEmail}:`, error);
      // We don't want to block the main thread if email fails, so we just log and return false.
      return { success: false };
    }
  }
);
