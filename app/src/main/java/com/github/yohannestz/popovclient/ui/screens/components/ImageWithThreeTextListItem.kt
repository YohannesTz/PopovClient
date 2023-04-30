package com.github.yohannestz.popovclient.ui.screens.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ImageWithThreeTextListItem(
    modifier: Modifier,
    imageResourceId: Int,
    title: String,
    subTitle: String,
    thirdText: String,
    size: Dp = 60.dp,
    horizontalPadding: Dp = 4.dp
) {

    Card(modifier) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            Image(
                painterResource(imageResourceId),
                "image resource",
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .size(size)
                    .padding(start = horizontalPadding),
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
                        start = 0.dp,
                        end = 10.dp
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
                        bottom = 4.dp
                    )
                )
            }
            Spacer(Modifier.weight(1f))
            Text(
                textAlign = TextAlign.Center,
                text = thirdText,
                style = TextStyle(
                    fontWeight = FontWeight.Normal,
                    fontSize = 16.sp,
                    color = Color.Gray
                ),
                modifier = Modifier.padding(
                    end = 16.dp
                )
            )
        }
    }
}