package com.example.feature.f266.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f266.contract.F266Key
import com.example.feature.f267.contract.F267Key
import com.example.feature.f268.contract.F268Key
import com.example.feature.f269.contract.F269Key

fun EntryProviderScope<NavKey>.f266Entries(backStack: NavBackStack<NavKey>) {
    entry<F266Key> {
        F266Screen(
            onF267Key = {
                backStack.add(F267Key)
            },
            onF268Key = {
                backStack.add(F268Key)
            },
            onF269Key = {
                backStack.add(F269Key)
            },
        )
    }
}

@Composable
internal fun F266Screen(
    onF267Key: () -> Unit,
    onF268Key: () -> Unit,
    onF269Key: () -> Unit,
) {
    Column {
        Text("F266")
        Button(onClick = onF267Key) {
            Text("F266 -> F267")
        }
        Button(onClick = onF268Key) {
            Text("F266 -> F268")
        }
        Button(onClick = onF269Key) {
            Text("F266 -> F269")
        }
    }
}
