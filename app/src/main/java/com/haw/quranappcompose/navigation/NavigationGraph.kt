package com.haw.quranappcompose.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.haw.quranappcompose.presentation.screen.home.HomeScreen
import com.haw.quranappcompose.presentation.screen.splash.SplashScreen

@Composable
fun NavigationGraph() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screen.SplashScreen.name
    ) {
        val mainRoute = Screen.HomeScreen.name

        composable(Screen.SplashScreen.name) {
            SplashScreen(navController = navController)
        }
        composable(Screen.HomeScreen.name) {
            HomeScreen(navController = navController)
        }
    }

}