package com.example.feature.f123.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f123.contract.F123Key
import com.example.feature.f124.contract.F124Key
import com.example.feature.f125.contract.F125Key
import com.example.feature.f126.contract.F126Key

fun EntryProviderScope<NavKey>.f123Entries(backStack: NavBackStack<NavKey>) {
    entry<F123Key> {
        F123Screen(
            onF124Key = {
                backStack.add(F124Key)
            },
            onF125Key = {
                backStack.add(F125Key)
            },
            onF126Key = {
                backStack.add(F126Key)
            },
        )
    }
}

@Composable
internal fun F123Screen(
    onF124Key: () -> Unit,
    onF125Key: () -> Unit,
    onF126Key: () -> Unit,
) {
    Column {
        Text("F123")
        Button(onClick = onF124Key) {
            Text("F123 -> F124")
        }
        Button(onClick = onF125Key) {
            Text("F123 -> F125")
        }
        Button(onClick = onF126Key) {
            Text("F123 -> F126")
        }
    }
}
