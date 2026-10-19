
package com.example.exploraapp.ui.sections

import androidx.compose.runtime.Composable
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.exploraapp.R

@Composable
fun PopularSection(modifier: Modifier = Modifier) {

    Column(modifier = modifier.fillMaxWidth()) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Destinos populares",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = "Ver todos",
                color = Color(0xFF5145C1),
                fontSize = 12.sp
            )
        }

        LazyColumn(
            modifier = Modifier.weight(1f),
            contentPadding = PaddingValues(12.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {

            repeat(3) { index ->

                item {

                    val nombre = when (index) {
                        0 -> "MONTAÑAS DE COLOMBIA"
                        1 -> "MONTAÑAS DE ANTIOQUIA "
                        else -> "PARQUE Histórico"
                    }

                    val imagen = when (index) {
                        0 -> R.drawable.montana
                        1 -> R.drawable.playa
                        else -> R.drawable.ciudad
                    }

                    val descripcion = when (index) {
                        0 -> "Un paraíso natural rodeado de montañas."
                        1 -> "n paraíso natural rodeado de montañas"
                        else -> "Historia y arquitectura en un solo lugar."
                    }

                    val categoria = when (index) {
                        0 -> "Naturaleza ⭐ 4.8"
                        1 -> "MONTAÑAS ⭐ 4.6"
                        else -> "Cultura ⭐ 4.7"
                    }

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(
                                Color(0xFFF5F5F5),
                                RoundedCornerShape(12.dp)
                            )
                            .padding(8.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {

                        Image(
                            painter = painterResource(imagen),
                            contentDescription = nombre,
                            modifier = Modifier
                                .size(80.dp)
                                .clip(RoundedCornerShape(10.dp)),
                            contentScale = ContentScale.Crop
                        )

                        Spacer(Modifier.width(10.dp))

                        Column(
                            modifier = Modifier.weight(1f)
                        ) {

                            Text(
                                text = nombre,
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Bold
                            )

                            Text(
                                text = categoria,
                                fontSize = 12.sp,
                                color = Color.Gray
                            )

                            Text(
                                text = descripcion,
                                fontSize = 11.sp,
                                color = Color.DarkGray,
                                maxLines = 2
                            )
                        }

                        Text(
                            text = "›",
                            fontSize = 26.sp,
                            color = Color.Gray
                        )
                    }
                }
            }
        }
    }
}
