package com.example.mbti

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.mbti.ui.theme.MbtiTheme

class ENTP : ComponentActivity() {
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

                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .weight(1f),
                        contentAlignment = Alignment.Center
                    ) {
                        ENTP_Image()
                    }
                    Text(text = "\nENTP\n" +
                            "\n" +
                            "변론가\n" +
                            "성격 유형: ENTP\n" +
                            "E 외향형\n" +
                            "N 직관형\n" +
                            "T 사고형\n" +
                            "P 탐구형\n" +
                            "\n" +
                            "변론가\n" +
                            "변론가(ENTP)는 두뇌 회전이 빠르고 대담한 성격으로 현재 상황에 이의를 제기하는 데 거리낌이 없습니다. 변론가는 어떤 의견이나 사람에 반대하는 일을 두려워하지 않으며, 논란이 될 만한 주제에 대해 격렬하게 논쟁하는 일을 즐깁니다.\n")


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
fun ENTP_Image() {
    Image(
        painter = painterResource(id = R.drawable.entp),
        contentDescription = null
    )
}

@Preview
@Composable
fun PreviewENTP() {
    ENTP_Image()
}