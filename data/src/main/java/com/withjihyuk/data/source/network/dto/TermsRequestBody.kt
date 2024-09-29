package com.withjihyuk.data.source.network.dto

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TermsRequestBody(
    @Json(name = "TERMS_OF_USAGE") val TERMS_OF_USAGE : Boolean,
    @Json(name = "PERSONAL_DATA_USAGE") val PERSONAL_DATA_USAGE : Boolean,
    @Json(name = "ADVERTISING") val ADVERTISING: Boolean
)
