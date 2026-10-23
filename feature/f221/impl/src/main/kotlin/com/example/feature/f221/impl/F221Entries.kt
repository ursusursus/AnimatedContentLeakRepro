package com.example.feature.f221.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f221.contract.F221Key
import com.example.feature.f222.contract.F222Key
import com.example.feature.f223.contract.F223Key
import com.example.feature.f224.contract.F224Key

fun EntryProviderScope<NavKey>.f221Entries(backStack: NavBackStack<NavKey>) {
    entry<F221Key> {
        F221Screen(
            onF222Key = {
                backStack.add(F222Key)
            },
            onF223Key = {
                backStack.add(F223Key)
            },
            onF224Key = {
                backStack.add(F224Key)
            },
        )
    }
}

@Composable
internal fun F221Screen(
    onF222Key: () -> Unit,
    onF223Key: () -> Unit,
    onF224Key: () -> Unit,
) {
    Column {
        Text("F221")
        Button(onClick = onF222Key) {
            Text("F221 -> F222")
        }
        Button(onClick = onF223Key) {
            Text("F221 -> F223")
        }
        Button(onClick = onF224Key) {
            Text("F221 -> F224")
        }
    }
}
