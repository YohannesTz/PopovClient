package com.github.yohannestz.popovclient.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.LottieConstants
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.github.yohannestz.popovclient.R
import com.github.yohannestz.popovclient.ui.screens.components.ImageWithTwoTextListItem
import com.github.yohannestz.popovclient.ui.theme.PopovClientTheme

@Composable
fun AppsScreen() {
    val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.bot_green))
    val progress by animateLottieCompositionAsState(
        composition,
        iterations = LottieConstants.IterateForever,
    )

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            LottieAnimation(
                composition = composition,
                progress = { progress },
                modifier = Modifier
                    .padding(10.dp)
                    .size(100.dp)
            )

            Text(
                text = "list of Applications Installed on device",
                style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp,
                    color = Color.DarkGray
                ),
            )
        }

        LazyColumn {
            items(10) {
                ImageWithTwoTextListItem(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp, vertical = 8.dp),
                    title = "Device Name",
                    subTitle = "Pixel 4",
                    imageResourceId = R.drawable.android_icon
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AppsScreenPreview() {
    PopovClientTheme {
        AppsScreen()
    }
}