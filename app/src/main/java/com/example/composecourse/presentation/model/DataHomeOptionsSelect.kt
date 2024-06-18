package com.example.composecourse.presentation.model

import androidx.annotation.ColorInt
import androidx.compose.ui.graphics.Color

data class DataHomeOptionsSelect(
    val title: String,
    @ColorInt val color: Color,
    val route: () -> Unit
)
