package com.example.navigationcomponent

sealed class Screen(val route: String) {
    object MainScreen: Screen("main_screen")
    object HomeScreen: Screen("home_screen")
    object SettingScreen: Screen("setting_screen")

    fun withArgs(vararg args: String): String {
        return buildString {
            append(route)
            args.forEach { arg ->
                append("/$arg")
            }
        }
    }
}
