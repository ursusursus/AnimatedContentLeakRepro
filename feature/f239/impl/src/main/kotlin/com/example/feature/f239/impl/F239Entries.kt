package com.example.feature.f239.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f239.contract.F239Key
import com.example.feature.f240.contract.F240Key
import com.example.feature.f241.contract.F241Key
import com.example.feature.f242.contract.F242Key

fun EntryProviderScope<NavKey>.f239Entries(backStack: NavBackStack<NavKey>) {
    entry<F239Key> {
        F239Screen(
            onF240Key = {
                backStack.add(F240Key)
            },
            onF241Key = {
                backStack.add(F241Key)
            },
            onF242Key = {
                backStack.add(F242Key)
            },
        )
    }
}

@Composable
internal fun F239Screen(
    onF240Key: () -> Unit,
    onF241Key: () -> Unit,
    onF242Key: () -> Unit,
) {
    Column {
        Text("F239")
        Button(onClick = onF240Key) {
            Text("F239 -> F240")
        }
        Button(onClick = onF241Key) {
            Text("F239 -> F241")
        }
        Button(onClick = onF242Key) {
            Text("F239 -> F242")
        }
    }
}
