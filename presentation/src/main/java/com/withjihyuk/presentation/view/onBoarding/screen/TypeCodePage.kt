package com.withjihyuk.presentation.view.onBoarding.screen

import android.annotation.SuppressLint
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun TypeCodePage(navController: NavController) {
    Scaffold {
        Text(text = "안녕")
    }
}