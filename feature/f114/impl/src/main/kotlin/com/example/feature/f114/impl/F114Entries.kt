package com.example.feature.f114.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f114.contract.F114Key
import com.example.feature.f115.contract.F115Key
import com.example.feature.f116.contract.F116Key
import com.example.feature.f117.contract.F117Key

fun EntryProviderScope<NavKey>.f114Entries(backStack: NavBackStack<NavKey>) {
    entry<F114Key> {
        F114Screen(
            onF115Key = {
                backStack.add(F115Key)
            },
            onF116Key = {
                backStack.add(F116Key)
            },
            onF117Key = {
                backStack.add(F117Key)
            },
        )
    }
}

@Composable
internal fun F114Screen(
    onF115Key: () -> Unit,
    onF116Key: () -> Unit,
    onF117Key: () -> Unit,
) {
    Column {
        Text("F114")
        Button(onClick = onF115Key) {
            Text("F114 -> F115")
        }
        Button(onClick = onF116Key) {
            Text("F114 -> F116")
        }
        Button(onClick = onF117Key) {
            Text("F114 -> F117")
        }
    }
}
