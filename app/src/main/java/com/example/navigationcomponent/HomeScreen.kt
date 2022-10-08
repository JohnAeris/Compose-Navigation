package com.example.navigationcomponent

import androidx.compose.foundation.layout.*
import androidx.compose.ui.Alignment
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun HomeScreen(name: String?, navController: NavController) {

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()) {

        Text(
            text = "Second Screen",
            fontSize = 24.sp,
            fontWeight = FontWeight.Black
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Hello, $name")

        Spacer(modifier = Modifier.height(8.dp))

        Button(
            onClick = {
                navController.navigate(Screen.SettingScreen.route)
            }) {
            Text(text = "Next")
        }

    }


}