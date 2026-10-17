package com.example.feature.f124.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f124.contract.F124Key
import com.example.feature.f125.contract.F125Key
import com.example.feature.f126.contract.F126Key
import com.example.feature.f127.contract.F127Key

fun EntryProviderScope<NavKey>.f124Entries(backStack: NavBackStack<NavKey>) {
    entry<F124Key> {
        F124Screen(
            onF125Key = {
                backStack.add(F125Key)
            },
            onF126Key = {
                backStack.add(F126Key)
            },
            onF127Key = {
                backStack.add(F127Key)
            },
        )
    }
}

@Composable
internal fun F124Screen(
    onF125Key: () -> Unit,
    onF126Key: () -> Unit,
    onF127Key: () -> Unit,
) {
    Column {
        Text("F124")
        Button(onClick = onF125Key) {
            Text("F124 -> F125")
        }
        Button(onClick = onF126Key) {
            Text("F124 -> F126")
        }
        Button(onClick = onF127Key) {
            Text("F124 -> F127")
        }
    }
}
