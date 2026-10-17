package com.example.feature.f002.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f002.contract.F002Key
import com.example.feature.f003.contract.F003Key
import com.example.feature.f004.contract.F004Key
import com.example.feature.f005.contract.F005Key

fun EntryProviderScope<NavKey>.f002Entries(backStack: NavBackStack<NavKey>) {
    entry<F002Key> {
        F002Screen(
            onF003Key = {
                backStack.add(F003Key)
            },
            onF004Key = {
                backStack.add(F004Key)
            },
            onF005Key = {
                backStack.add(F005Key)
            },
        )
    }
}

@Composable
internal fun F002Screen(
    onF003Key: () -> Unit,
    onF004Key: () -> Unit,
    onF005Key: () -> Unit,
) {
    Column {
        Text("F002")
        Button(onClick = onF003Key) {
            Text("F002 -> F003")
        }
        Button(onClick = onF004Key) {
            Text("F002 -> F004")
        }
        Button(onClick = onF005Key) {
            Text("F002 -> F005")
        }
    }
}
