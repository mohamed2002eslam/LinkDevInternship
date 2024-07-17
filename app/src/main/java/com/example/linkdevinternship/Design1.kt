package com.example.linkdevinternship

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun WhatsApp(modifier: Modifier=Modifier,
             singleChat:SingleChat=SingleChat()

)
{
    Row(modifier = modifier
        .fillMaxWidth()

        .wrapContentHeight()
        .background(color = Color.White),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Row {
            Image(
                painter = painterResource(id = singleChat.imageURL),
                contentDescription = null,
                modifier = Modifier
                    .size(50.dp)
                    .padding(8.dp)
                    .background(color = Color.Green, shape = RoundedCornerShape(100.dp))
            )
//        Box(modifier = Modifier
//            .size(50.dp)
//            .background(color = Color.Green, shape = RoundedCornerShape(100.dp)))

            Column(
                modifier = Modifier
                    .wrapContentHeight()
                    .padding(vertical = 8.dp, horizontal = 8.dp),
                verticalArrangement = Arrangement.SpaceBetween,
                horizontalAlignment = Alignment.Start
            ) {
                Text(text = singleChat.senderName, color = Color.Gray)
                Text(text = singleChat.senderMessage, color = Color.Red)


            }
        }
        Column(
            modifier= Modifier
                .align(Alignment.CenterVertically)
                .padding(end = 20.dp),
            horizontalAlignment = Alignment.CenterHorizontally

        ) {
            Text(text = singleChat.sentMessageTime)
        }


    }

}
@Composable
fun Taskbar(modifier: Modifier=Modifier){
    Row(modifier = Modifier
        .fillMaxWidth()
        .wrapContentHeight()
        .background(color = Color.Gray)) {
        Column(modifier = Modifier

            .padding(start = 30.dp)
            .wrapContentHeight() ,
            horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painter = painterResource(id = R.drawable.ic_email_24),
                contentDescription = null,
                modifier = Modifier
                    .size(50.dp)
                    .padding(0.dp)
            )
            Text(text = "Mail")

        }

        Column(modifier = Modifier

            .padding(start = 40.dp)
            .wrapContentHeight() ,
            horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painter = painterResource(id = R.drawable.baseline_calendar_month_24),
                contentDescription = null,
                modifier = Modifier
                    .size(50.dp)
                    .padding(0.dp)
            )
            Text(text = "Calender")

        }
        Column(modifier = Modifier

            .padding(start = 40.dp)
            .wrapContentHeight() ,
            horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painter = painterResource(id = R.drawable.ic_feed_24),
                contentDescription = null,
                modifier = Modifier
                    .size(50.dp)
                    .padding(0.dp)
            )
            Text(text = "Feed")

        }
        Column(modifier = Modifier
            .padding(start = 40.dp)
            .wrapContentHeight(),
            horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painter = painterResource(id = R.drawable.ic_apps_24),
                contentDescription = null,
                modifier = Modifier
                    .size(50.dp)
                    .padding(0.dp)
            )
            Text(text = "App")

        }



    }

}
@Preview
@Composable
private fun Preview_WhatsApp()
{
    WhatsApp()
}
@Preview
@Composable
private fun Preview_Task()
{
    Taskbar()
}
