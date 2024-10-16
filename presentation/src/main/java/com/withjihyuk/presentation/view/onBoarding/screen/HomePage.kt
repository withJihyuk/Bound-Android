package com.withjihyuk.presentation.view.onBoarding.screen

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.withjihyuk.presentation.R
import com.withjihyuk.presentation.view.component.BoundTextCard
import com.withjihyuk.presentation.view.theme.GrayStyles
import com.withjihyuk.presentation.view.theme.MainBackgroundColor
import com.withjihyuk.presentation.view.theme.boundTypography

@Composable
fun HomePage() {
    Surface(
        Modifier
            .fillMaxSize()
            .windowInsetsPadding(WindowInsets.statusBars),
        color = MainBackgroundColor
    ) {
        val scrollState = rememberScrollState()
        Column(
            Modifier
                .padding(top = 34.dp)
                .padding(horizontal = 24.dp)
        ) {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
            ) {
                Icon(
                    painter = painterResource(R.drawable.logo),
                    contentDescription = "로고",
                    tint = Color.White
                )
                Icon(Icons.Filled.Notifications, contentDescription = "테스트", tint = Color.White)
            }
            Text(
                modifier = Modifier.padding(top = 135.dp),
                text = "지혁님은 아직\n오늘의 바운드를 보내지 않았어요",
                fontWeight = FontWeight.ExtraBold,
                color = Color.White,
                style = typography.titleLarge
            )
            Text(
                modifier = Modifier.padding(top = 24.dp),
                text = "신호 보내기",
                fontWeight = FontWeight.ExtraBold,
                color = GrayStyles.gray07,
                style = typography.bodyLarge,
                textDecoration = TextDecoration.Underline
            )
            Text(
                modifier = Modifier.padding(top = 108.dp),
                text = "내 바운드",
                fontWeight = FontWeight.ExtraBold,
                color = Color.White,
                style = typography.titleLarge
            )
            Row(
                Modifier
                    .padding(top = 14.dp)
                    .horizontalScroll(scrollState)
                , horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                BoundTextCard(
                    subject = "집가고싶다",
                    textStyle = boundTypography.titleMedium,
                    imageUrl = ""
                )
                BoundTextCard(
                    subject = "집가고싶다",
                    textStyle = boundTypography.titleMedium,
                    imageUrl = ""
                )
            }
        }
    }
}

@Preview
@Composable
fun HomePagePreview() {
    HomePage()
}