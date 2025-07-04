package com.example.foodappui.uiLayer.screen.screen.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.foodappui.data.ProductHighlightState
import com.example.foodappui.data.ProductHighlightType
import com.example.foodappui.uiLayer.screen.theme.FoodAppUiTheme


@Composable
fun ProductHighlights(
    modifier: Modifier=Modifier,
    highlights: List<ProductHighlightState>
) {
    Column(
        modifier= modifier,
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        highlights.onEach { item->
            Highlight(
                text= item.text,
                colors = HighlightDefaults.colors(item.type)
            )
        }
    }
}

@Composable
private fun Highlight(
    modifier: Modifier = Modifier,
    text: String,
    colors: HighlightColors = HighlightDefaults.defaultColors
) {
    Surface(
        modifier = modifier,
        shape = RoundedCornerShape(percent = 50),
        color = colors.containerColor,
        contentColor = colors.contentColor
    ) {
        Box(
            modifier = Modifier.padding(
                vertical = 10.dp,
                horizontal = 12.dp
            )
        ) {
            Text(
                text = text,
                style = FoodAppUiTheme.typography.titleSmall.copy(fontWeight = FontWeight.Bold)
            )
        }
    }
}

private object HighlightDefaults {

    val defaultColors = HighlightColors(
        containerColor = Color.Unspecified,
        contentColor = Color.Unspecified
    )

    @Composable
    fun colors(type: ProductHighlightType): HighlightColors = when (type) {
        ProductHighlightType.SECONDARY -> HighlightColors(
            containerColor = FoodAppUiTheme.colors.actionSurface,
            contentColor = FoodAppUiTheme.colors.onActionSurface
        )

        ProductHighlightType.PRIMARY -> HighlightColors(
            containerColor = FoodAppUiTheme.colors.highlightSurface,
            contentColor = FoodAppUiTheme.colors.onHighlightSurface
        )
    }
}

@Immutable
private data class HighlightColors(
    val containerColor: Color,
    val contentColor: Color
)
