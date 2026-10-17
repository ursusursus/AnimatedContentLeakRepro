package com.example.feature.f170.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f170.contract.F170Key
import com.example.feature.f171.contract.F171Key
import com.example.feature.f172.contract.F172Key
import com.example.feature.f173.contract.F173Key

fun EntryProviderScope<NavKey>.f170Entries(backStack: NavBackStack<NavKey>) {
    entry<F170Key> {
        F170Screen(
            onF171Key = {
                backStack.add(F171Key)
            },
            onF172Key = {
                backStack.add(F172Key)
            },
            onF173Key = {
                backStack.add(F173Key)
            },
        )
    }
}

@Composable
internal fun F170Screen(
    onF171Key: () -> Unit,
    onF172Key: () -> Unit,
    onF173Key: () -> Unit,
) {
    Column {
        Text("F170")
        Button(onClick = onF171Key) {
            Text("F170 -> F171")
        }
        Button(onClick = onF172Key) {
            Text("F170 -> F172")
        }
        Button(onClick = onF173Key) {
            Text("F170 -> F173")
        }
    }
}
