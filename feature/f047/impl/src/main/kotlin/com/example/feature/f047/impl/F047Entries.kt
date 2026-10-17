package com.example.feature.f047.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f047.contract.F047Key
import com.example.feature.f048.contract.F048Key
import com.example.feature.f049.contract.F049Key
import com.example.feature.f050.contract.F050Key

fun EntryProviderScope<NavKey>.f047Entries(backStack: NavBackStack<NavKey>) {
    entry<F047Key> {
        F047Screen(
            onF048Key = {
                backStack.add(F048Key)
            },
            onF049Key = {
                backStack.add(F049Key)
            },
            onF050Key = {
                backStack.add(F050Key)
            },
        )
    }
}

@Composable
internal fun F047Screen(
    onF048Key: () -> Unit,
    onF049Key: () -> Unit,
    onF050Key: () -> Unit,
) {
    Column {
        Text("F047")
        Button(onClick = onF048Key) {
            Text("F047 -> F048")
        }
        Button(onClick = onF049Key) {
            Text("F047 -> F049")
        }
        Button(onClick = onF050Key) {
            Text("F047 -> F050")
        }
    }
}
