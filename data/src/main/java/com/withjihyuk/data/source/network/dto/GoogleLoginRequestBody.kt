package com.withjihyuk.data.source.network.dto

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class GoogleLoginRequestBody(
    @Json(name = "code") val code: String
)