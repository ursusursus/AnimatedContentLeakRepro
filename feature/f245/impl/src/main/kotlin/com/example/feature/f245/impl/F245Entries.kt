package com.example.feature.f245.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f245.contract.F245Key
import com.example.feature.f246.contract.F246Key
import com.example.feature.f247.contract.F247Key
import com.example.feature.f248.contract.F248Key

fun EntryProviderScope<NavKey>.f245Entries(backStack: NavBackStack<NavKey>) {
    entry<F245Key> {
        F245Screen(
            onF246Key = {
                backStack.add(F246Key)
            },
            onF247Key = {
                backStack.add(F247Key)
            },
            onF248Key = {
                backStack.add(F248Key)
            },
        )
    }
}

@Composable
internal fun F245Screen(
    onF246Key: () -> Unit,
    onF247Key: () -> Unit,
    onF248Key: () -> Unit,
) {
    Column {
        Text("F245")
        Button(onClick = onF246Key) {
            Text("F245 -> F246")
        }
        Button(onClick = onF247Key) {
            Text("F245 -> F247")
        }
        Button(onClick = onF248Key) {
            Text("F245 -> F248")
        }
    }
}
