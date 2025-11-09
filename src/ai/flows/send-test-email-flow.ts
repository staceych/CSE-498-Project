
'use server';
/**
 * @fileOverview A flow to send a single test email to a user.
 *
 * This file defines a Genkit flow that can be called directly from the client-side
 * to send a test email. This is useful for verifying that the email sending service (Resend)
 * is configured correctly.
 *
 * - sendTestEmail - The main flow function.
 * - SendTestEmailInput - The input type for the sendTestEmail function.
 */

import { ai } from '@/ai/genkit';
import { z } from 'zod';
import { Resend } from 'resend';

const resend = new Resend(process.env.RESEND_API_KEY);

const SendTestEmailInputSchema = z.object({
  email: z.string().email(),
  username: z.string(),
});
export type SendTestEmailInput = z.infer<typeof SendTestEmailInputSchema>;


export async function sendTestEmail(input: SendTestEmailInput): Promise<{ success: boolean }> {
    return sendTestEmailFlow(input);
}


const sendTestEmailFlow = ai.defineFlow(
  {
    name: 'sendTestEmailFlow',
    inputSchema: SendTestEmailInputSchema,
    outputSchema: z.object({ success: z.boolean() }),
  },
  async ({ email, username }) => {
    try {
      await resend.emails.send({
        from: 'VoiceMail <onboarding@resend.dev>',
        to: [email],
        subject: 'VoiceMail Test Email',
        html: `
          <html>
            <body>
              <h1>This is a test email!</h1>
              <p>Hi ${username},</p>
              <p>If you're receiving this, your email configuration is working correctly.</p>
              <p><em>- The VoiceMail Team</em></p>
            </body>
          </html>
        `,
      });
      console.log(`Test email successfully sent to ${email}`);
      return { success: true };
    } catch (error) {
      console.error(`Failed to send test email to ${email}:`, error);
      // Re-throw the error to be caught by the client-side caller
      throw new Error(`Failed to send test email: ${error instanceof Error ? error.message : 'Unknown error'}`);
    }
  }
);
