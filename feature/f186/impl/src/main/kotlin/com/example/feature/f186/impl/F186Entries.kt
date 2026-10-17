package com.example.feature.f186.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f186.contract.F186Key
import com.example.feature.f187.contract.F187Key
import com.example.feature.f188.contract.F188Key
import com.example.feature.f189.contract.F189Key

fun EntryProviderScope<NavKey>.f186Entries(backStack: NavBackStack<NavKey>) {
    entry<F186Key> {
        F186Screen(
            onF187Key = {
                backStack.add(F187Key)
            },
            onF188Key = {
                backStack.add(F188Key)
            },
            onF189Key = {
                backStack.add(F189Key)
            },
        )
    }
}

@Composable
internal fun F186Screen(
    onF187Key: () -> Unit,
    onF188Key: () -> Unit,
    onF189Key: () -> Unit,
) {
    Column {
        Text("F186")
        Button(onClick = onF187Key) {
            Text("F186 -> F187")
        }
        Button(onClick = onF188Key) {
            Text("F186 -> F188")
        }
        Button(onClick = onF189Key) {
            Text("F186 -> F189")
        }
    }
}
