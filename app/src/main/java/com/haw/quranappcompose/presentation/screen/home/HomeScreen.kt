package com.haw.quranappcompose.presentation.screen.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import com.haw.quranappcompose.R
import com.haw.quranappcompose.presentation.component.MotivationCard
import com.haw.quranappcompose.ui.theme.SIZE_16_DP
import com.haw.quranappcompose.ui.theme.backgroundPrimary

@Composable
fun HomeScreen(
    navController: NavController
) {
    Scaffold(
        content = { HomeContent() }
    )
}

@Composable
fun HomeContent() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(backgroundPrimary),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            modifier = Modifier
                .padding(dimensionResource(id = R.dimen.padding_24dp))
                .fillMaxWidth()
                .height(dimensionResource(id = R.dimen.padding_26dp)),
            painter = painterResource(id = R.drawable.ic_ahlul_quran),
            contentDescription = stringResource(
                R.string.ic_ahlul_quran
            )
        )
        MotivationCard()
    }
}