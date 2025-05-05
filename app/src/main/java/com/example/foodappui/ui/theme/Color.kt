package com.example.foodappui.ui.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

val pink = Color(0xFFF28482)
val Green = Color(0xFF84A59D)
val Yellow = Color(0xFFFFEF92)
val YellowLight= Color(0xFFFFFFF2)
val Dark = Color(0xFF3D405B)


@Immutable
data class  AppColors(
    val background: Color,
    val onBackground: Color,
    val surface: Color,
    val onSurface: Color,
    val secondarySurface: Color,
    val onSecondarySurface: Color,
    val regularSurface: Color,
    val onRegularSurface: Color,
    val highlightSurface: Color,
    val actionSurface: Color,
    val onActionSurface: Color,
    val onHighlightSurface: Color
)

val LocalAppColors= staticCompositionLocalOf {
    AppColors(
        background = Color.Unspecified,
        onBackground =  Color.Unspecified,
        surface = Color.Unspecified,
        onSurface = Color.Unspecified,
        secondarySurface = Color.Unspecified,
        onRegularSurface = Color.Unspecified,
        regularSurface = Color.Unspecified,
        onSecondarySurface = Color.Unspecified,
        actionSurface = Color.Unspecified,
        onActionSurface =  Color.Unspecified,
        onHighlightSurface = Color.Unspecified,
        highlightSurface = Color.Unspecified


    )
}

    val extendedColor= AppColors(
        background = Color.White,
        onBackground = Dark,
        surface = Color.White,
        onSurface = Dark,
        secondarySurface = pink,
        onSecondarySurface = Color.White,
        regularSurface = YellowLight,
        onRegularSurface = Dark,
        actionSurface = Yellow,
        onActionSurface = pink,
        highlightSurface = Green,
        onHighlightSurface = Color.White


    )


