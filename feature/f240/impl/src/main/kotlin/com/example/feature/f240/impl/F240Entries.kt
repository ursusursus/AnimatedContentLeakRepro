package com.example.feature.f240.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f240.contract.F240Key
import com.example.feature.f241.contract.F241Key
import com.example.feature.f242.contract.F242Key
import com.example.feature.f243.contract.F243Key

fun EntryProviderScope<NavKey>.f240Entries(backStack: NavBackStack<NavKey>) {
    entry<F240Key> {
        F240Screen(
            onF241Key = {
                backStack.add(F241Key)
            },
            onF242Key = {
                backStack.add(F242Key)
            },
            onF243Key = {
                backStack.add(F243Key)
            },
        )
    }
}

@Composable
internal fun F240Screen(
    onF241Key: () -> Unit,
    onF242Key: () -> Unit,
    onF243Key: () -> Unit,
) {
    Column {
        Text("F240")
        Button(onClick = onF241Key) {
            Text("F240 -> F241")
        }
        Button(onClick = onF242Key) {
            Text("F240 -> F242")
        }
        Button(onClick = onF243Key) {
            Text("F240 -> F243")
        }
    }
}
