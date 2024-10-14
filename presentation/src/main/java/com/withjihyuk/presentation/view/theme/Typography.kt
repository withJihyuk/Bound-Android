package com.withjihyuk.presentation.view.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.withjihyuk.presentation.R

val Typography = Typography(
    titleLarge = TextStyle(
        fontSize = 24.sp,
        lineHeight = 31.2.sp,
        fontFamily = FontFamily(Font(R.font.pretendard)),
        fontWeight = FontWeight(600),
    ),
    labelLarge = TextStyle(
        fontSize = 16.sp,
        lineHeight = 20.8.sp,
        fontFamily = FontFamily(Font(R.font.pretendard)),
        fontWeight = FontWeight(600),
    ),
    bodySmall = TextStyle(
        fontSize = 14.sp,
        lineHeight = 18.2.sp,
        fontFamily = FontFamily(Font(R.font.pretendard)),
        fontWeight = FontWeight(400),
    ),
    bodyMedium = TextStyle(
        fontSize = 16.sp,
        lineHeight = 20.8.sp,
        fontFamily = FontFamily(Font(R.font.pretendard)),
        fontWeight = FontWeight(400),
    ),
    bodyLarge = TextStyle(
        fontSize = 20.sp,
        lineHeight = 26.sp,
        fontFamily = FontFamily(Font(R.font.pretendard)),
        fontWeight = FontWeight(500),
    )
)