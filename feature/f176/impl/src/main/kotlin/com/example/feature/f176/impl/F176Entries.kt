package com.example.feature.f176.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f176.contract.F176Key
import com.example.feature.f177.contract.F177Key
import com.example.feature.f178.contract.F178Key
import com.example.feature.f179.contract.F179Key

fun EntryProviderScope<NavKey>.f176Entries(backStack: NavBackStack<NavKey>) {
    entry<F176Key> {
        F176Screen(
            onF177Key = {
                backStack.add(F177Key)
            },
            onF178Key = {
                backStack.add(F178Key)
            },
            onF179Key = {
                backStack.add(F179Key)
            },
        )
    }
}

@Composable
internal fun F176Screen(
    onF177Key: () -> Unit,
    onF178Key: () -> Unit,
    onF179Key: () -> Unit,
) {
    Column {
        Text("F176")
        Button(onClick = onF177Key) {
            Text("F176 -> F177")
        }
        Button(onClick = onF178Key) {
            Text("F176 -> F178")
        }
        Button(onClick = onF179Key) {
            Text("F176 -> F179")
        }
    }
}
