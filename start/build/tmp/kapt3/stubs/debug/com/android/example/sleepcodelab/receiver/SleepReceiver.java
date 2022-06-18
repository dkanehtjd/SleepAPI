package com.android.example.sleepcodelab.receiver;

import java.lang.System;

/**
 * Saves Sleep Events to Database.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002J\u001e\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\nH\u0002J\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/android/example/sleepcodelab/receiver/SleepReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "scope", "Lkotlinx/coroutines/CoroutineScope;", "addSleepClassifyEventsToDatabase", "", "repository", "Lcom/android/example/sleepcodelab/data/SleepRepository;", "sleepClassifyEvents", "", "Lcom/google/android/gms/location/SleepClassifyEvent;", "addSleepSegmentEventsToDatabase", "sleepSegmentEvents", "Lcom/google/android/gms/location/SleepSegmentEvent;", "onReceive", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "Companion", "start_debug"})
public final class SleepReceiver extends android.content.BroadcastReceiver {
    private final kotlinx.coroutines.CoroutineScope scope = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "SleepReceiver";
    @org.jetbrains.annotations.NotNull()
    public static final com.android.example.sleepcodelab.receiver.SleepReceiver.Companion Companion = null;
    
    @java.lang.Override()
    public void onReceive(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
    }
    
    private final void addSleepSegmentEventsToDatabase(com.android.example.sleepcodelab.data.SleepRepository repository, java.util.List<? extends com.google.android.gms.location.SleepSegmentEvent> sleepSegmentEvents) {
    }
    
    private final void addSleepClassifyEventsToDatabase(com.android.example.sleepcodelab.data.SleepRepository repository, java.util.List<? extends com.google.android.gms.location.SleepClassifyEvent> sleepClassifyEvents) {
    }
    
    public SleepReceiver() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/android/example/sleepcodelab/receiver/SleepReceiver$Companion;", "", "()V", "TAG", "", "createSleepReceiverPendingIntent", "Landroid/app/PendingIntent;", "context", "Landroid/content/Context;", "start_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final android.app.PendingIntent createSleepReceiverPendingIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}