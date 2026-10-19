
package com.example.exploraapp.ui.sections

import androidx.compose.runtime.Composable
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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
fun FeaturedSection() {

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(12.dp)
            .height(180.dp)
            .clip(RoundedCornerShape(14.dp))
    ) {

        Image(
            painter = painterResource(R.drawable.paisaje_principal),
            contentDescription = "Paisaje turístico",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        Column(
            modifier = Modifier
                .align(Alignment.BottomStart)
                .padding(12.dp)
        ) {

            Text(
                text = "Explora",
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )

            Text(
                text = "Lugares increíbles cerca de ti",
                fontSize = 14.sp,
                color = Color.White
            )
        }
    }
}
