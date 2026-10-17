package com.example.feature.f043.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f043.contract.F043Key
import com.example.feature.f044.contract.F044Key
import com.example.feature.f045.contract.F045Key
import com.example.feature.f046.contract.F046Key

fun EntryProviderScope<NavKey>.f043Entries(backStack: NavBackStack<NavKey>) {
    entry<F043Key> {
        F043Screen(
            onF044Key = {
                backStack.add(F044Key)
            },
            onF045Key = {
                backStack.add(F045Key)
            },
            onF046Key = {
                backStack.add(F046Key)
            },
        )
    }
}

@Composable
internal fun F043Screen(
    onF044Key: () -> Unit,
    onF045Key: () -> Unit,
    onF046Key: () -> Unit,
) {
    Column {
        Text("F043")
        Button(onClick = onF044Key) {
            Text("F043 -> F044")
        }
        Button(onClick = onF045Key) {
            Text("F043 -> F045")
        }
        Button(onClick = onF046Key) {
            Text("F043 -> F046")
        }
    }
}
