package com.github.yohannestz.popovclient.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.unit.dp
import com.github.yohannestz.popovclient.ui.navigation.BottomNavigationBar
import com.github.yohannestz.popovclient.ui.navigation.NavigationItem

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {

    val navigationState = remember { mutableStateOf(NavigationItem.HeartBeat.route) }

    Scaffold(
        bottomBar = {
            BottomNavigationBar(navigationState)
        },
/*
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    NavigationItem.getVal(navigationState.value)?.let { Text(text = it.title) }
                },
                modifier = Modifier.shadow(elevation = 2.dp)
            )
        }
*/
    ) {
        Box(modifier = Modifier.padding(it)) {
            when (navigationState.value) {
                NavigationItem.HeartBeat.route -> HeartBeatScreen()
                NavigationItem.DeviceInfo.route -> DeviceInfoScreen()
                NavigationItem.Report.route -> ReportScreen()
                NavigationItem.Apps.route -> AppsScreen()
            }
        }
    }
}