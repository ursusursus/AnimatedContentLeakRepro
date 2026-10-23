package com.example.feature.f238.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f238.contract.F238Key
import com.example.feature.f239.contract.F239Key
import com.example.feature.f240.contract.F240Key
import com.example.feature.f241.contract.F241Key

fun EntryProviderScope<NavKey>.f238Entries(backStack: NavBackStack<NavKey>) {
    entry<F238Key> {
        F238Screen(
            onF239Key = {
                backStack.add(F239Key)
            },
            onF240Key = {
                backStack.add(F240Key)
            },
            onF241Key = {
                backStack.add(F241Key)
            },
        )
    }
}

@Composable
internal fun F238Screen(
    onF239Key: () -> Unit,
    onF240Key: () -> Unit,
    onF241Key: () -> Unit,
) {
    Column {
        Text("F238")
        Button(onClick = onF239Key) {
            Text("F238 -> F239")
        }
        Button(onClick = onF240Key) {
            Text("F238 -> F240")
        }
        Button(onClick = onF241Key) {
            Text("F238 -> F241")
        }
    }
}
