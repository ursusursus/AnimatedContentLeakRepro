package com.example.feature.f137.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f137.contract.F137Key
import com.example.feature.f138.contract.F138Key
import com.example.feature.f139.contract.F139Key
import com.example.feature.f140.contract.F140Key

fun EntryProviderScope<NavKey>.f137Entries(backStack: NavBackStack<NavKey>) {
    entry<F137Key> {
        F137Screen(
            onF138Key = {
                backStack.add(F138Key)
            },
            onF139Key = {
                backStack.add(F139Key)
            },
            onF140Key = {
                backStack.add(F140Key)
            },
        )
    }
}

@Composable
internal fun F137Screen(
    onF138Key: () -> Unit,
    onF139Key: () -> Unit,
    onF140Key: () -> Unit,
) {
    Column {
        Text("F137")
        Button(onClick = onF138Key) {
            Text("F137 -> F138")
        }
        Button(onClick = onF139Key) {
            Text("F137 -> F139")
        }
        Button(onClick = onF140Key) {
            Text("F137 -> F140")
        }
    }
}
