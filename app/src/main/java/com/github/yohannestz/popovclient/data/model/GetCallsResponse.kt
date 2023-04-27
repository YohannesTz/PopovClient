package com.github.yohannestz.popovclient.data.model

data class GetCallsResponse(
    val result: List<Call>,
    val success: Boolean
)