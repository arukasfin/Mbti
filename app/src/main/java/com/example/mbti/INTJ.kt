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
import androidx.compose.ui.platform.LocalContext
import com.example.mbti.ui.theme.MbtiTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview

class INTJ : ComponentActivity() {
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

                    INTJ_Image()

                    Text(
                        text = "\nINTJ\n" +
                                "\n" +
                                "전략가\n" +
                                "성격 유형: INTJ" +
                                "" +
                                "" +
                                "I 내향형\n" +
                                "N 직관형\n" +
                                "T 사고형\n" +
                                "J 계획형\n" +
                                "\n" +
                                "전략가\n" +
                                "사고 능력은 인간의 위대한 점 중 하나이다. 인간은 갈대처럼 연약하지만 생각하는 갈대이다.\n"
                    )


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
fun INTJ_Image() {
    Image(
        painter = painterResource(id = R.drawable.intj),
        contentDescription = null
    )
}

@Preview
@Composable
fun PreviewINTJ() {
    INTJ_Image()
}