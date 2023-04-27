package com.github.yohannestz.popovclient.data.model

data class GetSmsResponse(
    val result: List<Sms>,
    val success: Boolean
)