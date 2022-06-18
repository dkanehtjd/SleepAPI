package com.android.example.sleepcodelab;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000fR\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\n\u00a8\u0006\u0014"}, d2 = {"Lcom/android/example/sleepcodelab/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/android/example/sleepcodelab/data/SleepRepository;", "(Lcom/android/example/sleepcodelab/data/SleepRepository;)V", "allSleepClassifyEventEntities", "Landroidx/lifecycle/LiveData;", "", "Lcom/android/example/sleepcodelab/data/db/SleepClassifyEventEntity;", "getAllSleepClassifyEventEntities", "()Landroidx/lifecycle/LiveData;", "allSleepSegments", "Lcom/android/example/sleepcodelab/data/db/SleepSegmentEventEntity;", "getAllSleepSegments", "subscribedToSleepDataLiveData", "", "getSubscribedToSleepDataLiveData", "updateSubscribedToSleepData", "Lkotlinx/coroutines/Job;", "subscribed", "complete_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> subscribedToSleepDataLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.android.example.sleepcodelab.data.db.SleepSegmentEventEntity>> allSleepSegments = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.android.example.sleepcodelab.data.db.SleepClassifyEventEntity>> allSleepClassifyEventEntities = null;
    private final com.android.example.sleepcodelab.data.SleepRepository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getSubscribedToSleepDataLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job updateSubscribedToSleepData(boolean subscribed) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.android.example.sleepcodelab.data.db.SleepSegmentEventEntity>> getAllSleepSegments() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.android.example.sleepcodelab.data.db.SleepClassifyEventEntity>> getAllSleepClassifyEventEntities() {
        return null;
    }
    
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.android.example.sleepcodelab.data.SleepRepository repository) {
        super();
    }
}