package com.haw.quranappcompose.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.haw.quranappcompose.R
import com.haw.quranappcompose.ui.theme.MOTIVATION_ITEM_HEIGHT
import com.haw.quranappcompose.ui.theme.SIZE_16_DP
import com.haw.quranappcompose.ui.theme.SIZE_24_DP
import com.haw.quranappcompose.ui.theme.SIZE_6_DP
import com.haw.quranappcompose.ui.theme.SIZE_8_DP
import com.haw.quranappcompose.ui.theme.colorPrimary

@Composable
fun MotivationCard() {
    Card(
        modifier = Modifier
            .height(MOTIVATION_ITEM_HEIGHT)
            .padding(start = SIZE_16_DP, end = SIZE_16_DP),
        shape = RoundedCornerShape(size = SIZE_8_DP),
        backgroundColor = colorPrimary
    ) {
        Image(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
            painter = painterResource(id = R.drawable.img_bg_motivation),
            contentScale = ContentScale.Crop,
            contentDescription = ""
        )
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(start = SIZE_16_DP),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Center
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = SIZE_16_DP, end = SIZE_16_DP),
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    modifier = Modifier
                        .height(SIZE_24_DP)
                        .width(SIZE_24_DP),
                    alignment = Alignment.Center,
                    painter = painterResource(id = R.drawable.ic_motivation_book),
                    contentDescription = stringResource(
                        R.string.motivation_book
                    )
                )
                Text(
                    modifier = Modifier
                        .padding(start = SIZE_6_DP),
                    text = stringResource(R.string.motivasi),
                    style = MaterialTheme.typography.h6.copy(fontWeight = FontWeight.Bold),
                    color = Color.White
                )
            }
            Text(
                modifier = Modifier
                    .padding(
                        top = SIZE_8_DP,
                        start = SIZE_16_DP,
                        end = SIZE_16_DP,
                        bottom = SIZE_8_DP
                    ),
                text = stringResource(R.string.sample_motivasi),
                style = MaterialTheme.typography.h6,
                color = Color.White
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MotivationCardPreview() {
    MotivationCard()
}

