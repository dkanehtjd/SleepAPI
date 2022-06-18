package com.android.example.sleepcodelab.receiver;

import java.lang.System;

/**
 * Resubscribes to Sleep data if the device is rebooted.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0003J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/android/example/sleepcodelab/receiver/BootReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "scope", "Lkotlinx/coroutines/CoroutineScope;", "activityRecognitionPermissionApproved", "", "context", "Landroid/content/Context;", "onReceive", "", "intent", "Landroid/content/Intent;", "subscribeToSleepSegmentUpdates", "pendingIntent", "Landroid/app/PendingIntent;", "unsubscribeStatusForSleepData", "Lkotlinx/coroutines/Job;", "repository", "Lcom/android/example/sleepcodelab/data/SleepRepository;", "Companion", "complete_debug"})
public final class BootReceiver extends android.content.BroadcastReceiver {
    private final kotlinx.coroutines.CoroutineScope scope = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "BootReceiver";
    @org.jetbrains.annotations.NotNull()
    public static final com.android.example.sleepcodelab.receiver.BootReceiver.Companion Companion = null;
    
    @java.lang.Override()
    public void onReceive(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
    }
    
    /**
     * Subscribes to sleep data.
     * Note: Permission isn't missing, it's in the manifest but only for 29+ version. The lint
     * check is the 28 and below version of the activity recognition permission (needed for
     * accessing sleep data).
     */
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    private final void subscribeToSleepSegmentUpdates(android.content.Context context, android.app.PendingIntent pendingIntent) {
    }
    
    /**
     * Updates the app's boolean for sleep subscription status.
     *
     * Note: This happens because an exception occurred or the permission was removed, so the app
     * is no longer subscribed to sleep data.
     */
    private final kotlinx.coroutines.Job unsubscribeStatusForSleepData(com.android.example.sleepcodelab.data.SleepRepository repository) {
        return null;
    }
    
    private final boolean activityRecognitionPermissionApproved(android.content.Context context) {
        return false;
    }
    
    public BootReceiver() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/android/example/sleepcodelab/receiver/BootReceiver$Companion;", "", "()V", "TAG", "", "complete_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}