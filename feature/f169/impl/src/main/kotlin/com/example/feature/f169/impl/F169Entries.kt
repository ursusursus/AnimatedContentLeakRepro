package com.example.feature.f169.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f169.contract.F169Key
import com.example.feature.f170.contract.F170Key
import com.example.feature.f171.contract.F171Key
import com.example.feature.f172.contract.F172Key

fun EntryProviderScope<NavKey>.f169Entries(backStack: NavBackStack<NavKey>) {
    entry<F169Key> {
        F169Screen(
            onF170Key = {
                backStack.add(F170Key)
            },
            onF171Key = {
                backStack.add(F171Key)
            },
            onF172Key = {
                backStack.add(F172Key)
            },
        )
    }
}

@Composable
internal fun F169Screen(
    onF170Key: () -> Unit,
    onF171Key: () -> Unit,
    onF172Key: () -> Unit,
) {
    Column {
        Text("F169")
        Button(onClick = onF170Key) {
            Text("F169 -> F170")
        }
        Button(onClick = onF171Key) {
            Text("F169 -> F171")
        }
        Button(onClick = onF172Key) {
            Text("F169 -> F172")
        }
    }
}
