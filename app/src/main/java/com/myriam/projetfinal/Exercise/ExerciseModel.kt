package com.myriam.projetfinal.Exercise


import androidx.compose.ui.graphics.Color

data class Exercise(
    val title: String,
    val description: String,
    val id: String,
    val imageRes: Int,
    val starsRes: Int,
    val colors: List<Color>
)
