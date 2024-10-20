package com.example.business_card

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.business_card.ui.theme.Business_CardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Business_CardTheme {
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Business_Card()
                }
            }
        }
    }
}

@Composable
fun Business_Card() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // Logo Android
        Image(
            painter = painterResource(R.drawable.android_logo),
            contentDescription = "null",
            modifier = Modifier
                .size(100.dp)
                .padding(top = 25.dp),
            contentScale = ContentScale.Crop
        )

        // Name and Title
        Text(
            text = "Tondossama",
            fontSize = 50.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Developpeur Andoid",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .absolutePadding(bottom = 120.dp)
        )
        Row {
            Image(
                painter = painterResource(R.drawable.appel),
                modifier = Modifier
                    .size(55.dp),
                contentDescription = "null"
            )
            Text(
                text = "+225 07 07 67 03 68",
                modifier = Modifier
                    .absolutePadding(top = 12.dp),
                fontSize = 22.sp
            )
        }
        Row {
            Image(
                painter = painterResource(R.drawable.snapchat),
                modifier = Modifier
                    .size(45.dp),
                contentDescription = "null"
            )
            Text(
                text = "@maroinehabib20",
                fontSize = 22.sp,
                modifier = Modifier
                    .absolutePadding(left = 5.dp, top = 10.dp)
            )
        }
        Row {
            Image(
                painter = painterResource(R.drawable.email__1_),
                modifier = Modifier
                    .size(45.dp),
                contentDescription = "null"
            )
            Text(
                text = "habibtondossama8@gmail.com",
                fontSize = 22.sp,
                modifier = Modifier
                    .absolutePadding(top = 10.dp, left = 5.dp),
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewBusinessCard() {
    Business_Card()
}