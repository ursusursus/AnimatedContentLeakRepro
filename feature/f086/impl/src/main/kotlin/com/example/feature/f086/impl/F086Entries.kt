package com.example.feature.f086.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f086.contract.F086Key
import com.example.feature.f087.contract.F087Key
import com.example.feature.f088.contract.F088Key
import com.example.feature.f089.contract.F089Key

fun EntryProviderScope<NavKey>.f086Entries(backStack: NavBackStack<NavKey>) {
    entry<F086Key> {
        F086Screen(
            onF087Key = {
                backStack.add(F087Key)
            },
            onF088Key = {
                backStack.add(F088Key)
            },
            onF089Key = {
                backStack.add(F089Key)
            },
        )
    }
}

@Composable
internal fun F086Screen(
    onF087Key: () -> Unit,
    onF088Key: () -> Unit,
    onF089Key: () -> Unit,
) {
    Column {
        Text("F086")
        Button(onClick = onF087Key) {
            Text("F086 -> F087")
        }
        Button(onClick = onF088Key) {
            Text("F086 -> F088")
        }
        Button(onClick = onF089Key) {
            Text("F086 -> F089")
        }
    }
}
