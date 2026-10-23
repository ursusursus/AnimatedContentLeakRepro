package com.example.feature.f271.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f271.contract.F271Key
import com.example.feature.f272.contract.F272Key
import com.example.feature.f273.contract.F273Key
import com.example.feature.f274.contract.F274Key

fun EntryProviderScope<NavKey>.f271Entries(backStack: NavBackStack<NavKey>) {
    entry<F271Key> {
        F271Screen(
            onF272Key = {
                backStack.add(F272Key)
            },
            onF273Key = {
                backStack.add(F273Key)
            },
            onF274Key = {
                backStack.add(F274Key)
            },
        )
    }
}

@Composable
internal fun F271Screen(
    onF272Key: () -> Unit,
    onF273Key: () -> Unit,
    onF274Key: () -> Unit,
) {
    Column {
        Text("F271")
        Button(onClick = onF272Key) {
            Text("F271 -> F272")
        }
        Button(onClick = onF273Key) {
            Text("F271 -> F273")
        }
        Button(onClick = onF274Key) {
            Text("F271 -> F274")
        }
    }
}
