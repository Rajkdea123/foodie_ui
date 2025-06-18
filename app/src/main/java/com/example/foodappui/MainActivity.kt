package com.example.foodappui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.foodappui.data.OrderState
import com.example.foodappui.uiLayer.screen.screen.components.ProductDetailsScreen
import com.example.foodappui.uiLayer.screen.screen.components.SummaryScreen
import com.example.foodappui.uiLayer.screen.theme.FoodAppUiTheme


private const val PRODUCT_PRICE_PER_UNIT = 5.25
private const val PRODUCT_CURRENCY = "$"

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FoodAppUiTheme {

                val navController = rememberNavController()
                NavHost(
                    navController = navController, startDestination = "product"
                ) {
                    composable("product") {
                        ProductScreen(navController)
                    }

                    composable("summary") {
                        SummaryScreen()
                    }
                }

            }
        }
    }
}

@Composable

private  fun ProductScreen(navController: NavController){

    var amount by remember { mutableStateOf(5) }
    val totalPrice by derivedStateOf { amount * PRODUCT_PRICE_PER_UNIT }

    Column(modifier = Modifier.fillMaxSize()) {

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            contentAlignment = Alignment.Center
        ) {
            Button(
                onClick = { navController.navigate("summary") },
                shape = RoundedCornerShape(50),
                modifier = Modifier
                    .fillMaxWidth(0.5f)
                    .height(50.dp)
            ) {
                Text("Summary Page")
            }
        }
        // your existing details UI

        ProductDetailsScreen(
            orderState = OrderState(
                amount = amount,
                totalPrice = "$PRODUCT_CURRENCY${"%.2f".format(totalPrice)}"
            ),
            onAddItemClicked = { amount++ },
            onRemoveItemClicked = { if (amount > 0) amount-- }
        )

        // spacer so button floats near bottom
        Spacer(modifier = Modifier.weight(1f))

    }
}




