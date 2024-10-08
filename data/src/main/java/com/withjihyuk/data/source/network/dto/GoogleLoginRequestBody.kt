package com.withjihyuk.data.source.network.dto

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class GoogleLoginRequestBody(
    @Json(name = "access_token") val access_token: String
)