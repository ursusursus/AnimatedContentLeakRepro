package com.example.feature.f026.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f026.contract.F026Key
import com.example.feature.f027.contract.F027Key
import com.example.feature.f028.contract.F028Key
import com.example.feature.f029.contract.F029Key

fun EntryProviderScope<NavKey>.f026Entries(backStack: NavBackStack<NavKey>) {
    entry<F026Key> {
        F026Screen(
            onF027Key = {
                backStack.add(F027Key)
            },
            onF028Key = {
                backStack.add(F028Key)
            },
            onF029Key = {
                backStack.add(F029Key)
            },
        )
    }
}

@Composable
internal fun F026Screen(
    onF027Key: () -> Unit,
    onF028Key: () -> Unit,
    onF029Key: () -> Unit,
) {
    Column {
        Text("F026")
        Button(onClick = onF027Key) {
            Text("F026 -> F027")
        }
        Button(onClick = onF028Key) {
            Text("F026 -> F028")
        }
        Button(onClick = onF029Key) {
            Text("F026 -> F029")
        }
    }
}
