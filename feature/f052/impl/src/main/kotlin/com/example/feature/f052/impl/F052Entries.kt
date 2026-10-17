package com.example.feature.f052.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f052.contract.F052Key
import com.example.feature.f053.contract.F053Key
import com.example.feature.f054.contract.F054Key
import com.example.feature.f055.contract.F055Key

fun EntryProviderScope<NavKey>.f052Entries(backStack: NavBackStack<NavKey>) {
    entry<F052Key> {
        F052Screen(
            onF053Key = {
                backStack.add(F053Key)
            },
            onF054Key = {
                backStack.add(F054Key)
            },
            onF055Key = {
                backStack.add(F055Key)
            },
        )
    }
}

@Composable
internal fun F052Screen(
    onF053Key: () -> Unit,
    onF054Key: () -> Unit,
    onF055Key: () -> Unit,
) {
    Column {
        Text("F052")
        Button(onClick = onF053Key) {
            Text("F052 -> F053")
        }
        Button(onClick = onF054Key) {
            Text("F052 -> F054")
        }
        Button(onClick = onF055Key) {
            Text("F052 -> F055")
        }
    }
}
