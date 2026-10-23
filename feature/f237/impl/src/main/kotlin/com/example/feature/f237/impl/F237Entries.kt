package com.example.feature.f237.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f237.contract.F237Key
import com.example.feature.f238.contract.F238Key
import com.example.feature.f239.contract.F239Key
import com.example.feature.f240.contract.F240Key

fun EntryProviderScope<NavKey>.f237Entries(backStack: NavBackStack<NavKey>) {
    entry<F237Key> {
        F237Screen(
            onF238Key = {
                backStack.add(F238Key)
            },
            onF239Key = {
                backStack.add(F239Key)
            },
            onF240Key = {
                backStack.add(F240Key)
            },
        )
    }
}

@Composable
internal fun F237Screen(
    onF238Key: () -> Unit,
    onF239Key: () -> Unit,
    onF240Key: () -> Unit,
) {
    Column {
        Text("F237")
        Button(onClick = onF238Key) {
            Text("F237 -> F238")
        }
        Button(onClick = onF239Key) {
            Text("F237 -> F239")
        }
        Button(onClick = onF240Key) {
            Text("F237 -> F240")
        }
    }
}
