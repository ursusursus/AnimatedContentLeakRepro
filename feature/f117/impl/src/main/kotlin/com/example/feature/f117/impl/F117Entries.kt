package com.example.feature.f117.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f117.contract.F117Key
import com.example.feature.f118.contract.F118Key
import com.example.feature.f119.contract.F119Key
import com.example.feature.f120.contract.F120Key

fun EntryProviderScope<NavKey>.f117Entries(backStack: NavBackStack<NavKey>) {
    entry<F117Key> {
        F117Screen(
            onF118Key = {
                backStack.add(F118Key)
            },
            onF119Key = {
                backStack.add(F119Key)
            },
            onF120Key = {
                backStack.add(F120Key)
            },
        )
    }
}

@Composable
internal fun F117Screen(
    onF118Key: () -> Unit,
    onF119Key: () -> Unit,
    onF120Key: () -> Unit,
) {
    Column {
        Text("F117")
        Button(onClick = onF118Key) {
            Text("F117 -> F118")
        }
        Button(onClick = onF119Key) {
            Text("F117 -> F119")
        }
        Button(onClick = onF120Key) {
            Text("F117 -> F120")
        }
    }
}
