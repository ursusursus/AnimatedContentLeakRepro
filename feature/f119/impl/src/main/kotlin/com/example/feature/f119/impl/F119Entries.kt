package com.example.feature.f119.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f119.contract.F119Key
import com.example.feature.f120.contract.F120Key
import com.example.feature.f121.contract.F121Key
import com.example.feature.f122.contract.F122Key

fun EntryProviderScope<NavKey>.f119Entries(backStack: NavBackStack<NavKey>) {
    entry<F119Key> {
        F119Screen(
            onF120Key = {
                backStack.add(F120Key)
            },
            onF121Key = {
                backStack.add(F121Key)
            },
            onF122Key = {
                backStack.add(F122Key)
            },
        )
    }
}

@Composable
internal fun F119Screen(
    onF120Key: () -> Unit,
    onF121Key: () -> Unit,
    onF122Key: () -> Unit,
) {
    Column {
        Text("F119")
        Button(onClick = onF120Key) {
            Text("F119 -> F120")
        }
        Button(onClick = onF121Key) {
            Text("F119 -> F121")
        }
        Button(onClick = onF122Key) {
            Text("F119 -> F122")
        }
    }
}
