'use server';
import { config } from 'dotenv';
config();

import '@/ai/flows/transcribe-voice-message.ts';
import '@/ai/flows/daily-digest-flow.ts';
import '@/ai/flows/send-test-email-flow.ts';
