package com.android.example.sleepcodelab;

import java.lang.System;

/**
 * Demos Android's Sleep APIs; subscribe/unsubscribe to sleep data, save that data, and display it.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 &2\u00020\u0001:\u0001&B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0017\u001a\u00020\u0013H\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\u000e\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001cJ\u0012\u0010\u001d\u001a\u00020\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0014J\u0018\u0010 \u001a\u00020\u00192\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0010H\u0003J\u0018\u0010$\u001a\u00020\u00192\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0010H\u0002J\b\u0010%\u001a\u00020\u0019H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0013@BX\u0082\u000e\u00a2\u0006\b\n\u0000\"\u0004\b\u0015\u0010\u0016\u00a8\u0006\'"}, d2 = {"Lcom/android/example/sleepcodelab/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/android/example/sleepcodelab/databinding/ActivityMainBinding;", "mainViewModel", "Lcom/android/example/sleepcodelab/MainViewModel;", "getMainViewModel", "()Lcom/android/example/sleepcodelab/MainViewModel;", "mainViewModel$delegate", "Lkotlin/Lazy;", "requestPermissionLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "", "sleepClassifyOutput", "sleepPendingIntent", "Landroid/app/PendingIntent;", "sleepSegmentOutput", "newSubscribedToSleepData", "", "subscribedToSleepData", "setSubscribedToSleepData", "(Z)V", "activityRecognitionPermissionApproved", "displayPermissionSettingsSnackBar", "", "onClickRequestSleepData", "view", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "subscribeToSleepSegmentUpdates", "context", "Landroid/content/Context;", "pendingIntent", "unsubscribeToSleepSegmentUpdates", "updateOutput", "Companion", "complete_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.android.example.sleepcodelab.databinding.ActivityMainBinding binding;
    private final kotlin.Lazy mainViewModel$delegate = null;
    private java.lang.String sleepSegmentOutput = "";
    private java.lang.String sleepClassifyOutput = "";
    private boolean subscribedToSleepData = false;
    private android.app.PendingIntent sleepPendingIntent;
    private final androidx.activity.result.ActivityResultLauncher<java.lang.String> requestPermissionLauncher = null;
    private static final java.lang.String TAG = "MainActivity";
    @org.jetbrains.annotations.NotNull()
    public static final com.android.example.sleepcodelab.MainActivity.Companion Companion = null;
    
    private final com.android.example.sleepcodelab.MainViewModel getMainViewModel() {
        return null;
    }
    
    private final void setSubscribedToSleepData(boolean newSubscribedToSleepData) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void onClickRequestSleepData(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    private final void subscribeToSleepSegmentUpdates(android.content.Context context, android.app.PendingIntent pendingIntent) {
    }
    
    private final void unsubscribeToSleepSegmentUpdates(android.content.Context context, android.app.PendingIntent pendingIntent) {
    }
    
    private final boolean activityRecognitionPermissionApproved() {
        return false;
    }
    
    private final void displayPermissionSettingsSnackBar() {
    }
    
    /**
     * Redimentary implementation of the output from multiple tables. The [LiveData] observers just
     * save their data to one of the strings (segmentOutput or classifyOutput) and triggers this
     * function.
     */
    private final void updateOutput() {
    }
    
    public MainActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/android/example/sleepcodelab/MainActivity$Companion;", "", "()V", "TAG", "", "complete_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}