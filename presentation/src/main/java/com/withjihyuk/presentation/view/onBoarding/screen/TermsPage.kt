package com.withjihyuk.presentation.view.onBoarding.screen

import android.annotation.SuppressLint
import android.util.Log
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
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.withjihyuk.presentation.R
import com.withjihyuk.presentation.view.component.BoundButton
import com.withjihyuk.presentation.view.theme.GrayStyles

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun TermsPage() {
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
                text = "이용약관에 동의 해주세요",
                fontWeight = FontWeight.ExtraBold,
                color = Color.White,
                style = typography.titleLarge
            )
            Text(
                modifier = Modifier.padding(top = 106.dp),
                text = "필수 약관입니다.",
                color = GrayStyles.gray07,
                style = typography.bodyLarge
            )
            SelectableOptions(text = "이용약관 동의")
            SelectableOptions(text = "개인정보 수집 및 이용 동의 ")
            Text(
                modifier = Modifier.padding(top = 28.dp),
                text = "필수 약관입니다.",
                color = GrayStyles.gray07,
                style = typography.bodyLarge
            )
            SelectableOptions(text = "광고성 알림 동의")
            Column(Modifier.padding(top = 100.dp)) {
                BoundButton(
                    modifier = Modifier,
                    text = "마무리하기",
                    onClickAction = { }
                )
            }
        }
    }
}

@Composable
fun SelectableOptions(text: String) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .padding(top = 24.dp)
            .fillMaxWidth()
    ) {
        Row(
            Modifier
        ) {
            Checkbox(
                modifier = Modifier
                    .size(20.dp)
                    .align(Alignment.CenterVertically),
                checked = false,
                onCheckedChange = { Log.d("INFO", "눌렸어요") },
                colors = CheckboxDefaults.colors(
                    uncheckedColor = GrayStyles.gray04,
                    checkedColor = GrayStyles.gray08

                )
            )
            Text(
                modifier = Modifier.padding(start = 14.dp),
                text = text,
                color = Color.White,
                style = typography.titleMedium,
            )
        }
        Icon(
            painter = painterResource(R.drawable.arrow),
            modifier = Modifier
                .rotate(180f)
                .size(24.dp),
            contentDescription = "화살표",
            tint = Color.White
        )
    }
}

@Preview
@Composable
fun TermsPagePreview() {
    TermsPage()
}