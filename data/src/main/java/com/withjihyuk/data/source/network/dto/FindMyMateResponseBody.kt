package com.withjihyuk.data.source.network.dto

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class FindMyMateResponseBody(
    @Json(name = "myself_id") val myself_id: String,
    @Json(name = "myself_name") val myself_name: String,
    @Json(name = "opponent_id") val opponent_id: String,
    @Json(name = "opponent_name") val opponent_name: String,
)
