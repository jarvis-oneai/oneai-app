package com.nirvana

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.nirvana.ui.theme.NirvanaTheme
import com.nirvana.ui.navigation.NirvanaNavGraph


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NirvanaTheme {
                NirvanaNavGraph()
            }
        }
    }
}
