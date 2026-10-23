package com.example.feature.f241.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f241.contract.F241Key
import com.example.feature.f242.contract.F242Key
import com.example.feature.f243.contract.F243Key
import com.example.feature.f244.contract.F244Key

fun EntryProviderScope<NavKey>.f241Entries(backStack: NavBackStack<NavKey>) {
    entry<F241Key> {
        F241Screen(
            onF242Key = {
                backStack.add(F242Key)
            },
            onF243Key = {
                backStack.add(F243Key)
            },
            onF244Key = {
                backStack.add(F244Key)
            },
        )
    }
}

@Composable
internal fun F241Screen(
    onF242Key: () -> Unit,
    onF243Key: () -> Unit,
    onF244Key: () -> Unit,
) {
    Column {
        Text("F241")
        Button(onClick = onF242Key) {
            Text("F241 -> F242")
        }
        Button(onClick = onF243Key) {
            Text("F241 -> F243")
        }
        Button(onClick = onF244Key) {
            Text("F241 -> F244")
        }
    }
}
