package com.withjihyuk.data.source.network.api;

import com.withjihyuk.data.source.network.dto.GoogleLoginRequestBody
import com.withjihyuk.data.source.network.dto.GoogleLoginResponseBody
import com.withjihyuk.data.source.network.dto.TermsRequestBody

import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.POST

interface AuthAPI {
    @POST("/auth")
    suspend fun googleLoginAuth(
        @Body body: GoogleLoginRequestBody
    ): GoogleLoginResponseBody

    @POST("/auth/terms")
    suspend fun terms(
        @Body body: TermsRequestBody
    )

    @POST("/auth/logout")
    suspend fun logout(
    )

    @DELETE("/auth/withdraw")
    suspend fun withdraw()
}
