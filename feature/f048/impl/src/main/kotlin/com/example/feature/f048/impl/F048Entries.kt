package com.example.feature.f048.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f048.contract.F048Key
import com.example.feature.f049.contract.F049Key
import com.example.feature.f050.contract.F050Key
import com.example.feature.f051.contract.F051Key

fun EntryProviderScope<NavKey>.f048Entries(backStack: NavBackStack<NavKey>) {
    entry<F048Key> {
        F048Screen(
            onF049Key = {
                backStack.add(F049Key)
            },
            onF050Key = {
                backStack.add(F050Key)
            },
            onF051Key = {
                backStack.add(F051Key)
            },
        )
    }
}

@Composable
internal fun F048Screen(
    onF049Key: () -> Unit,
    onF050Key: () -> Unit,
    onF051Key: () -> Unit,
) {
    Column {
        Text("F048")
        Button(onClick = onF049Key) {
            Text("F048 -> F049")
        }
        Button(onClick = onF050Key) {
            Text("F048 -> F050")
        }
        Button(onClick = onF051Key) {
            Text("F048 -> F051")
        }
    }
}
