package com.example.feature.f274.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f274.contract.F274Key
import com.example.feature.f275.contract.F275Key
import com.example.feature.f001.contract.F001Key
import com.example.feature.f002.contract.F002Key

fun EntryProviderScope<NavKey>.f274Entries(backStack: NavBackStack<NavKey>) {
    entry<F274Key> {
        F274Screen(
            onF275Key = {
                backStack.add(F275Key)
            },
            onF001Key = {
                backStack.add(F001Key)
            },
            onF002Key = {
                backStack.add(F002Key)
            },
        )
    }
}

@Composable
internal fun F274Screen(
    onF275Key: () -> Unit,
    onF001Key: () -> Unit,
    onF002Key: () -> Unit,
) {
    Column {
        Text("F274")
        Button(onClick = onF275Key) {
            Text("F274 -> F275")
        }
        Button(onClick = onF001Key) {
            Text("F274 -> F001")
        }
        Button(onClick = onF002Key) {
            Text("F274 -> F002")
        }
    }
}
