package com.example.feature.f233.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f233.contract.F233Key
import com.example.feature.f234.contract.F234Key
import com.example.feature.f235.contract.F235Key
import com.example.feature.f236.contract.F236Key

fun EntryProviderScope<NavKey>.f233Entries(backStack: NavBackStack<NavKey>) {
    entry<F233Key> {
        F233Screen(
            onF234Key = {
                backStack.add(F234Key)
            },
            onF235Key = {
                backStack.add(F235Key)
            },
            onF236Key = {
                backStack.add(F236Key)
            },
        )
    }
}

@Composable
internal fun F233Screen(
    onF234Key: () -> Unit,
    onF235Key: () -> Unit,
    onF236Key: () -> Unit,
) {
    Column {
        Text("F233")
        Button(onClick = onF234Key) {
            Text("F233 -> F234")
        }
        Button(onClick = onF235Key) {
            Text("F233 -> F235")
        }
        Button(onClick = onF236Key) {
            Text("F233 -> F236")
        }
    }
}
