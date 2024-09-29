package com.withjihyuk.data.source.network.api

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MateAPI(
    @Json(name = "example") val example: String
)