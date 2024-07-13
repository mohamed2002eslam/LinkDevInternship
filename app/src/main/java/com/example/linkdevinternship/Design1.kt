package com.example.linkdevinternship

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun WhatsApp(modifier: Modifier=Modifier)
{
    Row(modifier = modifier
        .fillMaxWidth()
        .wrapContentHeight()
        .padding(vertical = 8.dp, horizontal = 16.dp)
    ) {
        Box(modifier = Modifier
            .size(50.dp)
            .background(color = Color.Green, shape = RoundedCornerShape(100.dp)))
        Column(modifier = Modifier
            .wrapContentHeight()
            .padding(vertical = 8.dp, horizontal = 8.dp),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.Start
            ) {
            Text(text = "THE 93+ PTG Pick is INSANE!", color = Color.White)
            Text(text = "NickRTFM . 79K views . 16 hours ago", color = Color.Red)

        }
        Column(modifier = Modifier
            .padding(start = 55.dp)) {
            Text(text = "$", color = Color.Blue)


        }

    }

}

@Preview
@Composable
private fun Preview_WhatsApp()
{
    WhatsApp()
}
