package com.android.example.sleepcodelab.data.db;

import java.lang.System;

/**
 * Entity class (table version of the class) for [SleepClassifyEvent] which represents a sleep
 * classification event including the classification timestamp, the sleep confidence, and the
 * supporting data such as device motion and ambient light level. Classification events are
 * reported regularly.
 */
@androidx.room.Entity(tableName = "sleep_classify_events_table")
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t\u00a8\u0006\u0019"}, d2 = {"Lcom/android/example/sleepcodelab/data/db/SleepClassifyEventEntity;", "", "timestampSeconds", "", "confidence", "motion", "light", "(IIII)V", "getConfidence", "()I", "getLight", "getMotion", "getTimestampSeconds", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "Companion", "start_debug"})
public final class SleepClassifyEventEntity {
    @androidx.room.ColumnInfo(name = "time_stamp_seconds")
    @androidx.room.PrimaryKey()
    private final int timestampSeconds = 0;
    @androidx.room.ColumnInfo(name = "confidence")
    private final int confidence = 0;
    @androidx.room.ColumnInfo(name = "motion")
    private final int motion = 0;
    @androidx.room.ColumnInfo(name = "light")
    private final int light = 0;
    @org.jetbrains.annotations.NotNull()
    public static final com.android.example.sleepcodelab.data.db.SleepClassifyEventEntity.Companion Companion = null;
    
    public final int getTimestampSeconds() {
        return 0;
    }
    
    public final int getConfidence() {
        return 0;
    }
    
    public final int getMotion() {
        return 0;
    }
    
    public final int getLight() {
        return 0;
    }
    
    public SleepClassifyEventEntity(int timestampSeconds, int confidence, int motion, int light) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int component4() {
        return 0;
    }
    
    /**
     * Entity class (table version of the class) for [SleepClassifyEvent] which represents a sleep
     * classification event including the classification timestamp, the sleep confidence, and the
     * supporting data such as device motion and ambient light level. Classification events are
     * reported regularly.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.android.example.sleepcodelab.data.db.SleepClassifyEventEntity copy(int timestampSeconds, int confidence, int motion, int light) {
        return null;
    }
    
    /**
     * Entity class (table version of the class) for [SleepClassifyEvent] which represents a sleep
     * classification event including the classification timestamp, the sleep confidence, and the
     * supporting data such as device motion and ambient light level. Classification events are
     * reported regularly.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * Entity class (table version of the class) for [SleepClassifyEvent] which represents a sleep
     * classification event including the classification timestamp, the sleep confidence, and the
     * supporting data such as device motion and ambient light level. Classification events are
     * reported regularly.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Entity class (table version of the class) for [SleepClassifyEvent] which represents a sleep
     * classification event including the classification timestamp, the sleep confidence, and the
     * supporting data such as device motion and ambient light level. Classification events are
     * reported regularly.
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/android/example/sleepcodelab/data/db/SleepClassifyEventEntity$Companion;", "", "()V", "from", "Lcom/android/example/sleepcodelab/data/db/SleepClassifyEventEntity;", "sleepClassifyEvent", "Lcom/google/android/gms/location/SleepClassifyEvent;", "start_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.android.example.sleepcodelab.data.db.SleepClassifyEventEntity from(@org.jetbrains.annotations.NotNull()
        com.google.android.gms.location.SleepClassifyEvent sleepClassifyEvent) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}