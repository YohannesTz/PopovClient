package com.github.yohannestz.popovclient.data.model

import com.google.gson.annotations.SerializedName

data class Call(
    @SerializedName("botid")
    val botId: String,
    val callDuration: String,
    @SerializedName("calldate")
    val callDate: String,
    @SerializedName("callid")
    val callId: Int,
    @SerializedName("callname")
    val callName: String,
    @SerializedName("callnumber")
    val callNumber: String,
    @SerializedName("calltype")
    val callType: String,
    val id: Int,
    val isCallNew: String
)