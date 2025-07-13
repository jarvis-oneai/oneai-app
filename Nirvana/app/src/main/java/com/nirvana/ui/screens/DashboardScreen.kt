package com.nirvana.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigate
import androidx.compose.runtime.Composable

@Composable
fun DashboardScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp)
    ) {
        Text("Hi Vishal!", fontSize = 28.sp, style = MaterialTheme.typography.headlineMedium)

        Spacer(modifier = Modifier.height(24.dp))
        Text("Your schedule today:")
        // TODO: Show schedule fetched from data sources

        Spacer(modifier = Modifier.height(16.dp))
        Text("Goals:")
        Text("• Weekly, Monthly, Quarterly, Yearly")
        // TODO: Make widgets interactive

        Spacer(modifier = Modifier.height(32.dp))
        Button(onClick = { navController.navigate("profile") }) {
            Text("View Profile")
        }

        Spacer(modifier = Modifier.height(12.dp))
        Button(onClick = { navController.navigate("premium") }) {
            Text("Go Premium")
        }
    }
}
