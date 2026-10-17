package com.example.feature.f074.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f074.contract.F074Key
import com.example.feature.f075.contract.F075Key
import com.example.feature.f076.contract.F076Key
import com.example.feature.f077.contract.F077Key

fun EntryProviderScope<NavKey>.f074Entries(backStack: NavBackStack<NavKey>) {
    entry<F074Key> {
        F074Screen(
            onF075Key = {
                backStack.add(F075Key)
            },
            onF076Key = {
                backStack.add(F076Key)
            },
            onF077Key = {
                backStack.add(F077Key)
            },
        )
    }
}

@Composable
internal fun F074Screen(
    onF075Key: () -> Unit,
    onF076Key: () -> Unit,
    onF077Key: () -> Unit,
) {
    Column {
        Text("F074")
        Button(onClick = onF075Key) {
            Text("F074 -> F075")
        }
        Button(onClick = onF076Key) {
            Text("F074 -> F076")
        }
        Button(onClick = onF077Key) {
            Text("F074 -> F077")
        }
    }
}
