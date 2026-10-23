package com.example.feature.f265.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f265.contract.F265Key
import com.example.feature.f266.contract.F266Key
import com.example.feature.f267.contract.F267Key
import com.example.feature.f268.contract.F268Key

fun EntryProviderScope<NavKey>.f265Entries(backStack: NavBackStack<NavKey>) {
    entry<F265Key> {
        F265Screen(
            onF266Key = {
                backStack.add(F266Key)
            },
            onF267Key = {
                backStack.add(F267Key)
            },
            onF268Key = {
                backStack.add(F268Key)
            },
        )
    }
}

@Composable
internal fun F265Screen(
    onF266Key: () -> Unit,
    onF267Key: () -> Unit,
    onF268Key: () -> Unit,
) {
    Column {
        Text("F265")
        Button(onClick = onF266Key) {
            Text("F265 -> F266")
        }
        Button(onClick = onF267Key) {
            Text("F265 -> F267")
        }
        Button(onClick = onF268Key) {
            Text("F265 -> F268")
        }
    }
}
