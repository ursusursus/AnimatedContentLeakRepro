package com.example.feature.f267.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f267.contract.F267Key
import com.example.feature.f268.contract.F268Key
import com.example.feature.f269.contract.F269Key
import com.example.feature.f270.contract.F270Key

fun EntryProviderScope<NavKey>.f267Entries(backStack: NavBackStack<NavKey>) {
    entry<F267Key> {
        F267Screen(
            onF268Key = {
                backStack.add(F268Key)
            },
            onF269Key = {
                backStack.add(F269Key)
            },
            onF270Key = {
                backStack.add(F270Key)
            },
        )
    }
}

@Composable
internal fun F267Screen(
    onF268Key: () -> Unit,
    onF269Key: () -> Unit,
    onF270Key: () -> Unit,
) {
    Column {
        Text("F267")
        Button(onClick = onF268Key) {
            Text("F267 -> F268")
        }
        Button(onClick = onF269Key) {
            Text("F267 -> F269")
        }
        Button(onClick = onF270Key) {
            Text("F267 -> F270")
        }
    }
}
