package com.github.yohannestz.popovclient.data.model

import com.google.gson.annotations.SerializedName

data class Sms(
    val id: Int,
    @SerializedName("botId")
    val botId: String,
    val date: String,
    @SerializedName("phonenumber")
    val phoneNumber: String,
    @SerializedName("smsid")
    val smsId: Int,
    @SerializedName("textbody")
    val textBody: String,
    @SerializedName("texttype")
    val textType: String
)