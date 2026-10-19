
package com.example.exploraapp.ui.sections

import androidx.compose.runtime.Composable
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
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
fun Header() {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFF5145C1))
            .padding(20.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {

        Column {

            Text(
                text = "Descubre",
                fontSize = 26.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )

            Text(
                text = "Nuevos destinos, nuevas historias",
                fontSize = 13.sp,
                color = Color.White
            )
        }

        Image(
            painter = painterResource(R.drawable.perfil_destino),
            contentDescription = "Imagen de destino",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(48.dp)
                .border(2.dp, Color.White, CircleShape)
                .clip(CircleShape)
        )
    }
}
