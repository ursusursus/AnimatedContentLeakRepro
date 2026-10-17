package com.example.feature.f141.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f141.contract.F141Key
import com.example.feature.f142.contract.F142Key
import com.example.feature.f143.contract.F143Key
import com.example.feature.f144.contract.F144Key

fun EntryProviderScope<NavKey>.f141Entries(backStack: NavBackStack<NavKey>) {
    entry<F141Key> {
        F141Screen(
            onF142Key = {
                backStack.add(F142Key)
            },
            onF143Key = {
                backStack.add(F143Key)
            },
            onF144Key = {
                backStack.add(F144Key)
            },
        )
    }
}

@Composable
internal fun F141Screen(
    onF142Key: () -> Unit,
    onF143Key: () -> Unit,
    onF144Key: () -> Unit,
) {
    Column {
        Text("F141")
        Button(onClick = onF142Key) {
            Text("F141 -> F142")
        }
        Button(onClick = onF143Key) {
            Text("F141 -> F143")
        }
        Button(onClick = onF144Key) {
            Text("F141 -> F144")
        }
    }
}
