package com.github.yohannestz.popovclient.ui.screens

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.TabRow
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.LeadingIconTab
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.github.yohannestz.popovclient.R
import com.github.yohannestz.popovclient.ui.navigation.TabItem
import com.github.yohannestz.popovclient.ui.screens.components.ImageWithThreeTextListItem
import com.github.yohannestz.popovclient.ui.screens.components.ImageWithTwoTextListItem
import com.github.yohannestz.popovclient.ui.screens.components.TwoTextListItem
import com.github.yohannestz.popovclient.ui.theme.PopovClientTheme
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.PagerState
import com.google.accompanist.pager.pagerTabIndicatorOffset
import com.google.accompanist.pager.rememberPagerState
import kotlinx.coroutines.launch

@OptIn(ExperimentalPagerApi::class)
@Composable
fun ReportScreen() {
    val tabs = listOf(TabItem.MessagesTab, TabItem.CallTab)
    val pagerState = rememberPagerState()

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Tabs(tabs = tabs, pagerState = pagerState)
        TabsContent(tabs = tabs, pagerState = pagerState)
    }
}

@OptIn(ExperimentalPagerApi::class)
@Composable
fun Tabs(tabs: List<TabItem>, pagerState: PagerState) {
    val scope = rememberCoroutineScope()
    TabRow(
        modifier = Modifier.shadow(elevation = 2.dp),
        selectedTabIndex = pagerState.currentPage,
        backgroundColor = MaterialTheme.colorScheme.surfaceVariant,
        contentColor = MaterialTheme.colorScheme.onSurfaceVariant,
        indicator = { index ->
            TabRowDefaults.Indicator(
                Modifier
                    .pagerTabIndicatorOffset(pagerState, index)
                    .clip(RoundedCornerShape(16.dp)),
                height = 3.dp
            )
        }) {
        // Add tabs for all of our pages
        tabs.forEachIndexed { index, tab ->
            LeadingIconTab(
                icon = { Icon(painter = painterResource(id = tab.icon), contentDescription = "") },
                text = { Text(tab.title) },
                selected = pagerState.currentPage == index,
                onClick = {
                    scope.launch {
                        pagerState.animateScrollToPage(index)
                    }
                },
            )
        }
    }
}


@OptIn(ExperimentalPagerApi::class)
@Composable
fun TabsContent(tabs: List<TabItem>, pagerState: PagerState) {
    HorizontalPager(state = pagerState, count = tabs.size) {
        tabs[pagerState.currentPage].content()
    }
}

@Composable
fun CallList() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        ImageWithThreeTextListItem(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            title = "dasfasdf",
            subTitle = "asdfasdf",
            imageResourceId = R.drawable.call_incoming,
            size = 50.dp,
            horizontalPadding = 4.dp,
            thirdText = "10s"
        )

        ImageWithThreeTextListItem(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            title = "dasfasdf",
            subTitle = "asdfasdf",
            imageResourceId = R.drawable.call_missed,
            size = 50.dp,
            horizontalPadding = 4.dp,
            thirdText = "10s"
        )

        ImageWithThreeTextListItem(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            title = "dasfasdf",
            subTitle = "asdfasdf",
            imageResourceId = R.drawable.call_outgoing,
            size = 50.dp,
            horizontalPadding = 4.dp,
            thirdText = "10s"
        )

        ImageWithThreeTextListItem(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            title = "dasfasdf",
            subTitle = "asdfasdf",
            imageResourceId = R.drawable.call_outgoing,
            size = 50.dp,
            horizontalPadding = 0.dp,
            thirdText = "10s"
        )
    }
}

@Composable
fun MessagesList() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        TwoTextListItem(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            title = "No Name", subTitle = "Hi this is a sample text"
        )
        TwoTextListItem(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp), title = "No Name", subTitle = "Hi this is a sample text"
        )
        TwoTextListItem(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp), title = "No Name", subTitle = "Hi this is a sample text"
        )

        TwoTextListItem(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp), title = "No Name", subTitle = "Hi this is a sample text"
        )

        TwoTextListItem(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp), title = "No Name", subTitle = "Hi this is a sample text"
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ReportScreenPreview() {
    PopovClientTheme {
        ReportScreen()
    }
}
