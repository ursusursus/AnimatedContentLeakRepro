package com.example.feature.f037.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f037.contract.F037Key
import com.example.feature.f038.contract.F038Key
import com.example.feature.f039.contract.F039Key
import com.example.feature.f040.contract.F040Key

fun EntryProviderScope<NavKey>.f037Entries(backStack: NavBackStack<NavKey>) {
    entry<F037Key> {
        F037Screen(
            onF038Key = {
                backStack.add(F038Key)
            },
            onF039Key = {
                backStack.add(F039Key)
            },
            onF040Key = {
                backStack.add(F040Key)
            },
        )
    }
}

@Composable
internal fun F037Screen(
    onF038Key: () -> Unit,
    onF039Key: () -> Unit,
    onF040Key: () -> Unit,
) {
    Column {
        Text("F037")
        Button(onClick = onF038Key) {
            Text("F037 -> F038")
        }
        Button(onClick = onF039Key) {
            Text("F037 -> F039")
        }
        Button(onClick = onF040Key) {
            Text("F037 -> F040")
        }
    }
}
