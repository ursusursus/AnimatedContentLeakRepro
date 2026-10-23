package com.example.feature.f228.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f228.contract.F228Key
import com.example.feature.f229.contract.F229Key
import com.example.feature.f230.contract.F230Key
import com.example.feature.f231.contract.F231Key

fun EntryProviderScope<NavKey>.f228Entries(backStack: NavBackStack<NavKey>) {
    entry<F228Key> {
        F228Screen(
            onF229Key = {
                backStack.add(F229Key)
            },
            onF230Key = {
                backStack.add(F230Key)
            },
            onF231Key = {
                backStack.add(F231Key)
            },
        )
    }
}

@Composable
internal fun F228Screen(
    onF229Key: () -> Unit,
    onF230Key: () -> Unit,
    onF231Key: () -> Unit,
) {
    Column {
        Text("F228")
        Button(onClick = onF229Key) {
            Text("F228 -> F229")
        }
        Button(onClick = onF230Key) {
            Text("F228 -> F230")
        }
        Button(onClick = onF231Key) {
            Text("F228 -> F231")
        }
    }
}
