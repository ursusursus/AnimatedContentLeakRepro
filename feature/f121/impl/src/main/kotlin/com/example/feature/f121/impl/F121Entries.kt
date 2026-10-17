package com.example.feature.f121.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f121.contract.F121Key
import com.example.feature.f122.contract.F122Key
import com.example.feature.f123.contract.F123Key
import com.example.feature.f124.contract.F124Key

fun EntryProviderScope<NavKey>.f121Entries(backStack: NavBackStack<NavKey>) {
    entry<F121Key> {
        F121Screen(
            onF122Key = {
                backStack.add(F122Key)
            },
            onF123Key = {
                backStack.add(F123Key)
            },
            onF124Key = {
                backStack.add(F124Key)
            },
        )
    }
}

@Composable
internal fun F121Screen(
    onF122Key: () -> Unit,
    onF123Key: () -> Unit,
    onF124Key: () -> Unit,
) {
    Column {
        Text("F121")
        Button(onClick = onF122Key) {
            Text("F121 -> F122")
        }
        Button(onClick = onF123Key) {
            Text("F121 -> F123")
        }
        Button(onClick = onF124Key) {
            Text("F121 -> F124")
        }
    }
}
