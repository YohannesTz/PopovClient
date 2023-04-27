package com.github.yohannestz.popovclient.ui.screens

import com.github.yohannestz.popovclient.R

sealed class NavigationItem (var route: String, var icon: Int, var title: String) {
    object HeartBeat : NavigationItem("heartBeat", R.drawable.ic_sick, "Home")
    object Report: NavigationItem("report", R.drawable.ic_report, "Report")
    object DeviceInfo: NavigationItem("deviceInfo", R.drawable.ic_device_info, "Device Info")
}