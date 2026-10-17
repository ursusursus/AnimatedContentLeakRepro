package com.example.feature.f061.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f061.contract.F061Key
import com.example.feature.f062.contract.F062Key
import com.example.feature.f063.contract.F063Key
import com.example.feature.f064.contract.F064Key

fun EntryProviderScope<NavKey>.f061Entries(backStack: NavBackStack<NavKey>) {
    entry<F061Key> {
        F061Screen(
            onF062Key = {
                backStack.add(F062Key)
            },
            onF063Key = {
                backStack.add(F063Key)
            },
            onF064Key = {
                backStack.add(F064Key)
            },
        )
    }
}

@Composable
internal fun F061Screen(
    onF062Key: () -> Unit,
    onF063Key: () -> Unit,
    onF064Key: () -> Unit,
) {
    Column {
        Text("F061")
        Button(onClick = onF062Key) {
            Text("F061 -> F062")
        }
        Button(onClick = onF063Key) {
            Text("F061 -> F063")
        }
        Button(onClick = onF064Key) {
            Text("F061 -> F064")
        }
    }
}
