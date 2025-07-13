package com.nirvana.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme



private val DarkColors = darkColorScheme(
    primary = Color(0xFF0D47A1),
    background = Color(0xFF121212),
    onPrimary = Color.White
)

private val LightColors = lightColorScheme(
    primary = Color(0xFF1976D2),
    background = Color.White,
    onPrimary = Color.White
)

@Composable
fun NirvanaTheme(
    useDarkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = if (useDarkTheme) DarkColors else LightColors,
        content = content
    )
}
