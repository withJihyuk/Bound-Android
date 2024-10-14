package com.withjihyuk.presentation.view.onBoarding.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.withjihyuk.presentation.R
import com.withjihyuk.presentation.view.component.BoundEmojiCardComponent


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun StartLoginPage(
    navController: NavController,
) {
    val scrollState = rememberScrollState()
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .windowInsetsPadding(WindowInsets.statusBars),
        color = Color(0xFF2A2A2A)
    ) {
        Column(Modifier.padding(top = 34.dp, start = 20.dp)) {
            Icon(
                painter = painterResource(R.drawable.arrow),
                contentDescription = "화살표",
                tint = Color.White
            )
            Text(
                modifier = Modifier.padding(top = 53.dp),
                text = "반가워요\uD83D\uDC4B \n먼저 로그인 해볼까요?",
                style = TextStyle(
                    lineHeight = 31.2.sp,
                    color = Color.White,
                    fontSize = 24.sp,
                    fontWeight = FontWeight.W600,
                )
            )
            Row(
                Modifier
                    .padding(top = 26.dp)
                    .horizontalScroll(scrollState),
                horizontalArrangement = Arrangement.spacedBy(12.dp)

            ) {
                BoundEmojiCardComponent(subject = "오늘 내 하트는?", centerEmoji = "👀")
                BoundEmojiCardComponent(subject = "지금 내 기분은?", centerEmoji = "🐹")
            }
        }
    }
}