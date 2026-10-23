package com.example.feature.f272.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f272.contract.F272Key
import com.example.feature.f273.contract.F273Key
import com.example.feature.f274.contract.F274Key
import com.example.feature.f275.contract.F275Key

fun EntryProviderScope<NavKey>.f272Entries(backStack: NavBackStack<NavKey>) {
    entry<F272Key> {
        F272Screen(
            onF273Key = {
                backStack.add(F273Key)
            },
            onF274Key = {
                backStack.add(F274Key)
            },
            onF275Key = {
                backStack.add(F275Key)
            },
        )
    }
}

@Composable
internal fun F272Screen(
    onF273Key: () -> Unit,
    onF274Key: () -> Unit,
    onF275Key: () -> Unit,
) {
    Column {
        Text("F272")
        Button(onClick = onF273Key) {
            Text("F272 -> F273")
        }
        Button(onClick = onF274Key) {
            Text("F272 -> F274")
        }
        Button(onClick = onF275Key) {
            Text("F272 -> F275")
        }
    }
}
