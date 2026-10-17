package com.example.feature.f044.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f044.contract.F044Key
import com.example.feature.f045.contract.F045Key
import com.example.feature.f046.contract.F046Key
import com.example.feature.f047.contract.F047Key

fun EntryProviderScope<NavKey>.f044Entries(backStack: NavBackStack<NavKey>) {
    entry<F044Key> {
        F044Screen(
            onF045Key = {
                backStack.add(F045Key)
            },
            onF046Key = {
                backStack.add(F046Key)
            },
            onF047Key = {
                backStack.add(F047Key)
            },
        )
    }
}

@Composable
internal fun F044Screen(
    onF045Key: () -> Unit,
    onF046Key: () -> Unit,
    onF047Key: () -> Unit,
) {
    Column {
        Text("F044")
        Button(onClick = onF045Key) {
            Text("F044 -> F045")
        }
        Button(onClick = onF046Key) {
            Text("F044 -> F046")
        }
        Button(onClick = onF047Key) {
            Text("F044 -> F047")
        }
    }
}
