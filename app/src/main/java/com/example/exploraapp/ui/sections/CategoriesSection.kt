

package com.example.exploraapp.ui.sections

import androidx.compose.runtime.Composable
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.exploraapp.R

@Composable
fun CategoriesSection() {

    LazyRow(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 12.dp),
        contentPadding = PaddingValues(horizontal = 12.dp),
        horizontalArrangement = Arrangement.spacedBy(12.dp)
    ) {

        repeat(5) { index ->

            item {

                val nombre = when (index) {
                    0 -> "Montaña"
                    1 -> "Bosque"
                    2 -> "Playa"
                    3 -> "Ciudad"
                    else -> "Favoritos"
                }

                val imagen = when (index) {
                    0 -> R.drawable.montana
                    1 -> R.drawable.bosque
                    2 -> R.drawable.playa
                    3 -> R.drawable.ciudad
                    else -> R.drawable.favoritos
                }

                Column(
                    modifier = Modifier.width(65.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {

                    Image(
                        painter = painterResource(imagen),
                        contentDescription = nombre,
                        modifier = Modifier
                            .size(58.dp)
                            .clip(CircleShape),
                        contentScale = ContentScale.Crop
                    )

                    Spacer(
                        modifier = Modifier.height(6.dp)
                    )

                    Text(
                        text = nombre,
                        fontSize = 11.sp,
                        color = Color.Black,
                        maxLines = 1
                    )
                }
            }
        }
    }
}
