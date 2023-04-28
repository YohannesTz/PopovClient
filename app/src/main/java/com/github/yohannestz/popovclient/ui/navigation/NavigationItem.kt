package com.github.yohannestz.popovclient.ui.navigation

import com.github.yohannestz.popovclient.R

sealed class NavigationItem (var route: String, var icon: Int, var title: String) {
    object HeartBeat : NavigationItem("heartBeat", R.drawable.ic_sick, "Health")
    object Report: NavigationItem("report", R.drawable.ic_report, "Report")
    object DeviceInfo: NavigationItem("deviceInfo", R.drawable.ic_device_info, "DeviceInfo")

    object Apps: NavigationItem("apps", R.drawable.ic_apps, "Apps")
    companion object {
        fun getVal(route: String): NavigationItem? {
            return when (route) {
                HeartBeat.route -> HeartBeat
                Report.route -> Report
                DeviceInfo.route -> DeviceInfo
                else -> null
            }
        }
    }
}