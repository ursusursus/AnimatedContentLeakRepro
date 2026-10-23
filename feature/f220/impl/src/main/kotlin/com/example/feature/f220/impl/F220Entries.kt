package com.example.feature.f220.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f220.contract.F220Key
import com.example.feature.f221.contract.F221Key
import com.example.feature.f222.contract.F222Key
import com.example.feature.f223.contract.F223Key

fun EntryProviderScope<NavKey>.f220Entries(backStack: NavBackStack<NavKey>) {
    entry<F220Key> {
        F220Screen(
            onF221Key = {
                backStack.add(F221Key)
            },
            onF222Key = {
                backStack.add(F222Key)
            },
            onF223Key = {
                backStack.add(F223Key)
            },
        )
    }
}

@Composable
internal fun F220Screen(
    onF221Key: () -> Unit,
    onF222Key: () -> Unit,
    onF223Key: () -> Unit,
) {
    Column {
        Text("F220")
        Button(onClick = onF221Key) {
            Text("F220 -> F221")
        }
        Button(onClick = onF222Key) {
            Text("F220 -> F222")
        }
        Button(onClick = onF223Key) {
            Text("F220 -> F223")
        }
    }
}
