package com.example.feature.f275.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f275.contract.F275Key
import com.example.feature.f001.contract.F001Key
import com.example.feature.f002.contract.F002Key
import com.example.feature.f003.contract.F003Key

fun EntryProviderScope<NavKey>.f275Entries(backStack: NavBackStack<NavKey>) {
    entry<F275Key> {
        F275Screen(
            onF001Key = {
                backStack.add(F001Key)
            },
            onF002Key = {
                backStack.add(F002Key)
            },
            onF003Key = {
                backStack.add(F003Key)
            },
        )
    }
}

@Composable
internal fun F275Screen(
    onF001Key: () -> Unit,
    onF002Key: () -> Unit,
    onF003Key: () -> Unit,
) {
    Column {
        Text("F275")
        Button(onClick = onF001Key) {
            Text("F275 -> F001")
        }
        Button(onClick = onF002Key) {
            Text("F275 -> F002")
        }
        Button(onClick = onF003Key) {
            Text("F275 -> F003")
        }
    }
}
