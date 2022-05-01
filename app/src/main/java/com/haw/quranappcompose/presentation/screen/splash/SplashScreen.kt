package com.haw.quranappcompose.presentation.screen.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.haw.quranappcompose.R
import com.haw.quranappcompose.ui.theme.backgroundPrimary
import com.haw.quranappcompose.ui.theme.fontColorPrimary

@Composable
fun SplashScreen() {
    Splash()
}

@Composable
fun Splash() {
    Box(
        modifier = Modifier
            .background(backgroundPrimary)
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                modifier = Modifier
                    .width(220.dp)
                    .height(240.dp),
                painter = painterResource(id = R.drawable.ic_logo),
                contentDescription = stringResource(R.string.icon_logo)
            )
            Text(
                textAlign = TextAlign.Center,
                text = "Ahlul Quran",
                style = MaterialTheme.typography.h1,
                color = fontColorPrimary
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SplashScreenPreview() {
    Splash()
}