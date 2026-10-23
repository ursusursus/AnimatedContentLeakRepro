package com.example.feature.f257.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f257.contract.F257Key
import com.example.feature.f258.contract.F258Key
import com.example.feature.f259.contract.F259Key
import com.example.feature.f260.contract.F260Key

fun EntryProviderScope<NavKey>.f257Entries(backStack: NavBackStack<NavKey>) {
    entry<F257Key> {
        F257Screen(
            onF258Key = {
                backStack.add(F258Key)
            },
            onF259Key = {
                backStack.add(F259Key)
            },
            onF260Key = {
                backStack.add(F260Key)
            },
        )
    }
}

@Composable
internal fun F257Screen(
    onF258Key: () -> Unit,
    onF259Key: () -> Unit,
    onF260Key: () -> Unit,
) {
    Column {
        Text("F257")
        Button(onClick = onF258Key) {
            Text("F257 -> F258")
        }
        Button(onClick = onF259Key) {
            Text("F257 -> F259")
        }
        Button(onClick = onF260Key) {
            Text("F257 -> F260")
        }
    }
}
