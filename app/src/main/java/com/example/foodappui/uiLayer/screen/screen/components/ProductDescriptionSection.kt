package com.example.foodappui.uiLayer.screen.screen.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.foodappui.uiLayer.screen.theme.FoodAppUiTheme

@Composable
fun ProductDescriptionSection(
    modifier: Modifier= Modifier,
    productDescription: String
) {
    Column(
        modifier= modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(11.dp),
        horizontalAlignment = Alignment.Start
    ) {
        Text(
            text = "Description",
            style = FoodAppUiTheme.typography.titleLarge,
            color = FoodAppUiTheme.colors.onBackground
        )
        Text(
            text = productDescription,
            style = FoodAppUiTheme.typography.body,
            color = FoodAppUiTheme.colors.onBackground,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Justify
        )
    }
}