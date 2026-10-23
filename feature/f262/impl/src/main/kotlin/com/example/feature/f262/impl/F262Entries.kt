package com.example.feature.f262.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f262.contract.F262Key
import com.example.feature.f263.contract.F263Key
import com.example.feature.f264.contract.F264Key
import com.example.feature.f265.contract.F265Key

fun EntryProviderScope<NavKey>.f262Entries(backStack: NavBackStack<NavKey>) {
    entry<F262Key> {
        F262Screen(
            onF263Key = {
                backStack.add(F263Key)
            },
            onF264Key = {
                backStack.add(F264Key)
            },
            onF265Key = {
                backStack.add(F265Key)
            },
        )
    }
}

@Composable
internal fun F262Screen(
    onF263Key: () -> Unit,
    onF264Key: () -> Unit,
    onF265Key: () -> Unit,
) {
    Column {
        Text("F262")
        Button(onClick = onF263Key) {
            Text("F262 -> F263")
        }
        Button(onClick = onF264Key) {
            Text("F262 -> F264")
        }
        Button(onClick = onF265Key) {
            Text("F262 -> F265")
        }
    }
}
