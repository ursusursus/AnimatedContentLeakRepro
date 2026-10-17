package com.example.feature.f066.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f066.contract.F066Key
import com.example.feature.f067.contract.F067Key
import com.example.feature.f068.contract.F068Key
import com.example.feature.f069.contract.F069Key

fun EntryProviderScope<NavKey>.f066Entries(backStack: NavBackStack<NavKey>) {
    entry<F066Key> {
        F066Screen(
            onF067Key = {
                backStack.add(F067Key)
            },
            onF068Key = {
                backStack.add(F068Key)
            },
            onF069Key = {
                backStack.add(F069Key)
            },
        )
    }
}

@Composable
internal fun F066Screen(
    onF067Key: () -> Unit,
    onF068Key: () -> Unit,
    onF069Key: () -> Unit,
) {
    Column {
        Text("F066")
        Button(onClick = onF067Key) {
            Text("F066 -> F067")
        }
        Button(onClick = onF068Key) {
            Text("F066 -> F068")
        }
        Button(onClick = onF069Key) {
            Text("F066 -> F069")
        }
    }
}
