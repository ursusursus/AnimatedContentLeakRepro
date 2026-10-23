package com.example.feature.f242.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f242.contract.F242Key
import com.example.feature.f243.contract.F243Key
import com.example.feature.f244.contract.F244Key
import com.example.feature.f245.contract.F245Key

fun EntryProviderScope<NavKey>.f242Entries(backStack: NavBackStack<NavKey>) {
    entry<F242Key> {
        F242Screen(
            onF243Key = {
                backStack.add(F243Key)
            },
            onF244Key = {
                backStack.add(F244Key)
            },
            onF245Key = {
                backStack.add(F245Key)
            },
        )
    }
}

@Composable
internal fun F242Screen(
    onF243Key: () -> Unit,
    onF244Key: () -> Unit,
    onF245Key: () -> Unit,
) {
    Column {
        Text("F242")
        Button(onClick = onF243Key) {
            Text("F242 -> F243")
        }
        Button(onClick = onF244Key) {
            Text("F242 -> F244")
        }
        Button(onClick = onF245Key) {
            Text("F242 -> F245")
        }
    }
}
