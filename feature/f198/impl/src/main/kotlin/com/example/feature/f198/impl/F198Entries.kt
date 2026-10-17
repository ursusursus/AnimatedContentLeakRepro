package com.example.feature.f198.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f001.contract.F001Key
import com.example.feature.f198.contract.F198Key
import com.example.feature.f199.contract.F199Key
import com.example.feature.f200.contract.F200Key

fun EntryProviderScope<NavKey>.f198Entries(backStack: NavBackStack<NavKey>) {
    entry<F198Key> {
        F198Screen(
            onF199Key = {
                backStack.add(F199Key)
            },
            onF200Key = {
                backStack.add(F200Key)
            },
            onF001Key = {
                backStack.add(F001Key)
            },
        )
    }
}

@Composable
internal fun F198Screen(
    onF199Key: () -> Unit,
    onF200Key: () -> Unit,
    onF001Key: () -> Unit,
) {
    Column {
        Text("F198")
        Button(onClick = onF199Key) {
            Text("F198 -> F199")
        }
        Button(onClick = onF200Key) {
            Text("F198 -> F200")
        }
        Button(onClick = onF001Key) {
            Text("F198 -> F001")
        }
    }
}
