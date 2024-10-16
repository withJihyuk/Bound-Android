package com.withjihyuk.presentation.view.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.withjihyuk.presentation.R
import com.withjihyuk.presentation.view.theme.boundTypography
import javax.security.auth.Subject

@Composable
fun BoundTextCard(subject: String, textStyle: TextStyle, imageUrl: String) {
    Box(
        modifier = Modifier
            .width(224.dp)
            .height(242.dp)
            .background(
                color = Color(0xFF434343),
                shape = RoundedCornerShape(size = 20.dp)
            )
    ) {
        Image(
            modifier = Modifier
                .fillMaxSize()
                .clip(RoundedCornerShape(20.dp)),
            painter = painterResource(R.drawable.example),
            contentScale = ContentScale.Crop,
            contentDescription = "예시"
        )
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 28.dp, vertical = 28.dp)
        ) {
            Text(
                modifier = Modifier.align(Alignment.BottomStart),
                text = subject,
                style = textStyle,
                color = Color.White,
            )
        }
    }
}

@Preview
@Composable
fun BoundTextCardPreview() {
    BoundTextCard(subject = "집가고싶다", textStyle = boundTypography.titleMedium , imageUrl = "")
}