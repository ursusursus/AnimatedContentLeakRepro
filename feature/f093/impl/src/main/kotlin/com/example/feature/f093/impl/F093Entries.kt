package com.example.feature.f093.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f093.contract.F093Key
import com.example.feature.f094.contract.F094Key
import com.example.feature.f095.contract.F095Key
import com.example.feature.f096.contract.F096Key

fun EntryProviderScope<NavKey>.f093Entries(backStack: NavBackStack<NavKey>) {
    entry<F093Key> {
        F093Screen(
            onF094Key = {
                backStack.add(F094Key)
            },
            onF095Key = {
                backStack.add(F095Key)
            },
            onF096Key = {
                backStack.add(F096Key)
            },
        )
    }
}

@Composable
internal fun F093Screen(
    onF094Key: () -> Unit,
    onF095Key: () -> Unit,
    onF096Key: () -> Unit,
) {
    Column {
        Text("F093")
        Button(onClick = onF094Key) {
            Text("F093 -> F094")
        }
        Button(onClick = onF095Key) {
            Text("F093 -> F095")
        }
        Button(onClick = onF096Key) {
            Text("F093 -> F096")
        }
    }
}
