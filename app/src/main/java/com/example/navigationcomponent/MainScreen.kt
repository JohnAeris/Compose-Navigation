package com.example.navigationcomponent

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun MainScreen(navController: NavController) {

    var name by remember { mutableStateOf("") }

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(50.dp)) {

        Text(
            text = "First Screen",
            fontSize = 24.sp,
            fontWeight = FontWeight.Black
        )

        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(
            value = name,
            onValueChange = { name = it },
            placeholder = { Text(text = "name", color = Color.Black) },
            singleLine = true,
            modifier = Modifier.fillMaxWidth(),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color.Blue,
                unfocusedBorderColor = Color.Red
            )
            )

        Spacer(modifier = Modifier.height(8.dp))

        Button(
            onClick = {
                      navController.navigate(Screen.HomeScreen.withArgs(name))
            },
            modifier = Modifier.align(Alignment.End)) {
            Text(text = "Next")
        }
    }
}