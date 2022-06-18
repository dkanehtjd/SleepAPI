package com.android.example.sleepcodelab.data.datastore;

import java.lang.System;

/**
 * Saves the sleep data subscription status into a [DataStore].
 * Used to check if the app is still listening to changes in sleep data when the app is brought
 * back into the foreground.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u000fB\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u0019\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/android/example/sleepcodelab/data/datastore/SleepSubscriptionStatus;", "", "dataStore", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "(Landroidx/datastore/core/DataStore;)V", "subscribedToSleepDataFlow", "Lkotlinx/coroutines/flow/Flow;", "", "getSubscribedToSleepDataFlow", "()Lkotlinx/coroutines/flow/Flow;", "updateSubscribedToSleepData", "", "subscribedToSleepData", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "PreferencesKeys", "complete_debug"})
public final class SleepSubscriptionStatus {
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<java.lang.Boolean> subscribedToSleepDataFlow = null;
    private final androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> dataStore = null;
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.lang.Boolean> getSubscribedToSleepDataFlow() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateSubscribedToSleepData(boolean subscribedToSleepData, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    public SleepSubscriptionStatus(@org.jetbrains.annotations.NotNull()
    androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> dataStore) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u00c2\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/android/example/sleepcodelab/data/datastore/SleepSubscriptionStatus$PreferencesKeys;", "", "()V", "SUBSCRIBED_TO_SLEEP_DATA", "Landroidx/datastore/preferences/core/Preferences$Key;", "", "getSUBSCRIBED_TO_SLEEP_DATA", "()Landroidx/datastore/preferences/core/Preferences$Key;", "complete_debug"})
    static final class PreferencesKeys {
        @org.jetbrains.annotations.NotNull()
        private static final androidx.datastore.preferences.core.Preferences.Key<java.lang.Boolean> SUBSCRIBED_TO_SLEEP_DATA = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.android.example.sleepcodelab.data.datastore.SleepSubscriptionStatus.PreferencesKeys INSTANCE = null;
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.datastore.preferences.core.Preferences.Key<java.lang.Boolean> getSUBSCRIBED_TO_SLEEP_DATA() {
            return null;
        }
        
        private PreferencesKeys() {
            super();
        }
    }
}