package com.example.feature.f222.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f222.contract.F222Key
import com.example.feature.f223.contract.F223Key
import com.example.feature.f224.contract.F224Key
import com.example.feature.f225.contract.F225Key

fun EntryProviderScope<NavKey>.f222Entries(backStack: NavBackStack<NavKey>) {
    entry<F222Key> {
        F222Screen(
            onF223Key = {
                backStack.add(F223Key)
            },
            onF224Key = {
                backStack.add(F224Key)
            },
            onF225Key = {
                backStack.add(F225Key)
            },
        )
    }
}

@Composable
internal fun F222Screen(
    onF223Key: () -> Unit,
    onF224Key: () -> Unit,
    onF225Key: () -> Unit,
) {
    Column {
        Text("F222")
        Button(onClick = onF223Key) {
            Text("F222 -> F223")
        }
        Button(onClick = onF224Key) {
            Text("F222 -> F224")
        }
        Button(onClick = onF225Key) {
            Text("F222 -> F225")
        }
    }
}
