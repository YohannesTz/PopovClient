package com.github.yohannestz.popovclient.data.model

import com.google.gson.annotations.SerializedName

data class HeartBeat(
    @SerializedName("botId")
    val botId: String,
    val date: String,
    val id: Int
)