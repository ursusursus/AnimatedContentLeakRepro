package com.example.feature.f226.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f226.contract.F226Key
import com.example.feature.f227.contract.F227Key
import com.example.feature.f228.contract.F228Key
import com.example.feature.f229.contract.F229Key

fun EntryProviderScope<NavKey>.f226Entries(backStack: NavBackStack<NavKey>) {
    entry<F226Key> {
        F226Screen(
            onF227Key = {
                backStack.add(F227Key)
            },
            onF228Key = {
                backStack.add(F228Key)
            },
            onF229Key = {
                backStack.add(F229Key)
            },
        )
    }
}

@Composable
internal fun F226Screen(
    onF227Key: () -> Unit,
    onF228Key: () -> Unit,
    onF229Key: () -> Unit,
) {
    Column {
        Text("F226")
        Button(onClick = onF227Key) {
            Text("F226 -> F227")
        }
        Button(onClick = onF228Key) {
            Text("F226 -> F228")
        }
        Button(onClick = onF229Key) {
            Text("F226 -> F229")
        }
    }
}
