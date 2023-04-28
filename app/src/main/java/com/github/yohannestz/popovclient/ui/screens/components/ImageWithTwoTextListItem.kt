package com.github.yohannestz.popovclient.ui.screens.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.LottieConstants
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.github.yohannestz.popovclient.R

@Composable
fun ImageWithTwoTextListItem(modifier: Modifier, title: String, subTitle: String) {

    Card(modifier) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(
                painterResource(R.drawable.android_icon),
                "android Icon",
                contentScale = ContentScale.Fit,
                modifier = Modifier.size(60.dp),
                colorFilter = ColorFilter.tint(Color.DarkGray)
            )
            Column(verticalArrangement = Arrangement.Center) {
                Text(
                    textAlign = TextAlign.Center,
                    text = title,
                    style = TextStyle(
                        fontWeight = FontWeight.Medium,
                        fontSize = 18.sp,
                        color = Color.DarkGray
                    ),
                    modifier = Modifier.padding(
                        top = 4.dp,
                        start = 8.dp,
                        end = 10.dp,
                        bottom = 0.dp
                    )
                )
                Text(
                    textAlign = TextAlign.Center,
                    text = subTitle,
                    style = TextStyle(
                        fontWeight = FontWeight.Normal,
                        fontSize = 16.sp,
                        color = Color.Gray
                    ),
                    modifier = Modifier.padding(
                        top = 0.dp,
                        start = 10.dp,
                        end = 10.dp,
                        bottom = 4.dp
                    )
                )
            }
        }
    }
}