package com.example.foodappui.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider

@Composable
 fun FoodAppUiTheme(
     content: @Composable () -> Unit
 ){
     CompositionLocalProvider(
         LocalAppColors provides extendedColor,
         LocalAppTypography provides extendedTypography

     ) {
         MaterialTheme (
             content = content
         )

     }
 }

object FoodAppUiTheme {
    val colors : AppColors
    @Composable
    get() = LocalAppColors.current

    val typography: AppTypography
        @Composable
        get() = LocalAppTypography.current
}