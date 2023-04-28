package com.github.yohannestz.popovclient.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.github.yohannestz.popovclient.R
import com.github.yohannestz.popovclient.ui.screens.components.BoxItemComponent
import com.github.yohannestz.popovclient.ui.screens.components.TwoTextListItem
import com.github.yohannestz.popovclient.ui.theme.PopovClientTheme

@Composable
fun HeartBeatScreen() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 8.dp),
            horizontalArrangement = Arrangement.Center
        ) {

            BoxItemComponent(
                modifier = Modifier
                    .padding(vertical = 16.dp, horizontal = 4.dp)
                    .clip(shape = RoundedCornerShape(16.dp))
                    .weight(1f)
                    .clickable {  }
                    .background(MaterialTheme.colorScheme.surfaceVariant)
                    .padding(16.dp),
                resourceId = R.drawable.ic_heart,
                title = "15 beats",
                subTitle = "Bot heartbeats"
            )

            BoxItemComponent(
                modifier = Modifier
                    .padding(vertical = 16.dp, horizontal = 4.dp)
                    .clip(shape = RoundedCornerShape(16.dp))
                    .weight(1f)
                    .clickable {  }
                    .background(MaterialTheme.colorScheme.surfaceVariant)
                    .padding(16.dp),
                resourceId = R.drawable.ic_time,
                title = "30 min ago",
                subTitle = "Last beats"
            )
        }

        LazyColumn {
            items(10) {
                TwoTextListItem(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp, vertical = 8.dp)
                        .clip(shape = RoundedCornerShape(10.dp))
                        .clickable {  }
                        .background(MaterialTheme.colorScheme.surfaceVariant),
                    title = "Title",
                    subTitle = "sub title"
                )
            }
        }

    }
}

@Preview(backgroundColor = 0xFFFFFFFF, showBackground = true)
@Composable
fun HeartBeatScreenPreview() {
    PopovClientTheme {
        HeartBeatScreen()
    }
}