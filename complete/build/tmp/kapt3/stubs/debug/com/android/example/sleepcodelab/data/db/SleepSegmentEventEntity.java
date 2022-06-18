package com.android.example.sleepcodelab.data.db;

import java.lang.System;

/**
 * Data class for Sleep Segment Events which represents the time the user slept at night.
 */
@androidx.room.Entity(tableName = "sleep_segment_events_table")
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0006H\u00c6\u0003J\'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0018"}, d2 = {"Lcom/android/example/sleepcodelab/data/db/SleepSegmentEventEntity;", "", "startTimeMillis", "", "endTimeMillis", "status", "", "(JJI)V", "getEndTimeMillis", "()J", "getStartTimeMillis", "getStatus", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "Companion", "complete_debug"})
public final class SleepSegmentEventEntity {
    @androidx.room.ColumnInfo(name = "start_time_millis")
    @androidx.room.PrimaryKey()
    private final long startTimeMillis = 0L;
    @androidx.room.ColumnInfo(name = "end_time_millis")
    private final long endTimeMillis = 0L;
    @androidx.room.ColumnInfo(name = "status")
    private final int status = 0;
    @org.jetbrains.annotations.NotNull()
    public static final com.android.example.sleepcodelab.data.db.SleepSegmentEventEntity.Companion Companion = null;
    
    public final long getStartTimeMillis() {
        return 0L;
    }
    
    public final long getEndTimeMillis() {
        return 0L;
    }
    
    public final int getStatus() {
        return 0;
    }
    
    public SleepSegmentEventEntity(long startTimeMillis, long endTimeMillis, int status) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final long component2() {
        return 0L;
    }
    
    public final int component3() {
        return 0;
    }
    
    /**
     * Data class for Sleep Segment Events which represents the time the user slept at night.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.android.example.sleepcodelab.data.db.SleepSegmentEventEntity copy(long startTimeMillis, long endTimeMillis, int status) {
        return null;
    }
    
    /**
     * Data class for Sleep Segment Events which represents the time the user slept at night.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * Data class for Sleep Segment Events which represents the time the user slept at night.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Data class for Sleep Segment Events which represents the time the user slept at night.
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/android/example/sleepcodelab/data/db/SleepSegmentEventEntity$Companion;", "", "()V", "from", "Lcom/android/example/sleepcodelab/data/db/SleepSegmentEventEntity;", "sleepSegmentEvent", "Lcom/google/android/gms/location/SleepSegmentEvent;", "complete_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.android.example.sleepcodelab.data.db.SleepSegmentEventEntity from(@org.jetbrains.annotations.NotNull()
        com.google.android.gms.location.SleepSegmentEvent sleepSegmentEvent) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}