package com.github.yohannestz.popovclient.ui.screens.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.github.yohannestz.popovclient.R

@Composable
fun BoxItemComponent(modifier: Modifier, resourceId: Int, title: String, subTitle: String) {
    Box(
        modifier = modifier
    ) {
        Column(
            modifier = Modifier.padding(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painterResource(resourceId),
                "content description",
                contentScale = ContentScale.Fit,
                modifier = Modifier.size(60.dp),
                colorFilter = ColorFilter.tint(Color.DarkGray)
            )
            Text(
                textAlign = TextAlign.Center,
                text = title,
                style = TextStyle(
                    fontWeight = FontWeight.Medium,
                    fontSize = 16.sp,
                    color = Color.DarkGray
                )
            )
            Text(
                textAlign = TextAlign.Center,
                text = subTitle,
                style = TextStyle(
                    fontWeight = FontWeight.Normal,
                    fontSize = 14.sp,
                    color = Color.Gray
                )
            )
        }
    }
}