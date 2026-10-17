package com.example.feature.f036.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f036.contract.F036Key
import com.example.feature.f037.contract.F037Key
import com.example.feature.f038.contract.F038Key
import com.example.feature.f039.contract.F039Key

fun EntryProviderScope<NavKey>.f036Entries(backStack: NavBackStack<NavKey>) {
    entry<F036Key> {
        F036Screen(
            onF037Key = {
                backStack.add(F037Key)
            },
            onF038Key = {
                backStack.add(F038Key)
            },
            onF039Key = {
                backStack.add(F039Key)
            },
        )
    }
}

@Composable
internal fun F036Screen(
    onF037Key: () -> Unit,
    onF038Key: () -> Unit,
    onF039Key: () -> Unit,
) {
    Column {
        Text("F036")
        Button(onClick = onF037Key) {
            Text("F036 -> F037")
        }
        Button(onClick = onF038Key) {
            Text("F036 -> F038")
        }
        Button(onClick = onF039Key) {
            Text("F036 -> F039")
        }
    }
}
