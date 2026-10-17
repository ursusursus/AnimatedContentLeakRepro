package com.example.feature.f004.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f004.contract.F004Key
import com.example.feature.f005.contract.F005Key
import com.example.feature.f006.contract.F006Key
import com.example.feature.f007.contract.F007Key

fun EntryProviderScope<NavKey>.f004Entries(backStack: NavBackStack<NavKey>) {
    entry<F004Key> {
        F004Screen(
            onF005Key = {
                backStack.add(F005Key)
            },
            onF006Key = {
                backStack.add(F006Key)
            },
            onF007Key = {
                backStack.add(F007Key)
            },
        )
    }
}

@Composable
internal fun F004Screen(
    onF005Key: () -> Unit,
    onF006Key: () -> Unit,
    onF007Key: () -> Unit,
) {
    Column {
        Text("F004")
        Button(onClick = onF005Key) {
            Text("F004 -> F005")
        }
        Button(onClick = onF006Key) {
            Text("F004 -> F006")
        }
        Button(onClick = onF007Key) {
            Text("F004 -> F007")
        }
    }
}
