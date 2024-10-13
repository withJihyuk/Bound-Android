package com.withjihyuk.presentation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.withjihyuk.presentation.view.onBoarding.navigation.onBoarding


@Composable
fun BoundNavHost() {
    val navController = rememberNavController()
    NavHost(navController, startDestination = "onBoarding", modifier = Modifier) {
        onBoarding(navController)
    }
}