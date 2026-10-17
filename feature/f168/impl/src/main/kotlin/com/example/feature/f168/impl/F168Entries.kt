package com.example.feature.f168.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f168.contract.F168Key
import com.example.feature.f169.contract.F169Key
import com.example.feature.f170.contract.F170Key
import com.example.feature.f171.contract.F171Key

fun EntryProviderScope<NavKey>.f168Entries(backStack: NavBackStack<NavKey>) {
    entry<F168Key> {
        F168Screen(
            onF169Key = {
                backStack.add(F169Key)
            },
            onF170Key = {
                backStack.add(F170Key)
            },
            onF171Key = {
                backStack.add(F171Key)
            },
        )
    }
}

@Composable
internal fun F168Screen(
    onF169Key: () -> Unit,
    onF170Key: () -> Unit,
    onF171Key: () -> Unit,
) {
    Column {
        Text("F168")
        Button(onClick = onF169Key) {
            Text("F168 -> F169")
        }
        Button(onClick = onF170Key) {
            Text("F168 -> F170")
        }
        Button(onClick = onF171Key) {
            Text("F168 -> F171")
        }
    }
}
