package com.android.example.sleepcodelab.data.db;

import java.lang.System;

/**
 * Stores all sleep segment data.
 */
@androidx.room.Database(entities = {com.android.example.sleepcodelab.data.db.SleepSegmentEventEntity.class, com.android.example.sleepcodelab.data.db.SleepClassifyEventEntity.class}, version = 3, exportSchema = false)
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\b"}, d2 = {"Lcom/android/example/sleepcodelab/data/db/SleepDatabase;", "Landroidx/room/RoomDatabase;", "()V", "sleepClassifyEventDao", "Lcom/android/example/sleepcodelab/data/db/SleepClassifyEventDao;", "sleepSegmentEventDao", "Lcom/android/example/sleepcodelab/data/db/SleepSegmentEventDao;", "Companion", "complete_debug"})
public abstract class SleepDatabase extends androidx.room.RoomDatabase {
    private static volatile com.android.example.sleepcodelab.data.db.SleepDatabase INSTANCE;
    @org.jetbrains.annotations.NotNull()
    public static final com.android.example.sleepcodelab.data.db.SleepDatabase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.android.example.sleepcodelab.data.db.SleepSegmentEventDao sleepSegmentEventDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.android.example.sleepcodelab.data.db.SleepClassifyEventDao sleepClassifyEventDao();
    
    public SleepDatabase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/android/example/sleepcodelab/data/db/SleepDatabase$Companion;", "", "()V", "INSTANCE", "Lcom/android/example/sleepcodelab/data/db/SleepDatabase;", "getDatabase", "context", "Landroid/content/Context;", "complete_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.android.example.sleepcodelab.data.db.SleepDatabase getDatabase(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}