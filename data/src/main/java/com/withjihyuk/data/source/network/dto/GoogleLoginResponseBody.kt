package com.withjihyuk.data.source.network.dto

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class GoogleLoginResponseBody(
    @Json(name = "example") val example: String
)
