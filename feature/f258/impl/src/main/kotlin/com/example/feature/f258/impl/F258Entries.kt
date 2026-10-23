package com.example.feature.f258.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f258.contract.F258Key
import com.example.feature.f259.contract.F259Key
import com.example.feature.f260.contract.F260Key
import com.example.feature.f261.contract.F261Key

fun EntryProviderScope<NavKey>.f258Entries(backStack: NavBackStack<NavKey>) {
    entry<F258Key> {
        F258Screen(
            onF259Key = {
                backStack.add(F259Key)
            },
            onF260Key = {
                backStack.add(F260Key)
            },
            onF261Key = {
                backStack.add(F261Key)
            },
        )
    }
}

@Composable
internal fun F258Screen(
    onF259Key: () -> Unit,
    onF260Key: () -> Unit,
    onF261Key: () -> Unit,
) {
    Column {
        Text("F258")
        Button(onClick = onF259Key) {
            Text("F258 -> F259")
        }
        Button(onClick = onF260Key) {
            Text("F258 -> F260")
        }
        Button(onClick = onF261Key) {
            Text("F258 -> F261")
        }
    }
}
