package com.example.feature.f217.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f217.contract.F217Key
import com.example.feature.f218.contract.F218Key
import com.example.feature.f219.contract.F219Key
import com.example.feature.f220.contract.F220Key

fun EntryProviderScope<NavKey>.f217Entries(backStack: NavBackStack<NavKey>) {
    entry<F217Key> {
        F217Screen(
            onF218Key = {
                backStack.add(F218Key)
            },
            onF219Key = {
                backStack.add(F219Key)
            },
            onF220Key = {
                backStack.add(F220Key)
            },
        )
    }
}

@Composable
internal fun F217Screen(
    onF218Key: () -> Unit,
    onF219Key: () -> Unit,
    onF220Key: () -> Unit,
) {
    Column {
        Text("F217")
        Button(onClick = onF218Key) {
            Text("F217 -> F218")
        }
        Button(onClick = onF219Key) {
            Text("F217 -> F219")
        }
        Button(onClick = onF220Key) {
            Text("F217 -> F220")
        }
    }
}
