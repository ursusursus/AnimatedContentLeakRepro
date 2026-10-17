package com.example.feature.f138.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f138.contract.F138Key
import com.example.feature.f139.contract.F139Key
import com.example.feature.f140.contract.F140Key
import com.example.feature.f141.contract.F141Key

fun EntryProviderScope<NavKey>.f138Entries(backStack: NavBackStack<NavKey>) {
    entry<F138Key> {
        F138Screen(
            onF139Key = {
                backStack.add(F139Key)
            },
            onF140Key = {
                backStack.add(F140Key)
            },
            onF141Key = {
                backStack.add(F141Key)
            },
        )
    }
}

@Composable
internal fun F138Screen(
    onF139Key: () -> Unit,
    onF140Key: () -> Unit,
    onF141Key: () -> Unit,
) {
    Column {
        Text("F138")
        Button(onClick = onF139Key) {
            Text("F138 -> F139")
        }
        Button(onClick = onF140Key) {
            Text("F138 -> F140")
        }
        Button(onClick = onF141Key) {
            Text("F138 -> F141")
        }
    }
}
