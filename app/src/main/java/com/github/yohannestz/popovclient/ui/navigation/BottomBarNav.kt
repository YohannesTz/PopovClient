package com.github.yohannestz.popovclient.ui.navigation

import androidx.compose.foundation.Image
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.setValue
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.navigation.NavController


@Composable
fun BottomNavigationBar(navigationState: MutableState<String>) {
    val items = listOf(
        NavigationItem.HeartBeat,
        NavigationItem.Report,
        NavigationItem.DeviceInfo,
        NavigationItem.Apps
    )

    NavigationBar {
        items.forEach { item ->
            val selected = item.route == navigationState.value

            NavigationBarItem(
                selected = selected,
                onClick = { navigationState.value = item.route },
                label = {
                    Text(
                        text = item.title,
                        fontWeight = FontWeight.SemiBold,
                    )
                },
                icon = {
                    Image(painterResource(item.icon),"content description")
                }
            )
        }
    }
}