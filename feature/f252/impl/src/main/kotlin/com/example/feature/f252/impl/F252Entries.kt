package com.example.feature.f252.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f252.contract.F252Key
import com.example.feature.f253.contract.F253Key
import com.example.feature.f254.contract.F254Key
import com.example.feature.f255.contract.F255Key

fun EntryProviderScope<NavKey>.f252Entries(backStack: NavBackStack<NavKey>) {
    entry<F252Key> {
        F252Screen(
            onF253Key = {
                backStack.add(F253Key)
            },
            onF254Key = {
                backStack.add(F254Key)
            },
            onF255Key = {
                backStack.add(F255Key)
            },
        )
    }
}

@Composable
internal fun F252Screen(
    onF253Key: () -> Unit,
    onF254Key: () -> Unit,
    onF255Key: () -> Unit,
) {
    Column {
        Text("F252")
        Button(onClick = onF253Key) {
            Text("F252 -> F253")
        }
        Button(onClick = onF254Key) {
            Text("F252 -> F254")
        }
        Button(onClick = onF255Key) {
            Text("F252 -> F255")
        }
    }
}
