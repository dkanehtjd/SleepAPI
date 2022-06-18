package com.android.example.sleepcodelab.receiver;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u0006H\'\u00a8\u0006\t"}, d2 = {"Lcom/android/example/sleepcodelab/receiver/SleepService;", "", "requestSleep", "Lretrofit2/Call;", "Lcom/android/example/sleepcodelab/receiver/Sleep;", "conf", "", "motion", "light", "complete_debug"})
public abstract interface SleepService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "sleep/")
    @retrofit2.http.FormUrlEncoded()
    public abstract retrofit2.Call<com.android.example.sleepcodelab.receiver.Sleep> requestSleep(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "conf")
    java.lang.String conf, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "motion")
    java.lang.String motion, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "light")
    java.lang.String light);
}