package com.example.feature.f112.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f112.contract.F112Key
import com.example.feature.f113.contract.F113Key
import com.example.feature.f114.contract.F114Key
import com.example.feature.f115.contract.F115Key

fun EntryProviderScope<NavKey>.f112Entries(backStack: NavBackStack<NavKey>) {
    entry<F112Key> {
        F112Screen(
            onF113Key = {
                backStack.add(F113Key)
            },
            onF114Key = {
                backStack.add(F114Key)
            },
            onF115Key = {
                backStack.add(F115Key)
            },
        )
    }
}

@Composable
internal fun F112Screen(
    onF113Key: () -> Unit,
    onF114Key: () -> Unit,
    onF115Key: () -> Unit,
) {
    Column {
        Text("F112")
        Button(onClick = onF113Key) {
            Text("F112 -> F113")
        }
        Button(onClick = onF114Key) {
            Text("F112 -> F114")
        }
        Button(onClick = onF115Key) {
            Text("F112 -> F115")
        }
    }
}
