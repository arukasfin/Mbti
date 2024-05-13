package com.example.mbti

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mbti.ui.theme.MbtiTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MbtiTheme {
                MainScreen()
            }
        }
    }
}

@Composable
fun MainScreen() {
    val context = LocalContext.current
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .weight(1f),
        contentAlignment = Alignment.Center
    ) {
        MBTI_Image()
    }

        Button(
            onClick = {
                val intent = Intent(context, INTJ::class.java)
                context.startActivity(intent)
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "INTJ")
        }

        Button(
            onClick = {
                val intent = Intent(context, INTP::class.java)
                context.startActivity(intent)
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "INTP")
        }

        Button(
            onClick = {
                val intent = Intent(context, ENTJ::class.java)
                context.startActivity(intent)
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "ENTJ")
        }

        Button(
            onClick = {
                val intent = Intent(context, ENTP::class.java)
                context.startActivity(intent)
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "ENTP")
        }

        Button(
            onClick = {
                val intent = Intent(context, SubActivity::class.java)
                context.startActivity(intent)
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Sub 이동")
        }
    }
}



@Composable
fun MBTI_Image() {
    Image(
        painter = painterResource(id = R.drawable.mbti),
        contentDescription = null
    )
}

@Preview
@Composable
fun PreviewMBTI() {
    MBTI_Image()
}