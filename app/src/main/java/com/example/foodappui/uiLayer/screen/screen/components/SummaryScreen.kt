package com.example.foodappui.uiLayer.screen.screen.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Tune
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.foodappui.R
import com.example.foodappui.data.sampleBeverages
import com.example.foodappui.uiLayer.screen.theme.FoodAppUiTheme

@Preview
@Composable
fun SummaryScreen(
    modifier: Modifier = Modifier
) {
    Column(
        horizontalAlignment = Alignment.Start,
        modifier = Modifier
            .padding(horizontal = 20.dp, vertical = 50.dp)
            .verticalScroll(rememberScrollState())
    ) {
        Surface(
            tonalElevation = 2.dp,
            color = Color(0xFFFFFFF2),
            shape = RoundedCornerShape(28.dp),
            modifier = modifier.fillMaxWidth()

        ) {
            Row(
                horizontalArrangement = Arrangement.Center, modifier = modifier.padding(
                    horizontal = 20.dp, vertical = 12.dp
                )
            ) {
                Image(
                    painter = painterResource(R.drawable.mask_group),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(64.dp)
                        .clip(CircleShape)
                )

                Spacer(modifier = Modifier.width(12.dp))
                Text(
                    "Welcome back, Pin! How Hungry are you?", style = TextStyle(
                        fontWeight = FontWeight.W300,
                        fontSize = 16.sp,
                        color = MaterialTheme.colorScheme.onSurface
                    )

                )

            }
        }
        Spacer(modifier = Modifier.height(26.dp))
        Row(
            modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically

        ) {
            Surface(
                modifier = Modifier
                    .weight(1f)
                    .height(50.dp),
                shape = RoundedCornerShape(16.dp),
                color = Color(0xFFF5F5F5),
                tonalElevation = 0.dp


            ) {
                Row(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(start = 20.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        imageVector = Icons.Filled.Search,
                        contentDescription = "Search..",
                        tint = Color(0xFFB0B0B0)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        "Search....", color = Color(0xFFB0B0B0)
                    )
                }
            }
            Spacer(modifier = Modifier.width(12.dp))
            Box(
                modifier = Modifier
                    .size(50.dp)
                    .clip(RoundedCornerShape(16.dp))
                    .background(Color(0xFFF28482)), contentAlignment = Alignment.Center

            ) {
                Icon(
                    imageVector = Icons.Filled.Tune,
                    contentDescription = "Filter",
                    tint = Color.White
                )

            }

        }
        Spacer(Modifier.height(26.dp))

        Text(
            text = "Today's Menu",
            style = FoodAppUiTheme.typography.titleSmall,
            color = FoodAppUiTheme.colors.onBackground
            // Must use .sp for font size
        )
        Spacer(Modifier.height(16.dp))
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .size(128.dp)
                .background(
                    color = Color(0xFF84A59D), shape = RoundedCornerShape(28.dp)
                )
                .padding(20.dp)
        ) {
            Column(
                modifier = Modifier.align(Alignment.CenterStart)
            ) {
                Text(
                    text = "Free Donut!",
                    fontWeight = FontWeight.W700,
                    fontSize = 24.sp,
                    color = Color.White
                )
                Spacer(modifier.height(2.dp))

                Text(
                    text = "For orders over \$20",
                    fontWeight = FontWeight.W300,
                    fontSize = 16.sp,
                    color = Color(0xFFF4F1DE)

                )
            }
            Image(
                painter = painterResource(id = R.drawable.donut),
                contentDescription = null,
                modifier = Modifier
                    .size(120.dp)
                    .align(Alignment.TopEnd)
                    .offset(x = 24.dp, y = (-40).dp)
            )
        }
        Spacer(modifier.height(32.dp))
        LazyRow {

            items(sampleBeverages.size) { index ->
                BeverageCard(
                    index
                )

            }

        }
        Spacer(modifier.height(32.dp))
        Text(
            text = "Best Offers",
            style = FoodAppUiTheme.typography.titleLarge,
            color = Color(0xFF3D405B)
        )
        Spacer(modifier.height(16.dp))
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color(0xFFFFFFFF), shape = RoundedCornerShape(28.dp))
        ) {
            Row(
                modifier = Modifier.padding(horizontal = 24.dp, vertical = 14.dp),
                horizontalArrangement = Arrangement.Start

            ) {
                Image(
                    painter = painterResource(id = R.drawable.double_berger),
                    contentDescription = null,
                    modifier = Modifier.size(height = 88.dp, width = 88.dp)

                )
                Spacer(modifier.width(20.dp))
                Column(
                    horizontalAlignment = Alignment.Start
                ) {
                    Text(
                        text = "Frenchdog",
                        style = FoodAppUiTheme.typography.titleLarge,
                        color = Color(0xFF3D405B)
                    )

                    Text(
                        text = "Tasty&Spicy \uD83C\uDF36\uD83C\uDF36\uD83C\uDF36",
                        style = FoodAppUiTheme.typography.bodySmall,
                        color = Color(0xFF3D405B)
                    )
                }

            }
            Spacer(modifier.height(12.dp))

            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(28.dp),
                elevation = CardDefaults.cardElevation(2.dp),
                colors = CardDefaults.cardColors(Color.White)

            ) {
                Row(
                    modifier = Modifier.padding(horizontal = 32.dp, vertical = 22.dp),
                    horizontalArrangement = Arrangement.Start
                ) {
                    Column(
                        horizontalAlignment = Alignment.Start

                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.donut),
                            contentDescription = "donut",
                            modifier = Modifier.size(height = 32.dp, width = 32.dp)
                        )
                        Spacer(modifier.height(2.dp))
                        Text(
                            text = "Location",
                            fontWeight = FontWeight.W300,
                            fontSize = 12.sp,
                            color = Color(0xFF3D405B)

                        )
                    }
                    Spacer(modifier.width(32.dp))

                    Column(
                        horizontalAlignment = Alignment.Start

                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.donut),
                            contentDescription = "donut",
                            modifier = Modifier.size(height = 32.dp, width = 32.dp)
                        )
                        Spacer(modifier.height(2.dp))
                        Text(
                            text = "Home",
                            fontWeight = FontWeight.W300,
                            fontSize = 12.sp,
                            color = Color(0xFF3D405B)

                        )
                    }
                    Spacer(modifier.width(32.dp))
                    Column(
                        horizontalAlignment = Alignment.Start

                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.donut),
                            contentDescription = "donut",
                            modifier = Modifier.size(height = 32.dp, width = 32.dp)
                        )
                        Spacer(modifier.height(2.dp))
                        Text(
                            text = "Cart",
                            fontWeight = FontWeight.W300,
                            fontSize = 12.sp,
                            color = Color(0xFF3D405B)

                        )
                    }
                    Spacer(modifier.width(32.dp))

                    Column(
                        horizontalAlignment = Alignment.Start
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.donut),
                            contentDescription = "donut",
                            modifier = Modifier.size(height = 32.dp, width = 32.dp)
                        )
                        Spacer(modifier.height(2.dp))
                        Text(
                            text = "Me",
                            fontWeight = FontWeight.W300,
                            fontSize = 12.sp,
                            color = Color(0xFF3D405B),
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis

                        )
                    }
                }

            }
            Spacer(modifier.height(20.dp))

        }

    }
}