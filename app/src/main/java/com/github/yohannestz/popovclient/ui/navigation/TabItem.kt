package com.github.yohannestz.popovclient.ui.navigation

import androidx.compose.runtime.Composable
import com.github.yohannestz.popovclient.R
import com.github.yohannestz.popovclient.ui.screens.CallList
import com.github.yohannestz.popovclient.ui.screens.MessagesList


typealias ComposableFun = @Composable () -> Unit

sealed class TabItem (var icon: Int, var title: String, var content: ComposableFun, var id: Int) {
    object CallTab: TabItem(R.drawable.ic_call, "Calls", { CallList() }, 1)
    object MessagesTab: TabItem(R.drawable.ic_messages, "Messages", { MessagesList() }, 2)
}