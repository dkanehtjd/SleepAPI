package com.android.example.sleepcodelab.receiver

import com.google.gson.annotations.SerializedName

data class Sleep(
    var conf : String?,
    var motion : String?,
    var light : String?
)