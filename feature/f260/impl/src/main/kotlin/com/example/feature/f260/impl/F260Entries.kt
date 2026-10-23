package com.example.feature.f260.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f260.contract.F260Key
import com.example.feature.f261.contract.F261Key
import com.example.feature.f262.contract.F262Key
import com.example.feature.f263.contract.F263Key

fun EntryProviderScope<NavKey>.f260Entries(backStack: NavBackStack<NavKey>) {
    entry<F260Key> {
        F260Screen(
            onF261Key = {
                backStack.add(F261Key)
            },
            onF262Key = {
                backStack.add(F262Key)
            },
            onF263Key = {
                backStack.add(F263Key)
            },
        )
    }
}

@Composable
internal fun F260Screen(
    onF261Key: () -> Unit,
    onF262Key: () -> Unit,
    onF263Key: () -> Unit,
) {
    Column {
        Text("F260")
        Button(onClick = onF261Key) {
            Text("F260 -> F261")
        }
        Button(onClick = onF262Key) {
            Text("F260 -> F262")
        }
        Button(onClick = onF263Key) {
            Text("F260 -> F263")
        }
    }
}
