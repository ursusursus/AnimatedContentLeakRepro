package com.example.feature.f268.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f268.contract.F268Key
import com.example.feature.f269.contract.F269Key
import com.example.feature.f270.contract.F270Key
import com.example.feature.f271.contract.F271Key

fun EntryProviderScope<NavKey>.f268Entries(backStack: NavBackStack<NavKey>) {
    entry<F268Key> {
        F268Screen(
            onF269Key = {
                backStack.add(F269Key)
            },
            onF270Key = {
                backStack.add(F270Key)
            },
            onF271Key = {
                backStack.add(F271Key)
            },
        )
    }
}

@Composable
internal fun F268Screen(
    onF269Key: () -> Unit,
    onF270Key: () -> Unit,
    onF271Key: () -> Unit,
) {
    Column {
        Text("F268")
        Button(onClick = onF269Key) {
            Text("F268 -> F269")
        }
        Button(onClick = onF270Key) {
            Text("F268 -> F270")
        }
        Button(onClick = onF271Key) {
            Text("F268 -> F271")
        }
    }
}
