package com.example.feature.f248.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f248.contract.F248Key
import com.example.feature.f249.contract.F249Key
import com.example.feature.f250.contract.F250Key
import com.example.feature.f251.contract.F251Key

fun EntryProviderScope<NavKey>.f248Entries(backStack: NavBackStack<NavKey>) {
    entry<F248Key> {
        F248Screen(
            onF249Key = {
                backStack.add(F249Key)
            },
            onF250Key = {
                backStack.add(F250Key)
            },
            onF251Key = {
                backStack.add(F251Key)
            },
        )
    }
}

@Composable
internal fun F248Screen(
    onF249Key: () -> Unit,
    onF250Key: () -> Unit,
    onF251Key: () -> Unit,
) {
    Column {
        Text("F248")
        Button(onClick = onF249Key) {
            Text("F248 -> F249")
        }
        Button(onClick = onF250Key) {
            Text("F248 -> F250")
        }
        Button(onClick = onF251Key) {
            Text("F248 -> F251")
        }
    }
}
