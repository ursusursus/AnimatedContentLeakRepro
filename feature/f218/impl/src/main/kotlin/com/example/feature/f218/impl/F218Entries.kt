package com.example.feature.f218.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f218.contract.F218Key
import com.example.feature.f219.contract.F219Key
import com.example.feature.f220.contract.F220Key
import com.example.feature.f221.contract.F221Key

fun EntryProviderScope<NavKey>.f218Entries(backStack: NavBackStack<NavKey>) {
    entry<F218Key> {
        F218Screen(
            onF219Key = {
                backStack.add(F219Key)
            },
            onF220Key = {
                backStack.add(F220Key)
            },
            onF221Key = {
                backStack.add(F221Key)
            },
        )
    }
}

@Composable
internal fun F218Screen(
    onF219Key: () -> Unit,
    onF220Key: () -> Unit,
    onF221Key: () -> Unit,
) {
    Column {
        Text("F218")
        Button(onClick = onF219Key) {
            Text("F218 -> F219")
        }
        Button(onClick = onF220Key) {
            Text("F218 -> F220")
        }
        Button(onClick = onF221Key) {
            Text("F218 -> F221")
        }
    }
}
