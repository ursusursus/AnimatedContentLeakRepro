package com.example.feature.f234.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f234.contract.F234Key
import com.example.feature.f235.contract.F235Key
import com.example.feature.f236.contract.F236Key
import com.example.feature.f237.contract.F237Key

fun EntryProviderScope<NavKey>.f234Entries(backStack: NavBackStack<NavKey>) {
    entry<F234Key> {
        F234Screen(
            onF235Key = {
                backStack.add(F235Key)
            },
            onF236Key = {
                backStack.add(F236Key)
            },
            onF237Key = {
                backStack.add(F237Key)
            },
        )
    }
}

@Composable
internal fun F234Screen(
    onF235Key: () -> Unit,
    onF236Key: () -> Unit,
    onF237Key: () -> Unit,
) {
    Column {
        Text("F234")
        Button(onClick = onF235Key) {
            Text("F234 -> F235")
        }
        Button(onClick = onF236Key) {
            Text("F234 -> F236")
        }
        Button(onClick = onF237Key) {
            Text("F234 -> F237")
        }
    }
}
