package com.example.foodappui.data

import androidx.annotation.DrawableRes
import com.example.foodappui.R

data class ProductFlowerState(
    val name: String, val price: String, @DrawableRes val imgRes: Int
)


val ProductFlowerData = listOf(
    ProductFlowerState(
        imgRes = R.drawable.img_burger, name = "Cheddar", price = "$0.79"
    ),
    ProductFlowerState(
        imgRes = R.drawable.img_burger, name = "Bacon", price = "0.52"
    ),

    ProductFlowerState(
        imgRes = R.drawable.img_burger,
        name = "Onion",
        price = "$0.28",
    ),

    )
