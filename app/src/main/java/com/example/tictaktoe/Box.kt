package com.example.tictaktoe

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
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

@Composable
fun Boxx(choice : Boolean){
    var o by remember {
        mutableStateOf(false)
    }
    var x by remember {
        mutableStateOf(false)
    }
    Box(
        modifier = Modifier
            .size(100.dp)
            .clip(RoundedCornerShape(16.dp))
            .background(color = Color(36, 53, 63))
            .clickable { x = !x },
        contentAlignment = Alignment.Center

    ){
        if(x){
            Text(
                text = "X" ,
                color = Color(98,193,189),
                fontSize = 64.sp
            )
        }
        if(!x && o){
            Text(
                text = "O" ,
                color = Color(98,193,189),
                fontSize = 64.sp
            )
        }
    }
}

@Preview(widthDp = 320 , heightDp = 600)
@Composable
fun BoxxPreview(){
    Boxx(true)
}

//color = Color(36,53,63)