package com.withjihyuk.presentation.view.onBoarding.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.withjihyuk.presentation.view.onBoarding.screen.StartLoginPage
import com.withjihyuk.presentation.view.onBoarding.screen.TermsPage
import com.withjihyuk.presentation.view.onBoarding.screen.TypeCodePage

fun NavGraphBuilder.onBoarding(navController: NavController) {
    navigation(startDestination = "termsPage", route = "onBoarding") {
        composable("startLoginPage") { StartLoginPage() }
        composable("typeCodePage") { TypeCodePage() }
        composable("termsPage") { TermsPage() }
    }
}