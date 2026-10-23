package com.example.feature.f243.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f243.contract.F243Key
import com.example.feature.f244.contract.F244Key
import com.example.feature.f245.contract.F245Key
import com.example.feature.f246.contract.F246Key

fun EntryProviderScope<NavKey>.f243Entries(backStack: NavBackStack<NavKey>) {
    entry<F243Key> {
        F243Screen(
            onF244Key = {
                backStack.add(F244Key)
            },
            onF245Key = {
                backStack.add(F245Key)
            },
            onF246Key = {
                backStack.add(F246Key)
            },
        )
    }
}

@Composable
internal fun F243Screen(
    onF244Key: () -> Unit,
    onF245Key: () -> Unit,
    onF246Key: () -> Unit,
) {
    Column {
        Text("F243")
        Button(onClick = onF244Key) {
            Text("F243 -> F244")
        }
        Button(onClick = onF245Key) {
            Text("F243 -> F245")
        }
        Button(onClick = onF246Key) {
            Text("F243 -> F246")
        }
    }
}
