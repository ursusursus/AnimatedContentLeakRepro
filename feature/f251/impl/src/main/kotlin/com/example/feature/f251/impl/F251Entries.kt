package com.example.feature.f251.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f251.contract.F251Key
import com.example.feature.f252.contract.F252Key
import com.example.feature.f253.contract.F253Key
import com.example.feature.f254.contract.F254Key

fun EntryProviderScope<NavKey>.f251Entries(backStack: NavBackStack<NavKey>) {
    entry<F251Key> {
        F251Screen(
            onF252Key = {
                backStack.add(F252Key)
            },
            onF253Key = {
                backStack.add(F253Key)
            },
            onF254Key = {
                backStack.add(F254Key)
            },
        )
    }
}

@Composable
internal fun F251Screen(
    onF252Key: () -> Unit,
    onF253Key: () -> Unit,
    onF254Key: () -> Unit,
) {
    Column {
        Text("F251")
        Button(onClick = onF252Key) {
            Text("F251 -> F252")
        }
        Button(onClick = onF253Key) {
            Text("F251 -> F253")
        }
        Button(onClick = onF254Key) {
            Text("F251 -> F254")
        }
    }
}
