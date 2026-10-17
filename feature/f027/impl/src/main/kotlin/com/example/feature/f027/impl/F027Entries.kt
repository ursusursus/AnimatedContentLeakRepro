package com.example.feature.f027.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f027.contract.F027Key
import com.example.feature.f028.contract.F028Key
import com.example.feature.f029.contract.F029Key
import com.example.feature.f030.contract.F030Key

fun EntryProviderScope<NavKey>.f027Entries(backStack: NavBackStack<NavKey>) {
    entry<F027Key> {
        F027Screen(
            onF028Key = {
                backStack.add(F028Key)
            },
            onF029Key = {
                backStack.add(F029Key)
            },
            onF030Key = {
                backStack.add(F030Key)
            },
        )
    }
}

@Composable
internal fun F027Screen(
    onF028Key: () -> Unit,
    onF029Key: () -> Unit,
    onF030Key: () -> Unit,
) {
    Column {
        Text("F027")
        Button(onClick = onF028Key) {
            Text("F027 -> F028")
        }
        Button(onClick = onF029Key) {
            Text("F027 -> F029")
        }
        Button(onClick = onF030Key) {
            Text("F027 -> F030")
        }
    }
}
