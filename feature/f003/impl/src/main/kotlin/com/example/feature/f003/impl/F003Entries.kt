package com.example.feature.f003.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f003.contract.F003Key
import com.example.feature.f004.contract.F004Key
import com.example.feature.f005.contract.F005Key
import com.example.feature.f006.contract.F006Key

fun EntryProviderScope<NavKey>.f003Entries(backStack: NavBackStack<NavKey>) {
    entry<F003Key> {
        F003Screen(
            onF004Key = {
                backStack.add(F004Key)
            },
            onF005Key = {
                backStack.add(F005Key)
            },
            onF006Key = {
                backStack.add(F006Key)
            },
        )
    }
}

@Composable
internal fun F003Screen(
    onF004Key: () -> Unit,
    onF005Key: () -> Unit,
    onF006Key: () -> Unit,
) {
    Column {
        Text("F003")
        Button(onClick = onF004Key) {
            Text("F003 -> F004")
        }
        Button(onClick = onF005Key) {
            Text("F003 -> F005")
        }
        Button(onClick = onF006Key) {
            Text("F003 -> F006")
        }
    }
}
