package com.android.example.sleepcodelab.receiver

import com.android.example.sleepcodelab.data.db.SleepClassifyEventEntity
import com.google.android.gms.location.SleepClassifyEvent
import com.google.gson.JsonObject
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface SleepService {

    @FormUrlEncoded
    @POST("sleep/")
    fun requestSleep(
        @Field("conf") conf: String,
        @Field("motion") motion: String,
        @Field("light") light: String
    ): Call<Sleep>
}


