package com.example.feature.f270.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f270.contract.F270Key
import com.example.feature.f271.contract.F271Key
import com.example.feature.f272.contract.F272Key
import com.example.feature.f273.contract.F273Key

fun EntryProviderScope<NavKey>.f270Entries(backStack: NavBackStack<NavKey>) {
    entry<F270Key> {
        F270Screen(
            onF271Key = {
                backStack.add(F271Key)
            },
            onF272Key = {
                backStack.add(F272Key)
            },
            onF273Key = {
                backStack.add(F273Key)
            },
        )
    }
}

@Composable
internal fun F270Screen(
    onF271Key: () -> Unit,
    onF272Key: () -> Unit,
    onF273Key: () -> Unit,
) {
    Column {
        Text("F270")
        Button(onClick = onF271Key) {
            Text("F270 -> F271")
        }
        Button(onClick = onF272Key) {
            Text("F270 -> F272")
        }
        Button(onClick = onF273Key) {
            Text("F270 -> F273")
        }
    }
}
