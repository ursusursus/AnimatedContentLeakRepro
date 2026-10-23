package com.example.feature.f269.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f269.contract.F269Key
import com.example.feature.f270.contract.F270Key
import com.example.feature.f271.contract.F271Key
import com.example.feature.f272.contract.F272Key

fun EntryProviderScope<NavKey>.f269Entries(backStack: NavBackStack<NavKey>) {
    entry<F269Key> {
        F269Screen(
            onF270Key = {
                backStack.add(F270Key)
            },
            onF271Key = {
                backStack.add(F271Key)
            },
            onF272Key = {
                backStack.add(F272Key)
            },
        )
    }
}

@Composable
internal fun F269Screen(
    onF270Key: () -> Unit,
    onF271Key: () -> Unit,
    onF272Key: () -> Unit,
) {
    Column {
        Text("F269")
        Button(onClick = onF270Key) {
            Text("F269 -> F270")
        }
        Button(onClick = onF271Key) {
            Text("F269 -> F271")
        }
        Button(onClick = onF272Key) {
            Text("F269 -> F272")
        }
    }
}
