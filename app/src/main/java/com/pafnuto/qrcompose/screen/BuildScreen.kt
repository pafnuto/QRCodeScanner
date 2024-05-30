package com.pafnuto.qrcompose.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pafnuto.qrcompose.R


@Composable
@Preview
fun BuildScreen() {
    Scaffold(
        bottomBar = {
            BottomAppBar(
                actions = {},
                floatingActionButton = {
                    FloatingActionButton(
                        onClick = {  }
                    ) {
                        Icon(
                            painter = painterResource(
                                id = R.drawable.ic_launcher_background
                            ),
                            contentDescription = "QR Code"
                        )
                    }
                }
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.qr_scanner),
                contentDescription = "Увеличить QR Code",
                modifier = Modifier
                    .size(120.dp)
                    .clickable {},
            )
            Text(
                text = "Сканировать",
                fontSize = 40.sp
            )
        }

    }
}
