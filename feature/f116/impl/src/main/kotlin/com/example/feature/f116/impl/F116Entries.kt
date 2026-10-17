package com.example.feature.f116.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f116.contract.F116Key
import com.example.feature.f117.contract.F117Key
import com.example.feature.f118.contract.F118Key
import com.example.feature.f119.contract.F119Key

fun EntryProviderScope<NavKey>.f116Entries(backStack: NavBackStack<NavKey>) {
    entry<F116Key> {
        F116Screen(
            onF117Key = {
                backStack.add(F117Key)
            },
            onF118Key = {
                backStack.add(F118Key)
            },
            onF119Key = {
                backStack.add(F119Key)
            },
        )
    }
}

@Composable
internal fun F116Screen(
    onF117Key: () -> Unit,
    onF118Key: () -> Unit,
    onF119Key: () -> Unit,
) {
    Column {
        Text("F116")
        Button(onClick = onF117Key) {
            Text("F116 -> F117")
        }
        Button(onClick = onF118Key) {
            Text("F116 -> F118")
        }
        Button(onClick = onF119Key) {
            Text("F116 -> F119")
        }
    }
}
