package com.example.feature.f136.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f136.contract.F136Key
import com.example.feature.f137.contract.F137Key
import com.example.feature.f138.contract.F138Key
import com.example.feature.f139.contract.F139Key

fun EntryProviderScope<NavKey>.f136Entries(backStack: NavBackStack<NavKey>) {
    entry<F136Key> {
        F136Screen(
            onF137Key = {
                backStack.add(F137Key)
            },
            onF138Key = {
                backStack.add(F138Key)
            },
            onF139Key = {
                backStack.add(F139Key)
            },
        )
    }
}

@Composable
internal fun F136Screen(
    onF137Key: () -> Unit,
    onF138Key: () -> Unit,
    onF139Key: () -> Unit,
) {
    Column {
        Text("F136")
        Button(onClick = onF137Key) {
            Text("F136 -> F137")
        }
        Button(onClick = onF138Key) {
            Text("F136 -> F138")
        }
        Button(onClick = onF139Key) {
            Text("F136 -> F139")
        }
    }
}
