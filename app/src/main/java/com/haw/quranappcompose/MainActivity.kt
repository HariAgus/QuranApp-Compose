package com.haw.quranappcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.haw.quranappcompose.navigation.NavigationGraph
import com.haw.quranappcompose.ui.theme.QuranAppComposeTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QuranAppComposeTheme {
                NavigationGraph()
            }
        }
    }
}