package com.withjihyuk.presentation.view.onBoarding.screen

import android.annotation.SuppressLint
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun StartPage(
    modifier: Modifier = Modifier,
) {
    Scaffold {
        Text(text = "테스트")
    }
}

@Composable
fun MyApp() {
    val navController = rememberNavController()
    NavHost(navController, startDestination = "home", modifier = Modifier) {
        composable("home") {
            StartPage(modifier = Modifier)
        }
    }
}