package com.example.foodappui.uiLayer.screen.screen.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.foodappui.data.Calories
import com.example.foodappui.data.NutritionState
import com.example.foodappui.data.ProductNutritionState
import com.example.foodappui.uiLayer.screen.theme.FoodAppUiTheme


@Composable
fun ProductNutritionSection(
    modifier: Modifier= Modifier,
    state: ProductNutritionState
) {
    Column (
      modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ){
        SectionHeader(
            title= "Nutrition facts",
            calories = state.calories
        )
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()
        ) {
            state.nutrition.onEach { item -> NutritionItem(state= item) }
        }

    }
}

@Composable
private  fun SectionHeader(
   modifier: Modifier= Modifier,
   title: String,
   calories: Calories
){
    Row(
        modifier= modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = title,
            style = FoodAppUiTheme.typography.titleLarge,
            color = FoodAppUiTheme.colors.onBackground
        )
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            Text(
                text = calories.value,
                style = FoodAppUiTheme.typography.titleMedium,
                color = FoodAppUiTheme.colors.onBackground
            )
            Text(
                text = calories.unit,
                style = FoodAppUiTheme.typography.titleMedium,
                color = FoodAppUiTheme.colors.onBackground
            )
        }
    }
}

@Composable
 private  fun NutritionItem(modifier: Modifier= Modifier,  state: NutritionState) {
     Column(
         modifier = modifier,
         verticalArrangement = Arrangement.spacedBy(2.dp),
         horizontalAlignment = Alignment.CenterHorizontally
     ) {
         Row(
             horizontalArrangement = Arrangement.spacedBy(4.dp),
             verticalAlignment = Alignment.CenterVertically
         ) {
             Text(
                 text = state.amount,
                 style = FoodAppUiTheme.typography.titleMedium,
                 fontWeight = FontWeight.Light,
                 color = FoodAppUiTheme.colors.onBackground
             )
             Text(
                 text = state.unit,
                 style = FoodAppUiTheme.typography.titleMedium,
                 color = FoodAppUiTheme.colors.onBackground,
                 fontWeight = FontWeight.Light
             )
         }
         Text(
             text = state.title,
             style = FoodAppUiTheme.typography.label,
             color = FoodAppUiTheme.colors.onBackground
         )
     }

}
