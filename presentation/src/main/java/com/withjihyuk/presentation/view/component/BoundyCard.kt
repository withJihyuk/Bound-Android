package com.withjihyuk.presentation.view.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun BoundEmojiCardComponent(subject: String, centerEmoji: String) {
    Box(
        modifier = Modifier
            .width(224.dp)
            .height(242.dp)
            .background(color = Color(0xFF434343), shape = RoundedCornerShape(size = 20.dp))
            .padding(start = 21.dp, top = 53.dp, end = 21.dp, bottom = 36.dp)

    ) {
        Box(
            Modifier
                .width(100.dp)
                .height(100.dp)
                .background(color = Color(0xFFFFFFFF), shape = RoundedCornerShape(size = 50.dp))
                .align(Alignment.TopCenter)
                .wrapContentSize(align = Alignment.Center)
        ) {
            Text(
                text = centerEmoji,
                style = TextStyle(fontSize = 40.sp)
            )
        }
        Text(
            modifier = Modifier.align(Alignment.BottomStart),
            text = subject,
            style = TextStyle(
                fontSize = 24.sp,
                lineHeight = 20.sp,
                fontWeight = FontWeight(700),
                color = Color(0xFFFFFFFF),
                letterSpacing = 0.25.sp,
            )
        )
    }
}