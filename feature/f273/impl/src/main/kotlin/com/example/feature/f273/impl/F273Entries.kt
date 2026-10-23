package com.example.feature.f273.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f273.contract.F273Key
import com.example.feature.f274.contract.F274Key
import com.example.feature.f275.contract.F275Key
import com.example.feature.f001.contract.F001Key

fun EntryProviderScope<NavKey>.f273Entries(backStack: NavBackStack<NavKey>) {
    entry<F273Key> {
        F273Screen(
            onF274Key = {
                backStack.add(F274Key)
            },
            onF275Key = {
                backStack.add(F275Key)
            },
            onF001Key = {
                backStack.add(F001Key)
            },
        )
    }
}

@Composable
internal fun F273Screen(
    onF274Key: () -> Unit,
    onF275Key: () -> Unit,
    onF001Key: () -> Unit,
) {
    Column {
        Text("F273")
        Button(onClick = onF274Key) {
            Text("F273 -> F274")
        }
        Button(onClick = onF275Key) {
            Text("F273 -> F275")
        }
        Button(onClick = onF001Key) {
            Text("F273 -> F001")
        }
    }
}
