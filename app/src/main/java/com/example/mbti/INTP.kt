package com.example.mbti

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.mbti.ui.theme.MbtiTheme

class INTP : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MbtiTheme {
                Column {
                    val context = LocalContext.current as? Activity

                    Button(onClick = {
                        val intent = Intent(context, MainActivity::class.java)
                        context?.startActivity(intent)
                    }) {
                        Text(text = "Main 이동")
                    }

                    INTP_Image()

                    Text(text = "\nINTP\n" +
                            "\n" +
                            "\n" +
                            "논리술사\n" +
                            "성격 유형: INTP\n" +
                            "\n" +
                            "I 내향형\n" +
                            "N 직관형\n" +
                            "T 사고형\n" +
                            "P 탐구형\n" +
                            "\n" +
                            "논리술사\n" +
                            "질문하는 일을 멈추지 않는 것이 중요하다. 호기심은 그 자체만으로 존재 이유가 있다.\n")



                    Button(onClick = {
                        context?.finish()
                    }) {
                        Text(text = "닫기")
                    }


                }


            }


        }
    }
}

@Composable
fun INTP_Image() {
    Image(
        painter = painterResource(id = R.drawable.intp),
        contentDescription = null
    )
}

@Preview
@Composable
fun PreviewINTP() {
    INTP_Image()
}