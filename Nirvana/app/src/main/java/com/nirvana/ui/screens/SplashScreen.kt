package com.nirvana.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigate
import kotlinx.coroutines.delay
import androidx.compose.foundation.background
import androidx.compose.ui.draw.alpha
import androidx.compose.runtime.Composable

@Composable
fun SplashScreen(navController: NavHostController) {
    var opacity by remember { mutableStateOf(0f) }

    LaunchedEffect(true) {
        delay(500)
        opacity = 1f
        delay(2500)
        navController.navigate("auth") {
            popUpTo("splash") { inclusive = true }
        }
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.linearGradient(
                    colors = listOf(Color(0xFF0F2027), Color(0xFF203A43), Color(0xFF2C5364)) // Liquid Glass Gradient
                )
            ),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Nirvana",
            fontSize = 48.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White,
            modifier = Modifier
                .alpha(opacity),
            textAlign = TextAlign.Center
        )
    }
}
