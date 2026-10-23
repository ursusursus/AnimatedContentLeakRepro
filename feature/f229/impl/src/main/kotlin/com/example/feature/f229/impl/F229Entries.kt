package com.example.feature.f229.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f229.contract.F229Key
import com.example.feature.f230.contract.F230Key
import com.example.feature.f231.contract.F231Key
import com.example.feature.f232.contract.F232Key

fun EntryProviderScope<NavKey>.f229Entries(backStack: NavBackStack<NavKey>) {
    entry<F229Key> {
        F229Screen(
            onF230Key = {
                backStack.add(F230Key)
            },
            onF231Key = {
                backStack.add(F231Key)
            },
            onF232Key = {
                backStack.add(F232Key)
            },
        )
    }
}

@Composable
internal fun F229Screen(
    onF230Key: () -> Unit,
    onF231Key: () -> Unit,
    onF232Key: () -> Unit,
) {
    Column {
        Text("F229")
        Button(onClick = onF230Key) {
            Text("F229 -> F230")
        }
        Button(onClick = onF231Key) {
            Text("F229 -> F231")
        }
        Button(onClick = onF232Key) {
            Text("F229 -> F232")
        }
    }
}
