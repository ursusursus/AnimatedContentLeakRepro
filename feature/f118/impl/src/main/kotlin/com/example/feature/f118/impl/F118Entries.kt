package com.example.feature.f118.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f118.contract.F118Key
import com.example.feature.f119.contract.F119Key
import com.example.feature.f120.contract.F120Key
import com.example.feature.f121.contract.F121Key

fun EntryProviderScope<NavKey>.f118Entries(backStack: NavBackStack<NavKey>) {
    entry<F118Key> {
        F118Screen(
            onF119Key = {
                backStack.add(F119Key)
            },
            onF120Key = {
                backStack.add(F120Key)
            },
            onF121Key = {
                backStack.add(F121Key)
            },
        )
    }
}

@Composable
internal fun F118Screen(
    onF119Key: () -> Unit,
    onF120Key: () -> Unit,
    onF121Key: () -> Unit,
) {
    Column {
        Text("F118")
        Button(onClick = onF119Key) {
            Text("F118 -> F119")
        }
        Button(onClick = onF120Key) {
            Text("F118 -> F120")
        }
        Button(onClick = onF121Key) {
            Text("F118 -> F121")
        }
    }
}
