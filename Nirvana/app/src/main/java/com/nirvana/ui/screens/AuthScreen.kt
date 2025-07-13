package com.nirvana.ui.screens

import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigate
import android.util.Patterns
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.text.input.*
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.compose.runtime.Composable

@Composable
fun AuthScreen(navController: NavHostController) {
    var userInput by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var otpSent by remember { mutableStateOf(false) }

    val isEmail = Patterns.EMAIL_ADDRESS.matcher(userInput).matches()
    val isPhone = Regex("^[6-9]\\d{9}$").matches(userInput)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.Center
    ) {
        TextField(
            value = userInput,
            onValueChange = { userInput = it },
            label = { Text("Email or Indian Phone Number") },
            singleLine = true,
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(12.dp))

        if (isEmail) {
            TextField(
                value = password,
                onValueChange = { password = it },
                label = { Text("Password") },
                singleLine = true,
                visualTransformation = PasswordVisualTransformation(),
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(12.dp))
            Button(onClick = {
                navController.navigate("dashboard")
            }, modifier = Modifier.fillMaxWidth()) {
                Text("Login with Email")
            }
        } else if (isPhone) {
            if (!otpSent) {
                Button(onClick = {
                    otpSent = true // Replace with real OTP logic
                }, modifier = Modifier.fillMaxWidth()) {
                    Text("Send OTP")
                }
            } else {
                TextField(
                    value = password,
                    onValueChange = { password = it },
                    label = { Text("Enter OTP") },
                    singleLine = true,
                    modifier = Modifier.fillMaxWidth()
                )
                Spacer(modifier = Modifier.height(12.dp))
                Button(onClick = {
                    navController.navigate("dashboard")
                }, modifier = Modifier.fillMaxWidth()) {
                    Text("Verify OTP")
                }
            }
        }
    }
}
