package com.android.example.sleepcodelab.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0019\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\u00162\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ\u0019\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u0010H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eJ\u001f\u0010\u001f\u001a\u00020\u00162\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00100\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ\u0019\u0010!\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u0013H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006$"}, d2 = {"Lcom/android/example/sleepcodelab/data/SleepRepository;", "", "sleepSubscriptionStatus", "Lcom/android/example/sleepcodelab/data/datastore/SleepSubscriptionStatus;", "sleepSegmentEventDao", "Lcom/android/example/sleepcodelab/data/db/SleepSegmentEventDao;", "sleepClassifyEventDao", "Lcom/android/example/sleepcodelab/data/db/SleepClassifyEventDao;", "(Lcom/android/example/sleepcodelab/data/datastore/SleepSubscriptionStatus;Lcom/android/example/sleepcodelab/data/db/SleepSegmentEventDao;Lcom/android/example/sleepcodelab/data/db/SleepClassifyEventDao;)V", "allSleepClassifyEvents", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/android/example/sleepcodelab/data/db/SleepClassifyEventEntity;", "getAllSleepClassifyEvents", "()Lkotlinx/coroutines/flow/Flow;", "allSleepSegmentEvents", "Lcom/android/example/sleepcodelab/data/db/SleepSegmentEventEntity;", "getAllSleepSegmentEvents", "subscribedToSleepDataFlow", "", "getSubscribedToSleepDataFlow", "insertSleepClassifyEvent", "", "sleepClassifyEventEntity", "(Lcom/android/example/sleepcodelab/data/db/SleepClassifyEventEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertSleepClassifyEvents", "sleepClassifyEventEntities", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertSleepSegment", "sleepSegmentEventEntity", "(Lcom/android/example/sleepcodelab/data/db/SleepSegmentEventEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertSleepSegments", "sleepSegmentEventEntities", "updateSubscribedToSleepData", "subscribedToSleepData", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "complete_debug"})
public final class SleepRepository {
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<java.lang.Boolean> subscribedToSleepDataFlow = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<java.util.List<com.android.example.sleepcodelab.data.db.SleepSegmentEventEntity>> allSleepSegmentEvents = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<java.util.List<com.android.example.sleepcodelab.data.db.SleepClassifyEventEntity>> allSleepClassifyEvents = null;
    private final com.android.example.sleepcodelab.data.datastore.SleepSubscriptionStatus sleepSubscriptionStatus = null;
    private final com.android.example.sleepcodelab.data.db.SleepSegmentEventDao sleepSegmentEventDao = null;
    private final com.android.example.sleepcodelab.data.db.SleepClassifyEventDao sleepClassifyEventDao = null;
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.lang.Boolean> getSubscribedToSleepDataFlow() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateSubscribedToSleepData(boolean subscribedToSleepData, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.android.example.sleepcodelab.data.db.SleepSegmentEventEntity>> getAllSleepSegmentEvents() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertSleepSegment(@org.jetbrains.annotations.NotNull()
    com.android.example.sleepcodelab.data.db.SleepSegmentEventEntity sleepSegmentEventEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertSleepSegments(@org.jetbrains.annotations.NotNull()
    java.util.List<com.android.example.sleepcodelab.data.db.SleepSegmentEventEntity> sleepSegmentEventEntities, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.android.example.sleepcodelab.data.db.SleepClassifyEventEntity>> getAllSleepClassifyEvents() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertSleepClassifyEvent(@org.jetbrains.annotations.NotNull()
    com.android.example.sleepcodelab.data.db.SleepClassifyEventEntity sleepClassifyEventEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertSleepClassifyEvents(@org.jetbrains.annotations.NotNull()
    java.util.List<com.android.example.sleepcodelab.data.db.SleepClassifyEventEntity> sleepClassifyEventEntities, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    public SleepRepository(@org.jetbrains.annotations.NotNull()
    com.android.example.sleepcodelab.data.datastore.SleepSubscriptionStatus sleepSubscriptionStatus, @org.jetbrains.annotations.NotNull()
    com.android.example.sleepcodelab.data.db.SleepSegmentEventDao sleepSegmentEventDao, @org.jetbrains.annotations.NotNull()
    com.android.example.sleepcodelab.data.db.SleepClassifyEventDao sleepClassifyEventDao) {
        super();
    }
}