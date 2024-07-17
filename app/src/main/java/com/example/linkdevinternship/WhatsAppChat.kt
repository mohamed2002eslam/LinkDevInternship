package com.example.linkdevinternship

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun WhatAppChat(modifier: Modifier=Modifier){
    Column(modifier=Modifier.fillMaxSize()) {


        LazyColumn() {
            items(SingleChat.createTempChats()) { singleChat ->
                WhatsApp(
                    singleChat = singleChat
                )


            }

        }

        Taskbar(modifier = modifier.fillMaxSize())


    }


}
@Preview(showBackground = true, showSystemUi = true)
@Composable
@Preview
fun Preview_WhatsAppChat()
{
    WhatAppChat()
}
