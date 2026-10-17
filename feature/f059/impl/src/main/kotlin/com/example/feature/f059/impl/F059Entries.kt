package com.example.feature.f059.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f059.contract.F059Key
import com.example.feature.f060.contract.F060Key
import com.example.feature.f061.contract.F061Key
import com.example.feature.f062.contract.F062Key

fun EntryProviderScope<NavKey>.f059Entries(backStack: NavBackStack<NavKey>) {
    entry<F059Key> {
        F059Screen(
            onF060Key = {
                backStack.add(F060Key)
            },
            onF061Key = {
                backStack.add(F061Key)
            },
            onF062Key = {
                backStack.add(F062Key)
            },
        )
    }
}

@Composable
internal fun F059Screen(
    onF060Key: () -> Unit,
    onF061Key: () -> Unit,
    onF062Key: () -> Unit,
) {
    Column {
        Text("F059")
        Button(onClick = onF060Key) {
            Text("F059 -> F060")
        }
        Button(onClick = onF061Key) {
            Text("F059 -> F061")
        }
        Button(onClick = onF062Key) {
            Text("F059 -> F062")
        }
    }
}
