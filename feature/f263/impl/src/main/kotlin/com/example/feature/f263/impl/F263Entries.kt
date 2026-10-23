package com.example.feature.f263.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f263.contract.F263Key
import com.example.feature.f264.contract.F264Key
import com.example.feature.f265.contract.F265Key
import com.example.feature.f266.contract.F266Key

fun EntryProviderScope<NavKey>.f263Entries(backStack: NavBackStack<NavKey>) {
    entry<F263Key> {
        F263Screen(
            onF264Key = {
                backStack.add(F264Key)
            },
            onF265Key = {
                backStack.add(F265Key)
            },
            onF266Key = {
                backStack.add(F266Key)
            },
        )
    }
}

@Composable
internal fun F263Screen(
    onF264Key: () -> Unit,
    onF265Key: () -> Unit,
    onF266Key: () -> Unit,
) {
    Column {
        Text("F263")
        Button(onClick = onF264Key) {
            Text("F263 -> F264")
        }
        Button(onClick = onF265Key) {
            Text("F263 -> F265")
        }
        Button(onClick = onF266Key) {
            Text("F263 -> F266")
        }
    }
}
