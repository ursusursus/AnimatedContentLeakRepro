package com.example.feature.f227.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f227.contract.F227Key
import com.example.feature.f228.contract.F228Key
import com.example.feature.f229.contract.F229Key
import com.example.feature.f230.contract.F230Key

fun EntryProviderScope<NavKey>.f227Entries(backStack: NavBackStack<NavKey>) {
    entry<F227Key> {
        F227Screen(
            onF228Key = {
                backStack.add(F228Key)
            },
            onF229Key = {
                backStack.add(F229Key)
            },
            onF230Key = {
                backStack.add(F230Key)
            },
        )
    }
}

@Composable
internal fun F227Screen(
    onF228Key: () -> Unit,
    onF229Key: () -> Unit,
    onF230Key: () -> Unit,
) {
    Column {
        Text("F227")
        Button(onClick = onF228Key) {
            Text("F227 -> F228")
        }
        Button(onClick = onF229Key) {
            Text("F227 -> F229")
        }
        Button(onClick = onF230Key) {
            Text("F227 -> F230")
        }
    }
}
