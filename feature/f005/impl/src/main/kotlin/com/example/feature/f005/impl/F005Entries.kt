package com.example.feature.f005.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f005.contract.F005Key
import com.example.feature.f006.contract.F006Key
import com.example.feature.f007.contract.F007Key
import com.example.feature.f008.contract.F008Key

fun EntryProviderScope<NavKey>.f005Entries(backStack: NavBackStack<NavKey>) {
    entry<F005Key> {
        F005Screen(
            onF006Key = {
                backStack.add(F006Key)
            },
            onF007Key = {
                backStack.add(F007Key)
            },
            onF008Key = {
                backStack.add(F008Key)
            },
        )
    }
}

@Composable
internal fun F005Screen(
    onF006Key: () -> Unit,
    onF007Key: () -> Unit,
    onF008Key: () -> Unit,
) {
    Column {
        Text("F005")
        Button(onClick = onF006Key) {
            Text("F005 -> F006")
        }
        Button(onClick = onF007Key) {
            Text("F005 -> F007")
        }
        Button(onClick = onF008Key) {
            Text("F005 -> F008")
        }
    }
}
