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

class ENTJ : ComponentActivity() {
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

                    ENTJ_Image()

                    Text(text = "\nENTJ\n" +
                            "\n" +
                            "통솔자\n" +
                            "성격 유형: ENTJ\n" +
                            "\n" +
                            "E 외향형\n" +
                            "N 직관형\n" +
                            "T 사고형\n" +
                            "J 계획형\n" +
                            "\n" +
                            "통솔자\n" +
                            "당신의 시간은 유한하다. 그러니 다른 사람의 삶을 사느라 시간을 낭비하지 말라.\n")


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
fun ENTJ_Image() {
    Image(
        painter = painterResource(id = R.drawable.entj),
        contentDescription = null
    )
}

@Preview
@Composable
fun PreviewENTJ() {
    ENTJ_Image()
}