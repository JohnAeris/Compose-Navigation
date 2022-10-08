package com.example.navigationcomponent

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

@Composable
fun Navigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Screen.MainScreen.route) {
        composable(route = Screen.MainScreen.route) {
            MainScreen(navController = navController)
        }
        composable(
            route = Screen.HomeScreen.route + "/{name}",
            arguments = listOf(
                navArgument("name"){
                    type = NavType.StringType
                    defaultValue = "John Doe"
                    nullable = true
                }
            )
        ) { entry ->
            HomeScreen(name = entry.arguments?.getString("name"), navController = navController)
        }
        composable(route = Screen.SettingScreen.route) {
            SettingScreen()
        }
    }
}