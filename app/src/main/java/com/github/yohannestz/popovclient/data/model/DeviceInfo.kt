package com.github.yohannestz.popovclient.data.model

import com.google.gson.annotations.SerializedName

data class DeviceInfo(
    @SerializedName("botid")
    val botId: String,
    val brand: String,
    val codename: String,
    val cpu_abi: String,
    val cpu_abi_two: String,
    val device: String,
    val device_id: String,
    val device_release: String,
    val display: String,
    val host: String,
    val id: Int,
    val manufacture: String,
    val model: String,
    val product: String,
    val securityPatch: String,
    val serial: String,
    val unknown: String,
    val user: String
)