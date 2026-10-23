package com.example.feature.f223.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f223.contract.F223Key
import com.example.feature.f224.contract.F224Key
import com.example.feature.f225.contract.F225Key
import com.example.feature.f226.contract.F226Key

fun EntryProviderScope<NavKey>.f223Entries(backStack: NavBackStack<NavKey>) {
    entry<F223Key> {
        F223Screen(
            onF224Key = {
                backStack.add(F224Key)
            },
            onF225Key = {
                backStack.add(F225Key)
            },
            onF226Key = {
                backStack.add(F226Key)
            },
        )
    }
}

@Composable
internal fun F223Screen(
    onF224Key: () -> Unit,
    onF225Key: () -> Unit,
    onF226Key: () -> Unit,
) {
    Column {
        Text("F223")
        Button(onClick = onF224Key) {
            Text("F223 -> F224")
        }
        Button(onClick = onF225Key) {
            Text("F223 -> F225")
        }
        Button(onClick = onF226Key) {
            Text("F223 -> F226")
        }
    }
}
