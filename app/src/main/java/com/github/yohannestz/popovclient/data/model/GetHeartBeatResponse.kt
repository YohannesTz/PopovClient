package com.github.yohannestz.popovclient.data.model

import com.google.gson.annotations.SerializedName

data class GetHeartBeatResponse(
    @SerializedName("result")
    val result: List<HeartBeat>,
    val success: Boolean
)