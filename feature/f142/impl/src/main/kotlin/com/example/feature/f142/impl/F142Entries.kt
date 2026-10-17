package com.example.feature.f142.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f142.contract.F142Key
import com.example.feature.f143.contract.F143Key
import com.example.feature.f144.contract.F144Key
import com.example.feature.f145.contract.F145Key

fun EntryProviderScope<NavKey>.f142Entries(backStack: NavBackStack<NavKey>) {
    entry<F142Key> {
        F142Screen(
            onF143Key = {
                backStack.add(F143Key)
            },
            onF144Key = {
                backStack.add(F144Key)
            },
            onF145Key = {
                backStack.add(F145Key)
            },
        )
    }
}

@Composable
internal fun F142Screen(
    onF143Key: () -> Unit,
    onF144Key: () -> Unit,
    onF145Key: () -> Unit,
) {
    Column {
        Text("F142")
        Button(onClick = onF143Key) {
            Text("F142 -> F143")
        }
        Button(onClick = onF144Key) {
            Text("F142 -> F144")
        }
        Button(onClick = onF145Key) {
            Text("F142 -> F145")
        }
    }
}
