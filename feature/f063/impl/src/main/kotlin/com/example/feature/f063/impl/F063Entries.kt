package com.example.feature.f063.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f063.contract.F063Key
import com.example.feature.f064.contract.F064Key
import com.example.feature.f065.contract.F065Key
import com.example.feature.f066.contract.F066Key

fun EntryProviderScope<NavKey>.f063Entries(backStack: NavBackStack<NavKey>) {
    entry<F063Key> {
        F063Screen(
            onF064Key = {
                backStack.add(F064Key)
            },
            onF065Key = {
                backStack.add(F065Key)
            },
            onF066Key = {
                backStack.add(F066Key)
            },
        )
    }
}

@Composable
internal fun F063Screen(
    onF064Key: () -> Unit,
    onF065Key: () -> Unit,
    onF066Key: () -> Unit,
) {
    Column {
        Text("F063")
        Button(onClick = onF064Key) {
            Text("F063 -> F064")
        }
        Button(onClick = onF065Key) {
            Text("F063 -> F065")
        }
        Button(onClick = onF066Key) {
            Text("F063 -> F066")
        }
    }
}
