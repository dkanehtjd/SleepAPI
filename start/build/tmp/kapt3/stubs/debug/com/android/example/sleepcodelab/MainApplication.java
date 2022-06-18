package com.android.example.sleepcodelab;

import java.lang.System;

/**
 * Sets up repository for all sleep data.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u000e"}, d2 = {"Lcom/android/example/sleepcodelab/MainApplication;", "Landroid/app/Application;", "()V", "database", "Lcom/android/example/sleepcodelab/data/db/SleepDatabase;", "getDatabase", "()Lcom/android/example/sleepcodelab/data/db/SleepDatabase;", "database$delegate", "Lkotlin/Lazy;", "repository", "Lcom/android/example/sleepcodelab/data/SleepRepository;", "getRepository", "()Lcom/android/example/sleepcodelab/data/SleepRepository;", "repository$delegate", "start_debug"})
public final class MainApplication extends android.app.Application {
    private final kotlin.Lazy database$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy repository$delegate = null;
    
    private final com.android.example.sleepcodelab.data.db.SleepDatabase getDatabase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.android.example.sleepcodelab.data.SleepRepository getRepository() {
        return null;
    }
    
    public MainApplication() {
        super();
    }
}