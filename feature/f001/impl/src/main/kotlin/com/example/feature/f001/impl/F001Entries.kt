package com.example.feature.f001.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f001.contract.F001Key
import com.example.feature.f002.contract.F002Key
import com.example.feature.f003.contract.F003Key
import com.example.feature.f004.contract.F004Key

fun EntryProviderScope<NavKey>.f001Entries(backStack: NavBackStack<NavKey>) {
    entry<F001Key> {
        F001Screen(
            onF002Key = {
                backStack.add(F002Key)
            },
            onF003Key = {
                backStack.add(F003Key)
            },
            onF004Key = {
                backStack.add(F004Key)
            },
        )
    }
}

@Composable
internal fun F001Screen(
    onF002Key: () -> Unit,
    onF003Key: () -> Unit,
    onF004Key: () -> Unit,
) {
    Column {
        Text("F001")
        Button(onClick = onF002Key) {
            Text("F001 -> F002")
        }
        Button(onClick = onF003Key) {
            Text("F001 -> F003")
        }
        Button(onClick = onF004Key) {
            Text("F001 -> F004")
        }
    }
}
