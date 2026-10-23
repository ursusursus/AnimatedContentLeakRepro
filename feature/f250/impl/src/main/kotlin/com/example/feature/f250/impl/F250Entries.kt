package com.example.feature.f250.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f250.contract.F250Key
import com.example.feature.f251.contract.F251Key
import com.example.feature.f252.contract.F252Key
import com.example.feature.f253.contract.F253Key

fun EntryProviderScope<NavKey>.f250Entries(backStack: NavBackStack<NavKey>) {
    entry<F250Key> {
        F250Screen(
            onF251Key = {
                backStack.add(F251Key)
            },
            onF252Key = {
                backStack.add(F252Key)
            },
            onF253Key = {
                backStack.add(F253Key)
            },
        )
    }
}

@Composable
internal fun F250Screen(
    onF251Key: () -> Unit,
    onF252Key: () -> Unit,
    onF253Key: () -> Unit,
) {
    Column {
        Text("F250")
        Button(onClick = onF251Key) {
            Text("F250 -> F251")
        }
        Button(onClick = onF252Key) {
            Text("F250 -> F252")
        }
        Button(onClick = onF253Key) {
            Text("F250 -> F253")
        }
    }
}
