package com.example.feature.f167.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f167.contract.F167Key
import com.example.feature.f168.contract.F168Key
import com.example.feature.f169.contract.F169Key
import com.example.feature.f170.contract.F170Key

fun EntryProviderScope<NavKey>.f167Entries(backStack: NavBackStack<NavKey>) {
    entry<F167Key> {
        F167Screen(
            onF168Key = {
                backStack.add(F168Key)
            },
            onF169Key = {
                backStack.add(F169Key)
            },
            onF170Key = {
                backStack.add(F170Key)
            },
        )
    }
}

@Composable
internal fun F167Screen(
    onF168Key: () -> Unit,
    onF169Key: () -> Unit,
    onF170Key: () -> Unit,
) {
    Column {
        Text("F167")
        Button(onClick = onF168Key) {
            Text("F167 -> F168")
        }
        Button(onClick = onF169Key) {
            Text("F167 -> F169")
        }
        Button(onClick = onF170Key) {
            Text("F167 -> F170")
        }
    }
}
