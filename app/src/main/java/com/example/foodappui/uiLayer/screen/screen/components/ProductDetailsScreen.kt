package com.example.foodappui.uiLayer.screen.screen.components

import androidx.compose.ui.Modifier
import com.example.foodappui.data.OrderData
import com.example.foodappui.data.OrderState
import com.example.foodappui.data.ProductDescriptionData
import com.example.foodappui.data.ProductFlowerData
import com.example.foodappui.data.ProductFlowerState
import com.example.foodappui.data.ProductNutritionData
import com.example.foodappui.data.ProductNutritionState
import com.example.foodappui.data.ProductPreviewState

fun ProductDetailsScreen(
    modifier: Modifier= Modifier,
    productPreviewState: ProductPreviewState= ProductPreviewState(),
    productFlowerState: List<ProductFlowerState> = ProductFlowerData,
    productNutritionState: ProductNutritionState= ProductNutritionData,
    productDescription: String= ProductDescriptionData,
    orderState: OrderState= OrderData,
    onAddItemClicked: () -> Unit= {},
    onRemoveItemClicked: () -> Unit = {},
    onCheckOutClicked: () -> Unit= {}
) {
}