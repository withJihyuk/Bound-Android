package com.withjihyuk.data.source.network.api;

import com.withjihyuk.data.source.network.dto.GoogleLoginRequestBody
import com.withjihyuk.data.source.network.dto.TermsRequestBody

import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST

interface MateAPI {
    @POST("/mate/code")
    suspend fun createMateCode(
//        @Body body: CreateMateCodeRequestBody
    )

    @POST("/mate/code/opponent")
    suspend fun linkMateCode(
//        @Body body: LinkMateCodeRequestBody
    )

//    @GET("/mate")
//    suspend fun getMyMateInfo(): GetMyMateInfoResponseBody
}
