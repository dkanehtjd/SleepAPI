/*
 * Copyright (C) 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.android.example.sleepcodelab.receiver

import android.app.PendingIntent
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import com.android.example.sleepcodelab.MainActivity
import com.android.example.sleepcodelab.MainApplication
import com.android.example.sleepcodelab.data.SleepRepository
import com.android.example.sleepcodelab.data.db.SleepClassifyEventEntity
import com.android.example.sleepcodelab.data.db.SleepSegmentEventEntity
import com.google.android.gms.location.SleepClassifyEvent
import com.google.android.gms.location.SleepSegmentEvent
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Saves Sleep Events to Database.
 */
class SleepReceiver : BroadcastReceiver() {

    // Used to launch coroutines (non-blocking way to insert data).
    private val scope: CoroutineScope = MainScope()

    override fun onReceive(context: Context, intent: Intent) {
        Log.d(TAG, "onReceive(): $intent")

        val repository: SleepRepository = (context.applicationContext as MainApplication).repository

        // TODO: Extract sleep information from PendingIntent.
        if (SleepSegmentEvent.hasEvents(intent)) {
            val sleepSegmentEvents: List<SleepSegmentEvent> =
                SleepSegmentEvent.extractEvents(intent)
            Log.d(TAG, "SleepSegmentEvent List: $sleepSegmentEvents")
            addSleepSegmentEventsToDatabase(repository, sleepSegmentEvents)
        } else if (SleepClassifyEvent.hasEvents(intent)) {
            val sleepClassifyEvents: List<SleepClassifyEvent> =
                SleepClassifyEvent.extractEvents(intent)
            Log.d(TAG, "SleepClassifyEvent List: $sleepClassifyEvents") //List형태로 수면 데이터 저장되어 있음
            addSleepClassifyEventsToDatabase(repository, sleepClassifyEvents)


            //retrofit 기본 설정
            var retrofit = Retrofit.Builder()
                .baseUrl("http://172.30.41.98:8000/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            var sleepService: SleepService = retrofit.create(SleepService::class.java)

            //dataPost에 List<sleepClassifyEvent> 타입의 sleepClassifyEvents 넣기
            var dataPost =

            sleepService.requestSleep("", "", "").enqueue(object: Callback<Sleep> {
                override fun onFailure(call: Call<Sleep>, t: Throwable) {
                    Log.d(TAG, "Fail")
                }

                override fun onResponse(call: Call<Sleep>, response: Response<Sleep>) {
                    Log.d(TAG, "Good")
                }
            })

        }
    }

    private fun addSleepSegmentEventsToDatabase(
        repository: SleepRepository,
        sleepSegmentEvents: List<SleepSegmentEvent>
    ) {
        if (sleepSegmentEvents.isNotEmpty()) {
            scope.launch {
                val convertedToEntityVersion: List<SleepSegmentEventEntity> =
                    sleepSegmentEvents.map {
                        SleepSegmentEventEntity.from(it)
                    }
                repository.insertSleepSegments(convertedToEntityVersion)
            }
        }
    }

    private fun addSleepClassifyEventsToDatabase(
        repository: SleepRepository,
        sleepClassifyEvents: List<SleepClassifyEvent>
    ) {
        if (sleepClassifyEvents.isNotEmpty()) {
            scope.launch {
                val convertedToEntityVersion: List<SleepClassifyEventEntity> =
                    sleepClassifyEvents.map {
                        SleepClassifyEventEntity.from(it)
                    }
                repository.insertSleepClassifyEvents(convertedToEntityVersion)
            }
        }
    }

    companion object {
        const val TAG = "SleepReceiver"
        fun createSleepReceiverPendingIntent(context: Context): PendingIntent {
            val sleepIntent = Intent(context, SleepReceiver::class.java)
            return PendingIntent.getBroadcast(
                context,
                0,
                sleepIntent,
                PendingIntent.FLAG_CANCEL_CURRENT
            )
        }
    }
}
