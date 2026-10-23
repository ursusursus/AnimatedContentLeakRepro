package com.example.feature.f244.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f244.contract.F244Key
import com.example.feature.f245.contract.F245Key
import com.example.feature.f246.contract.F246Key
import com.example.feature.f247.contract.F247Key

fun EntryProviderScope<NavKey>.f244Entries(backStack: NavBackStack<NavKey>) {
    entry<F244Key> {
        F244Screen(
            onF245Key = {
                backStack.add(F245Key)
            },
            onF246Key = {
                backStack.add(F246Key)
            },
            onF247Key = {
                backStack.add(F247Key)
            },
        )
    }
}

@Composable
internal fun F244Screen(
    onF245Key: () -> Unit,
    onF246Key: () -> Unit,
    onF247Key: () -> Unit,
) {
    Column {
        Text("F244")
        Button(onClick = onF245Key) {
            Text("F244 -> F245")
        }
        Button(onClick = onF246Key) {
            Text("F244 -> F246")
        }
        Button(onClick = onF247Key) {
            Text("F244 -> F247")
        }
    }
}
