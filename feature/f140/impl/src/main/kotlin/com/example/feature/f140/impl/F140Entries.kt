package com.example.feature.f140.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f140.contract.F140Key
import com.example.feature.f141.contract.F141Key
import com.example.feature.f142.contract.F142Key
import com.example.feature.f143.contract.F143Key

fun EntryProviderScope<NavKey>.f140Entries(backStack: NavBackStack<NavKey>) {
    entry<F140Key> {
        F140Screen(
            onF141Key = {
                backStack.add(F141Key)
            },
            onF142Key = {
                backStack.add(F142Key)
            },
            onF143Key = {
                backStack.add(F143Key)
            },
        )
    }
}

@Composable
internal fun F140Screen(
    onF141Key: () -> Unit,
    onF142Key: () -> Unit,
    onF143Key: () -> Unit,
) {
    Column {
        Text("F140")
        Button(onClick = onF141Key) {
            Text("F140 -> F141")
        }
        Button(onClick = onF142Key) {
            Text("F140 -> F142")
        }
        Button(onClick = onF143Key) {
            Text("F140 -> F143")
        }
    }
}
