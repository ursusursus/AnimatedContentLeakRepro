package com.example.feature.f236.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f236.contract.F236Key
import com.example.feature.f237.contract.F237Key
import com.example.feature.f238.contract.F238Key
import com.example.feature.f239.contract.F239Key

fun EntryProviderScope<NavKey>.f236Entries(backStack: NavBackStack<NavKey>) {
    entry<F236Key> {
        F236Screen(
            onF237Key = {
                backStack.add(F237Key)
            },
            onF238Key = {
                backStack.add(F238Key)
            },
            onF239Key = {
                backStack.add(F239Key)
            },
        )
    }
}

@Composable
internal fun F236Screen(
    onF237Key: () -> Unit,
    onF238Key: () -> Unit,
    onF239Key: () -> Unit,
) {
    Column {
        Text("F236")
        Button(onClick = onF237Key) {
            Text("F236 -> F237")
        }
        Button(onClick = onF238Key) {
            Text("F236 -> F238")
        }
        Button(onClick = onF239Key) {
            Text("F236 -> F239")
        }
    }
}
