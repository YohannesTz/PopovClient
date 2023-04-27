package com.github.yohannestz.popovclient.ui.navigation

import androidx.compose.foundation.Image
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.navigation.NavController
import com.github.yohannestz.popovclient.ui.screens.NavigationItem


@Composable
fun BottomNavigationBar(navController: NavController) {
    val items = listOf(
        NavigationItem.HeartBeat,
        NavigationItem.DeviceInfo,
        NavigationItem.Report
    )

    NavigationBar {
        items.forEach { item ->
            val selected =
                item.route == (navController.currentBackStackEntry?.destination?.route
                    ?: "")

            NavigationBarItem(
                selected = selected,
                onClick = { navController.navigate(item.route) },
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