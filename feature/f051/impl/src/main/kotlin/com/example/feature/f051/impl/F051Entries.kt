package com.example.feature.f051.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f051.contract.F051Key
import com.example.feature.f052.contract.F052Key
import com.example.feature.f053.contract.F053Key
import com.example.feature.f054.contract.F054Key

fun EntryProviderScope<NavKey>.f051Entries(backStack: NavBackStack<NavKey>) {
    entry<F051Key> {
        F051Screen(
            onF052Key = {
                backStack.add(F052Key)
            },
            onF053Key = {
                backStack.add(F053Key)
            },
            onF054Key = {
                backStack.add(F054Key)
            },
        )
    }
}

@Composable
internal fun F051Screen(
    onF052Key: () -> Unit,
    onF053Key: () -> Unit,
    onF054Key: () -> Unit,
) {
    Column {
        Text("F051")
        Button(onClick = onF052Key) {
            Text("F051 -> F052")
        }
        Button(onClick = onF053Key) {
            Text("F051 -> F053")
        }
        Button(onClick = onF054Key) {
            Text("F051 -> F054")
        }
    }
}
