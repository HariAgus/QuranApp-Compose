package com.haw.quranappcompose.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.haw.quranappcompose.R

val Poppins = FontFamily(
    Font(R.font.poppins_extra_light),
    Font(R.font.poppins_light),
    Font(R.font.poppins_medium),
    Font(R.font.poppins_medium_italic),
    Font(R.font.poppins_semi_bold),
    Font(R.font.poppins_semi_bold_italic),
    Font(R.font.poppins_bold),
    Font(R.font.poppins_extra_bold),
)

val PoppinsTypography = Typography(
    h1 = TextStyle(
        fontFamily = Poppins,
        fontWeight = FontWeight.Bold,
        fontSize = 24.sp
    ),
)