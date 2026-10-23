package com.example.feature.f249.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f249.contract.F249Key
import com.example.feature.f250.contract.F250Key
import com.example.feature.f251.contract.F251Key
import com.example.feature.f252.contract.F252Key

fun EntryProviderScope<NavKey>.f249Entries(backStack: NavBackStack<NavKey>) {
    entry<F249Key> {
        F249Screen(
            onF250Key = {
                backStack.add(F250Key)
            },
            onF251Key = {
                backStack.add(F251Key)
            },
            onF252Key = {
                backStack.add(F252Key)
            },
        )
    }
}

@Composable
internal fun F249Screen(
    onF250Key: () -> Unit,
    onF251Key: () -> Unit,
    onF252Key: () -> Unit,
) {
    Column {
        Text("F249")
        Button(onClick = onF250Key) {
            Text("F249 -> F250")
        }
        Button(onClick = onF251Key) {
            Text("F249 -> F251")
        }
        Button(onClick = onF252Key) {
            Text("F249 -> F252")
        }
    }
}
