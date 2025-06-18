package com.example.foodappui.uiLayer.screen.screen.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.foodappui.data.sampleBeverages
import com.example.foodappui.uiLayer.screen.theme.FoodAppUiTheme

@Composable
fun BeverageCard(
    index: Int
){
    val card = sampleBeverages[index]
    var lastItemPadding=0.dp
    if(index== sampleBeverages.size-1){
        lastItemPadding= 16.dp
    }
    Box (
        modifier = Modifier
            .padding(start = 16.dp, end = lastItemPadding)
    ){
        Column(
            modifier = Modifier
                .clip(RoundedCornerShape(28.dp))
                .background(card.backgroundColor)
                .height(128.dp)
                .width(104.dp)
                .padding(vertical = 12.dp, horizontal = 16.dp),
            verticalArrangement = Arrangement.SpaceBetween

        ) {
            Text(card.name, style = FoodAppUiTheme.typography.bodySmall,
               color=  Color(0xFF3D405B)
                )
        }
        Image(
            painter = painterResource(card.imgRes),
            contentDescription = card.name,
            modifier= Modifier.size(94.dp)
                .align(Alignment.BottomEnd)

        )
    }
}