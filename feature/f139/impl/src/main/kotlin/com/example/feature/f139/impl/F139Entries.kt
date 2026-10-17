package com.example.feature.f139.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f139.contract.F139Key
import com.example.feature.f140.contract.F140Key
import com.example.feature.f141.contract.F141Key
import com.example.feature.f142.contract.F142Key

fun EntryProviderScope<NavKey>.f139Entries(backStack: NavBackStack<NavKey>) {
    entry<F139Key> {
        F139Screen(
            onF140Key = {
                backStack.add(F140Key)
            },
            onF141Key = {
                backStack.add(F141Key)
            },
            onF142Key = {
                backStack.add(F142Key)
            },
        )
    }
}

@Composable
internal fun F139Screen(
    onF140Key: () -> Unit,
    onF141Key: () -> Unit,
    onF142Key: () -> Unit,
) {
    Column {
        Text("F139")
        Button(onClick = onF140Key) {
            Text("F139 -> F140")
        }
        Button(onClick = onF141Key) {
            Text("F139 -> F141")
        }
        Button(onClick = onF142Key) {
            Text("F139 -> F142")
        }
    }
}
