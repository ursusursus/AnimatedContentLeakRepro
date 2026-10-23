package com.example.feature.f225.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f225.contract.F225Key
import com.example.feature.f226.contract.F226Key
import com.example.feature.f227.contract.F227Key
import com.example.feature.f228.contract.F228Key

fun EntryProviderScope<NavKey>.f225Entries(backStack: NavBackStack<NavKey>) {
    entry<F225Key> {
        F225Screen(
            onF226Key = {
                backStack.add(F226Key)
            },
            onF227Key = {
                backStack.add(F227Key)
            },
            onF228Key = {
                backStack.add(F228Key)
            },
        )
    }
}

@Composable
internal fun F225Screen(
    onF226Key: () -> Unit,
    onF227Key: () -> Unit,
    onF228Key: () -> Unit,
) {
    Column {
        Text("F225")
        Button(onClick = onF226Key) {
            Text("F225 -> F226")
        }
        Button(onClick = onF227Key) {
            Text("F225 -> F227")
        }
        Button(onClick = onF228Key) {
            Text("F225 -> F228")
        }
    }
}
