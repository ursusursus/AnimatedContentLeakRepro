package com.example.feature.f261.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f261.contract.F261Key
import com.example.feature.f262.contract.F262Key
import com.example.feature.f263.contract.F263Key
import com.example.feature.f264.contract.F264Key

fun EntryProviderScope<NavKey>.f261Entries(backStack: NavBackStack<NavKey>) {
    entry<F261Key> {
        F261Screen(
            onF262Key = {
                backStack.add(F262Key)
            },
            onF263Key = {
                backStack.add(F263Key)
            },
            onF264Key = {
                backStack.add(F264Key)
            },
        )
    }
}

@Composable
internal fun F261Screen(
    onF262Key: () -> Unit,
    onF263Key: () -> Unit,
    onF264Key: () -> Unit,
) {
    Column {
        Text("F261")
        Button(onClick = onF262Key) {
            Text("F261 -> F262")
        }
        Button(onClick = onF263Key) {
            Text("F261 -> F263")
        }
        Button(onClick = onF264Key) {
            Text("F261 -> F264")
        }
    }
}
