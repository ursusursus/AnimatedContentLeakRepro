package com.example.feature.f120.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f120.contract.F120Key
import com.example.feature.f121.contract.F121Key
import com.example.feature.f122.contract.F122Key
import com.example.feature.f123.contract.F123Key

fun EntryProviderScope<NavKey>.f120Entries(backStack: NavBackStack<NavKey>) {
    entry<F120Key> {
        F120Screen(
            onF121Key = {
                backStack.add(F121Key)
            },
            onF122Key = {
                backStack.add(F122Key)
            },
            onF123Key = {
                backStack.add(F123Key)
            },
        )
    }
}

@Composable
internal fun F120Screen(
    onF121Key: () -> Unit,
    onF122Key: () -> Unit,
    onF123Key: () -> Unit,
) {
    Column {
        Text("F120")
        Button(onClick = onF121Key) {
            Text("F120 -> F121")
        }
        Button(onClick = onF122Key) {
            Text("F120 -> F122")
        }
        Button(onClick = onF123Key) {
            Text("F120 -> F123")
        }
    }
}
