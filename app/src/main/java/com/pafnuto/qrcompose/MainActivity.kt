package com.pafnuto.qrcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.mutableStateOf
import com.pafnuto.qrcompose.screen.BuildScreen
import com.pafnuto.qrcompose.ui.theme.QRComposeTheme

class MainActivity : ComponentActivity() {

    private var textResult = mutableStateOf("")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QRComposeTheme {
        BuildScreen()
                }
            }
        }
    }



