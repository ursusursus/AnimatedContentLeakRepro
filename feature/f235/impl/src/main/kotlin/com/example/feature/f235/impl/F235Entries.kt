package com.example.feature.f235.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f235.contract.F235Key
import com.example.feature.f236.contract.F236Key
import com.example.feature.f237.contract.F237Key
import com.example.feature.f238.contract.F238Key

fun EntryProviderScope<NavKey>.f235Entries(backStack: NavBackStack<NavKey>) {
    entry<F235Key> {
        F235Screen(
            onF236Key = {
                backStack.add(F236Key)
            },
            onF237Key = {
                backStack.add(F237Key)
            },
            onF238Key = {
                backStack.add(F238Key)
            },
        )
    }
}

@Composable
internal fun F235Screen(
    onF236Key: () -> Unit,
    onF237Key: () -> Unit,
    onF238Key: () -> Unit,
) {
    Column {
        Text("F235")
        Button(onClick = onF236Key) {
            Text("F235 -> F236")
        }
        Button(onClick = onF237Key) {
            Text("F235 -> F237")
        }
        Button(onClick = onF238Key) {
            Text("F235 -> F238")
        }
    }
}
