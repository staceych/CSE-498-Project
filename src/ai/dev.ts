'use server';
import { config } from 'dotenv';
config();

import '@/ai/flows/transcribe-voice-message.ts';
import '@/ai/flows/send-letter-notification-flow.ts';
