package com.nirvana.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.unit.*
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigate
import androidx.compose.runtime.Composable

@Composable
fun GoPremiumScreen(navController: NavHostController) {
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(24.dp)) {

        Text("Nirvana Premium", fontSize = 26.sp)
        Spacer(modifier = Modifier.height(16.dp))
        Text("Unlock advanced features and full integrations for just ₹199/month.", fontSize = 16.sp)

        Spacer(modifier = Modifier.height(24.dp))
        Button(onClick = {
            // TODO: set premium flag
            navController.navigate("dashboard")
        }, modifier = Modifier.fillMaxWidth()) {
            Text("Activate Premium")
        }
    }
}