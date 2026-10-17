package com.example.feature.f171.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f171.contract.F171Key
import com.example.feature.f172.contract.F172Key
import com.example.feature.f173.contract.F173Key
import com.example.feature.f174.contract.F174Key

fun EntryProviderScope<NavKey>.f171Entries(backStack: NavBackStack<NavKey>) {
    entry<F171Key> {
        F171Screen(
            onF172Key = {
                backStack.add(F172Key)
            },
            onF173Key = {
                backStack.add(F173Key)
            },
            onF174Key = {
                backStack.add(F174Key)
            },
        )
    }
}

@Composable
internal fun F171Screen(
    onF172Key: () -> Unit,
    onF173Key: () -> Unit,
    onF174Key: () -> Unit,
) {
    Column {
        Text("F171")
        Button(onClick = onF172Key) {
            Text("F171 -> F172")
        }
        Button(onClick = onF173Key) {
            Text("F171 -> F173")
        }
        Button(onClick = onF174Key) {
            Text("F171 -> F174")
        }
    }
}
