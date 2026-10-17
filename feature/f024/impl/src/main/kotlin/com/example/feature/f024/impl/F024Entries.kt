package com.example.feature.f024.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f024.contract.F024Key
import com.example.feature.f025.contract.F025Key
import com.example.feature.f026.contract.F026Key
import com.example.feature.f027.contract.F027Key

fun EntryProviderScope<NavKey>.f024Entries(backStack: NavBackStack<NavKey>) {
    entry<F024Key> {
        F024Screen(
            onF025Key = {
                backStack.add(F025Key)
            },
            onF026Key = {
                backStack.add(F026Key)
            },
            onF027Key = {
                backStack.add(F027Key)
            },
        )
    }
}

@Composable
internal fun F024Screen(
    onF025Key: () -> Unit,
    onF026Key: () -> Unit,
    onF027Key: () -> Unit,
) {
    Column {
        Text("F024")
        Button(onClick = onF025Key) {
            Text("F024 -> F025")
        }
        Button(onClick = onF026Key) {
            Text("F024 -> F026")
        }
        Button(onClick = onF027Key) {
            Text("F024 -> F027")
        }
    }
}
