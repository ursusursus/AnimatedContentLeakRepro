package com.example.feature.f113.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f113.contract.F113Key
import com.example.feature.f114.contract.F114Key
import com.example.feature.f115.contract.F115Key
import com.example.feature.f116.contract.F116Key

fun EntryProviderScope<NavKey>.f113Entries(backStack: NavBackStack<NavKey>) {
    entry<F113Key> {
        F113Screen(
            onF114Key = {
                backStack.add(F114Key)
            },
            onF115Key = {
                backStack.add(F115Key)
            },
            onF116Key = {
                backStack.add(F116Key)
            },
        )
    }
}

@Composable
internal fun F113Screen(
    onF114Key: () -> Unit,
    onF115Key: () -> Unit,
    onF116Key: () -> Unit,
) {
    Column {
        Text("F113")
        Button(onClick = onF114Key) {
            Text("F113 -> F114")
        }
        Button(onClick = onF115Key) {
            Text("F113 -> F115")
        }
        Button(onClick = onF116Key) {
            Text("F113 -> F116")
        }
    }
}
