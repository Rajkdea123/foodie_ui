package com.example.foodappui.data

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Color
import com.example.foodappui.R

data class beverage(
    val name: String, val backgroundColor: Color, @DrawableRes val imgRes: Int
)

val sampleBeverages = listOf(
    beverage(
        backgroundColor = Color(0xFFFFEF92),
        name = "burger",
        imgRes = R.drawable.img_burger,
    ), beverage(
        backgroundColor = Color(0xFFF5CAC3),
        name = "Fries",
        imgRes = R.drawable.fries,

    ), beverage(
        backgroundColor = Color(0xFFB6D7CF),
        name = "Drinks",
        imgRes = R.drawable.colddrink,

    ), beverage(
        backgroundColor = Color(0xFFFFEF92),
        name = "burger",
        imgRes = R.drawable.img_burger,

    ), beverage(
        backgroundColor = Color(0xFFF5CAC3),

        name = "Fries",
        imgRes = R.drawable.fries,

    ), beverage(
        backgroundColor = Color(0xFFB6D7CF),

        name = "Drinks",
        imgRes = R.drawable.colddrink,

    ), beverage(
        backgroundColor = Color(0xFFFFEF92),
        name = "burger",
        imgRes = R.drawable.img_burger,

    )

)


