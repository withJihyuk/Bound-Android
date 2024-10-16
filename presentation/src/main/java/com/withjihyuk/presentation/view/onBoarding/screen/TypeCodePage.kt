package com.withjihyuk.presentation.view.onBoarding.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.withjihyuk.presentation.R
import com.withjihyuk.presentation.view.component.BoundButton
import com.withjihyuk.presentation.view.theme.GrayStyles

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun TypeCodePage() {
    val value: String = ""
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .windowInsetsPadding(WindowInsets.statusBars),
        color = Color(0xFF2A2A2A)
    ) {
        Column(
            Modifier
                .fillMaxSize()
                .padding(top = 34.dp)
                .padding(horizontal = 20.dp)

        ) {
            Icon(
                painter = painterResource(R.drawable.arrow),
                contentDescription = "화살표",
                tint = Color.White
            )
            Text(
                modifier = Modifier.padding(top = 53.dp),
                text = "함께하실 상대방의\n코드를 입력 해주세요",
                fontWeight = FontWeight.ExtraBold,
                color = Color.White,
                style = typography.titleLarge
            )
            BasicTextField(
                modifier = Modifier
                    .padding(top = 238.dp)
                    .size(width = 640.dp, height = 56.dp)
                    .background(color = GrayStyles.gray08, shape = RoundedCornerShape(8.dp)),
                decorationBox = {
                    Row(
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "테스트",
                            color = GrayStyles.gray05,
                            style = typography.titleMedium
                        )
                    }
                },
                value = "",
                onValueChange = { value }
            )
            Text(
                modifier = Modifier
                    .padding(top = 15.dp)
                    .fillMaxWidth(),
                textAlign = TextAlign.End,
                text = "대신 내 코드 공유하기",
                style = typography.bodyMedium,
                color = GrayStyles.gray05
            )
            Column(Modifier.padding(top = 248.dp)) {
                BoundButton(modifier = Modifier, text = "계속하기", onClickAction = {})
            }
        }
    }
}

@Preview
@Composable
fun TypeCodePagePreview() {
    TypeCodePage()
}