package com.example.feature.f185.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f185.contract.F185Key
import com.example.feature.f186.contract.F186Key
import com.example.feature.f187.contract.F187Key
import com.example.feature.f188.contract.F188Key

fun EntryProviderScope<NavKey>.f185Entries(backStack: NavBackStack<NavKey>) {
    entry<F185Key> {
        F185Screen(
            onF186Key = {
                backStack.add(F186Key)
            },
            onF187Key = {
                backStack.add(F187Key)
            },
            onF188Key = {
                backStack.add(F188Key)
            },
        )
    }
}

@Composable
internal fun F185Screen(
    onF186Key: () -> Unit,
    onF187Key: () -> Unit,
    onF188Key: () -> Unit,
) {
    Column {
        Text("F185")
        Button(onClick = onF186Key) {
            Text("F185 -> F186")
        }
        Button(onClick = onF187Key) {
            Text("F185 -> F187")
        }
        Button(onClick = onF188Key) {
            Text("F185 -> F188")
        }
    }
}
