package com.example.feature.f072.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f072.contract.F072Key
import com.example.feature.f073.contract.F073Key
import com.example.feature.f074.contract.F074Key
import com.example.feature.f075.contract.F075Key

fun EntryProviderScope<NavKey>.f072Entries(backStack: NavBackStack<NavKey>) {
    entry<F072Key> {
        F072Screen(
            onF073Key = {
                backStack.add(F073Key)
            },
            onF074Key = {
                backStack.add(F074Key)
            },
            onF075Key = {
                backStack.add(F075Key)
            },
        )
    }
}

@Composable
internal fun F072Screen(
    onF073Key: () -> Unit,
    onF074Key: () -> Unit,
    onF075Key: () -> Unit,
) {
    Column {
        Text("F072")
        Button(onClick = onF073Key) {
            Text("F072 -> F073")
        }
        Button(onClick = onF074Key) {
            Text("F072 -> F074")
        }
        Button(onClick = onF075Key) {
            Text("F072 -> F075")
        }
    }
}
