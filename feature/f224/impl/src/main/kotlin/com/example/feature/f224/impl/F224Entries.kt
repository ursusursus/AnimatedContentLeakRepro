package com.example.feature.f224.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f224.contract.F224Key
import com.example.feature.f225.contract.F225Key
import com.example.feature.f226.contract.F226Key
import com.example.feature.f227.contract.F227Key

fun EntryProviderScope<NavKey>.f224Entries(backStack: NavBackStack<NavKey>) {
    entry<F224Key> {
        F224Screen(
            onF225Key = {
                backStack.add(F225Key)
            },
            onF226Key = {
                backStack.add(F226Key)
            },
            onF227Key = {
                backStack.add(F227Key)
            },
        )
    }
}

@Composable
internal fun F224Screen(
    onF225Key: () -> Unit,
    onF226Key: () -> Unit,
    onF227Key: () -> Unit,
) {
    Column {
        Text("F224")
        Button(onClick = onF225Key) {
            Text("F224 -> F225")
        }
        Button(onClick = onF226Key) {
            Text("F224 -> F226")
        }
        Button(onClick = onF227Key) {
            Text("F224 -> F227")
        }
    }
}
