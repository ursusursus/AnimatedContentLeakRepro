package com.example.feature.f050.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f050.contract.F050Key
import com.example.feature.f051.contract.F051Key
import com.example.feature.f052.contract.F052Key
import com.example.feature.f053.contract.F053Key

fun EntryProviderScope<NavKey>.f050Entries(backStack: NavBackStack<NavKey>) {
    entry<F050Key> {
        F050Screen(
            onF051Key = {
                backStack.add(F051Key)
            },
            onF052Key = {
                backStack.add(F052Key)
            },
            onF053Key = {
                backStack.add(F053Key)
            },
        )
    }
}

@Composable
internal fun F050Screen(
    onF051Key: () -> Unit,
    onF052Key: () -> Unit,
    onF053Key: () -> Unit,
) {
    Column {
        Text("F050")
        Button(onClick = onF051Key) {
            Text("F050 -> F051")
        }
        Button(onClick = onF052Key) {
            Text("F050 -> F052")
        }
        Button(onClick = onF053Key) {
            Text("F050 -> F053")
        }
    }
}
