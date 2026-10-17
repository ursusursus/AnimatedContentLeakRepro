package com.example.feature.f045.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f045.contract.F045Key
import com.example.feature.f046.contract.F046Key
import com.example.feature.f047.contract.F047Key
import com.example.feature.f048.contract.F048Key

fun EntryProviderScope<NavKey>.f045Entries(backStack: NavBackStack<NavKey>) {
    entry<F045Key> {
        F045Screen(
            onF046Key = {
                backStack.add(F046Key)
            },
            onF047Key = {
                backStack.add(F047Key)
            },
            onF048Key = {
                backStack.add(F048Key)
            },
        )
    }
}

@Composable
internal fun F045Screen(
    onF046Key: () -> Unit,
    onF047Key: () -> Unit,
    onF048Key: () -> Unit,
) {
    Column {
        Text("F045")
        Button(onClick = onF046Key) {
            Text("F045 -> F046")
        }
        Button(onClick = onF047Key) {
            Text("F045 -> F047")
        }
        Button(onClick = onF048Key) {
            Text("F045 -> F048")
        }
    }
}
