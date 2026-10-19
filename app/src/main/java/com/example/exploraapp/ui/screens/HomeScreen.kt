
package com.example.exploraapp.ui.screens

import androidx.compose.runtime.Composable
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

import com.example.exploraapp.ui.sections.Header
import com.example.exploraapp.ui.sections.FeaturedSection
import com.example.exploraapp.ui.sections.CategoriesSection
import com.example.exploraapp.ui.sections.PopularSection

@Composable
fun HomeScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF5145C1))
            .statusBarsPadding()
            .background(Color.White)
    ) {

        Header()

        FeaturedSection()

        CategoriesSection()

        PopularSection(
            modifier = Modifier.weight(1f)
        )
    }
}
