package com.example.feature.f259.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f259.contract.F259Key
import com.example.feature.f260.contract.F260Key
import com.example.feature.f261.contract.F261Key
import com.example.feature.f262.contract.F262Key

fun EntryProviderScope<NavKey>.f259Entries(backStack: NavBackStack<NavKey>) {
    entry<F259Key> {
        F259Screen(
            onF260Key = {
                backStack.add(F260Key)
            },
            onF261Key = {
                backStack.add(F261Key)
            },
            onF262Key = {
                backStack.add(F262Key)
            },
        )
    }
}

@Composable
internal fun F259Screen(
    onF260Key: () -> Unit,
    onF261Key: () -> Unit,
    onF262Key: () -> Unit,
) {
    Column {
        Text("F259")
        Button(onClick = onF260Key) {
            Text("F259 -> F260")
        }
        Button(onClick = onF261Key) {
            Text("F259 -> F261")
        }
        Button(onClick = onF262Key) {
            Text("F259 -> F262")
        }
    }
}
