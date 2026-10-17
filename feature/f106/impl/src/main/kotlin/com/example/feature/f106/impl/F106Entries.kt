package com.example.feature.f106.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f106.contract.F106Key
import com.example.feature.f107.contract.F107Key
import com.example.feature.f108.contract.F108Key
import com.example.feature.f109.contract.F109Key

fun EntryProviderScope<NavKey>.f106Entries(backStack: NavBackStack<NavKey>) {
    entry<F106Key> {
        F106Screen(
            onF107Key = {
                backStack.add(F107Key)
            },
            onF108Key = {
                backStack.add(F108Key)
            },
            onF109Key = {
                backStack.add(F109Key)
            },
        )
    }
}

@Composable
internal fun F106Screen(
    onF107Key: () -> Unit,
    onF108Key: () -> Unit,
    onF109Key: () -> Unit,
) {
    Column {
        Text("F106")
        Button(onClick = onF107Key) {
            Text("F106 -> F107")
        }
        Button(onClick = onF108Key) {
            Text("F106 -> F108")
        }
        Button(onClick = onF109Key) {
            Text("F106 -> F109")
        }
    }
}
