package com.github.yohannestz.popovclient.data.model

import com.google.gson.annotations.SerializedName

data class GetDeviceInfoResponse(
    @SerializedName("result")
    val result: List<DeviceInfo>,
    val success: Boolean
)