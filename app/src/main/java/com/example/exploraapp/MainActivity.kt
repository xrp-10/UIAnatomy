
package com.example.exploraapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.exploraapp.ui.screens.HomeScreen
import com.example.exploraapp.ui.theme.ExploraAppTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            ExploraAppTheme {
                HomeScreen()
            }
        }
    }
}
