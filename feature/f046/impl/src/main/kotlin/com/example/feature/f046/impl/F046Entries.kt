package com.example.feature.f046.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f046.contract.F046Key
import com.example.feature.f047.contract.F047Key
import com.example.feature.f048.contract.F048Key
import com.example.feature.f049.contract.F049Key

fun EntryProviderScope<NavKey>.f046Entries(backStack: NavBackStack<NavKey>) {
    entry<F046Key> {
        F046Screen(
            onF047Key = {
                backStack.add(F047Key)
            },
            onF048Key = {
                backStack.add(F048Key)
            },
            onF049Key = {
                backStack.add(F049Key)
            },
        )
    }
}

@Composable
internal fun F046Screen(
    onF047Key: () -> Unit,
    onF048Key: () -> Unit,
    onF049Key: () -> Unit,
) {
    Column {
        Text("F046")
        Button(onClick = onF047Key) {
            Text("F046 -> F047")
        }
        Button(onClick = onF048Key) {
            Text("F046 -> F048")
        }
        Button(onClick = onF049Key) {
            Text("F046 -> F049")
        }
    }
}
