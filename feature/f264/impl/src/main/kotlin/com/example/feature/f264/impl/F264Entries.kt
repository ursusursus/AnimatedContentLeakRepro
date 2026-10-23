package com.example.feature.f264.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f264.contract.F264Key
import com.example.feature.f265.contract.F265Key
import com.example.feature.f266.contract.F266Key
import com.example.feature.f267.contract.F267Key

fun EntryProviderScope<NavKey>.f264Entries(backStack: NavBackStack<NavKey>) {
    entry<F264Key> {
        F264Screen(
            onF265Key = {
                backStack.add(F265Key)
            },
            onF266Key = {
                backStack.add(F266Key)
            },
            onF267Key = {
                backStack.add(F267Key)
            },
        )
    }
}

@Composable
internal fun F264Screen(
    onF265Key: () -> Unit,
    onF266Key: () -> Unit,
    onF267Key: () -> Unit,
) {
    Column {
        Text("F264")
        Button(onClick = onF265Key) {
            Text("F264 -> F265")
        }
        Button(onClick = onF266Key) {
            Text("F264 -> F266")
        }
        Button(onClick = onF267Key) {
            Text("F264 -> F267")
        }
    }
}
