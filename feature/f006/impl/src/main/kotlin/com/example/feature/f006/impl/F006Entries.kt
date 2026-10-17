package com.example.feature.f006.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f006.contract.F006Key
import com.example.feature.f007.contract.F007Key
import com.example.feature.f008.contract.F008Key
import com.example.feature.f009.contract.F009Key

fun EntryProviderScope<NavKey>.f006Entries(backStack: NavBackStack<NavKey>) {
    entry<F006Key> {
        F006Screen(
            onF007Key = {
                backStack.add(F007Key)
            },
            onF008Key = {
                backStack.add(F008Key)
            },
            onF009Key = {
                backStack.add(F009Key)
            },
        )
    }
}

@Composable
internal fun F006Screen(
    onF007Key: () -> Unit,
    onF008Key: () -> Unit,
    onF009Key: () -> Unit,
) {
    Column {
        Text("F006")
        Button(onClick = onF007Key) {
            Text("F006 -> F007")
        }
        Button(onClick = onF008Key) {
            Text("F006 -> F008")
        }
        Button(onClick = onF009Key) {
            Text("F006 -> F009")
        }
    }
}
