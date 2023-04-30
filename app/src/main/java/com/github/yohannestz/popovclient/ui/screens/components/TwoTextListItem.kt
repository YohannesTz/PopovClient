package com.github.yohannestz.popovclient.ui.screens.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.github.yohannestz.popovclient.ui.theme.PopovClientTheme

@Composable
fun TwoTextListItem(modifier: Modifier, title: String, subTitle: String) {
    Card(modifier) {
        Text(
            textAlign = TextAlign.Center,
            text = title,
            style = TextStyle(
                fontWeight = FontWeight.Medium,
                fontSize = 18.sp,
                color = Color.DarkGray
            ),
            modifier = Modifier.padding(top = 4.dp, start = 8.dp, end = 10.dp, bottom = 0.dp)
        )
        Text(
            textAlign = TextAlign.Center,
            text = subTitle,
            style = TextStyle(
                fontWeight = FontWeight.Normal,
                fontSize = 16.sp,
                color = Color.Gray
            ),
            modifier = Modifier.padding(top = 0.dp, start = 10.dp, end = 10.dp, bottom = 4.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun TwoTextListItemPreview() {
    PopovClientTheme {
        TwoTextListItem(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp), title = "No Name", subTitle = "Hi this is a sample text"
        )
    }
}