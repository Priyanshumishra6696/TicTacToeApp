package com.example.tictaktoe

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

//color = Color(29, 42, 50)
@Composable
fun UI(){
    var b1 by remember{ mutableIntStateOf(0) }
    var b2 by remember{ mutableIntStateOf(0) }
    var b3 by remember{ mutableIntStateOf(0) }
    var b4 by remember{ mutableIntStateOf(0) }
    var b5 by remember{ mutableIntStateOf(0) }
    var b6 by remember{ mutableIntStateOf(0) }
    var b7 by remember{ mutableIntStateOf(0) }
    var b8 by remember{ mutableIntStateOf(0) }
    var b9 by remember{ mutableIntStateOf(0) }
    var choice by remember{ mutableStateOf(true) }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
            .padding(16.dp),
        Arrangement.Center,
        Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Box(
                modifier = Modifier
                    .size(100.dp)
                    .clip(RoundedCornerShape(16.dp))
                    .background(color = Color(36, 53, 63))
                    .clickable {
                        if (choice) {
                            b1 = 1
                        } else {
                            b1 = 2
                        }
                        choice = !choice
                    },
                contentAlignment = Alignment.Center

            ){
                if(b1==1){
                    Text(
                        text = "X" ,
                        color = Color(98,193,189),
                        fontSize = 64.sp
                    )
                }
                else if(b1==2){
                    Text(
                        text = "O" ,
                        color = Color(98,193,189),
                        fontSize = 64.sp
                    )
                }
            }
            Box(
                modifier = Modifier
                    .size(100.dp)
                    .clip(RoundedCornerShape(16.dp))
                    .background(color = Color(36, 53, 63))
                    .clickable {
                        if (choice) {
                            b2 = 1
                        } else {
                            b2 = 2
                        }
                        choice = !choice
                    },
                contentAlignment = Alignment.Center

            ){
                if(b2==1){
                    Text(
                        text = "X" ,
                        color = Color(98,193,189),
                        fontSize = 64.sp
                    )
                }
                else if(b2==2){
                    Text(
                        text = "O" ,
                        color = Color(98,193,189),
                        fontSize = 64.sp
                    )
                }
            }
            Box(
                modifier = Modifier
                    .size(100.dp)
                    .clip(RoundedCornerShape(16.dp))
                    .background(color = Color(36, 53, 63))
                    .clickable {
                        if (choice) {
                            b3 = 1
                        } else {
                            b3 = 2
                        }
                        choice = !choice
                    },
                contentAlignment = Alignment.Center

            ){
                if(b3==1){
                    Text(
                        text = "X" ,
                        color = Color(98,193,189),
                        fontSize = 64.sp
                    )
                }
                else if(b3==2){
                    Text(
                        text = "O" ,
                        color = Color(98,193,189),
                        fontSize = 64.sp
                    )
                }
            }
        }
        Spacer(modifier = Modifier.padding(16.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Box(
                modifier = Modifier
                    .size(100.dp)
                    .clip(RoundedCornerShape(16.dp))
                    .background(color = Color(36, 53, 63))
                    .clickable {
                        if (choice) {
                            b4 = 1
                        } else {
                            b4 = 2
                        }
                        choice = !choice
                    },
                contentAlignment = Alignment.Center

            ){
                if(b4==1){
                    Text(
                        text = "X" ,
                        color = Color(98,193,189),
                        fontSize = 64.sp
                    )
                }
                else if(b4==2){
                    Text(
                        text = "O" ,
                        color = Color(98,193,189),
                        fontSize = 64.sp
                    )
                }
            }
            Box(
                modifier = Modifier
                    .size(100.dp)
                    .clip(RoundedCornerShape(16.dp))
                    .background(color = Color(36, 53, 63))
                    .clickable {
                        if (choice) {
                            b5 = 1
                        } else {
                            b5 = 2
                        }
                        choice = !choice
                    },
                contentAlignment = Alignment.Center

            ){
                if(b5==1){
                    Text(
                        text = "X" ,
                        color = Color(98,193,189),
                        fontSize = 64.sp
                    )
                }
                else if(b5==2){
                    Text(
                        text = "O" ,
                        color = Color(98,193,189),
                        fontSize = 64.sp
                    )
                }
            }
            Box(
                modifier = Modifier
                    .size(100.dp)
                    .clip(RoundedCornerShape(16.dp))
                    .background(color = Color(36, 53, 63))
                    .clickable {
                        if (choice) {
                            b6 = 1
                        } else {
                            b6 = 2
                        }
                        choice = !choice
                    },
                contentAlignment = Alignment.Center

            ){
                if(b6==1){
                    Text(
                        text = "X" ,
                        color = Color(98,193,189),
                        fontSize = 64.sp
                    )
                }
                else if(b6==2){
                    Text(
                        text = "O" ,
                        color = Color(98,193,189),
                        fontSize = 64.sp
                    )
                }
            }
        }
        Spacer(modifier = Modifier.padding(16.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Box(
                modifier = Modifier
                    .size(100.dp)
                    .clip(RoundedCornerShape(16.dp))
                    .background(color = Color(36, 53, 63))
                    .clickable {
                        if (choice) {
                            b7 = 1
                        } else {
                            b7 = 2
                        }
                        choice = !choice
                    },
                contentAlignment = Alignment.Center

            ){
                if(b7==1){
                    Text(
                        text = "X" ,
                        color = Color(98,193,189),
                        fontSize = 64.sp
                    )
                }
                else if(b7==2){
                    Text(
                        text = "O" ,
                        color = Color(98,193,189),
                        fontSize = 64.sp
                    )
                }
            }
            Box(
                modifier = Modifier
                    .size(100.dp)
                    .clip(RoundedCornerShape(16.dp))
                    .background(color = Color(36, 53, 63))
                    .clickable {
                        if (choice) {
                            b8 = 1
                        } else {
                            b8 = 2
                        }
                        choice = !choice
                    },
                contentAlignment = Alignment.Center

            ){
                if(b8==1){
                    Text(
                        text = "X" ,
                        color = Color(98,193,189),
                        fontSize = 64.sp
                    )
                }
                else if(b8==2){
                    Text(
                        text = "O" ,
                        color = Color(98,193,189),
                        fontSize = 64.sp
                    )
                }
            }
            Box(
                modifier = Modifier
                    .size(100.dp)
                    .clip(RoundedCornerShape(16.dp))
                    .background(color = Color(36, 53, 63))
                    .clickable {
                        if (choice) {
                            b9 = 1
                        } else {
                            b9 = 2
                        }
                        choice = !choice
                    },
                contentAlignment = Alignment.Center

            ){
                if(b9==1){
                    Text(
                        text = "X" ,
                        color = Color(98,193,189),
                        fontSize = 64.sp
                    )
                }
                else if(b9==2){
                    Text(
                        text = "O" ,
                        color = Color(98,193,189),
                        fontSize = 64.sp
                    )
                }
            }

        }
        Spacer(modifier = Modifier.padding(16.dp))
        Button(onClick = {
            b1=0
            b2=0
            b3=0
            b4=0
            b5=0
            b6=0
            b7=0
            b8=0
            b9=0
        }) {
            Text(text = "RESET")
        }
        Spacer(modifier = Modifier.padding(16.dp))
        if(
            (b1==1 && b2==1 && b3==1)
            ||
            (b4==1 && b5==1 && b6==1)
            ||
            (b7==1 && b8==1 && b9==1)
            ||
            (b1==1 && b4==1 && b7==1)
            ||
            (b2==1 && b5==1 && b8==1)
            ||
            (b3==1 && b6==1 && b9==1)
            ||
            (b1==1 && b5==1 && b9==1)
            ||
            (b3==1 && b5==1 && b7==1)
            ){
            Text(
                text = "X WINS",
                color = Color.White
            )
        }
        else if(
            (b1==2 && b2==2 && b3==2)
            ||
            (b4==2 && b5==2 && b6==2)
            ||
            (b7==2 && b8==2 && b9==2)
            ||
            (b1==2 && b4==2 && b7==2)
            ||
            (b2==2 && b5==2 && b8==2)
            ||
            (b3==2 && b6==2 && b9==2)
            ||
            (b1==2 && b5==2 && b9==2)
            ||
            (b3==2 && b5==2 && b7==2)
        ){
            Text(
                text = "O WINS",
                color = Color.White
            )
        }
    }
}

@Preview(widthDp = 320 , heightDp = 600)
@Composable
fun UIPreview(){
    UI()
}


