package com.withjihyuk.presentation.view.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.sp
import com.withjihyuk.presentation.R

val pretendard = FontFamily(
    Font(R.font.pretendard_regular),
    Font(R.font.pretendard_semibold),
    Font(R.font.pretendard_extrabold),
    Font(R.font.pretendard_medium),
)

val Typography = Typography(
    titleLarge = TextStyle(
        fontSize = 32.sp,
        lineHeight = 41.6.sp,
        fontFamily = pretendard
    ),
    labelLarge = TextStyle(
        fontSize = 16.sp,
        lineHeight = 20.8.sp,
        fontFamily = pretendard
    ),
    bodySmall = TextStyle(
        fontSize = 14.sp,
        lineHeight = 18.2.sp,
        fontFamily = pretendard
    ),
    bodyMedium = TextStyle(
        fontSize = 16.sp,
        lineHeight = 20.8.sp,
        fontFamily = pretendard
    ),
    bodyLarge = TextStyle(
        fontSize = 20.sp,
        lineHeight = 26.sp,
        fontFamily = pretendard
    )
)