package com.example.navigationcomponent

import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SettingScreen() {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Text(
            text = "Third Screen",
            fontSize = 24.sp,
            fontWeight = FontWeight.Black,
            modifier = Modifier.padding(bottom = 70.dp)
        )

        Text(text = "Setting Screen")
    }
}