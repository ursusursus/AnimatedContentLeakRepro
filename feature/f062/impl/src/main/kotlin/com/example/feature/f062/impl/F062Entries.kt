package com.example.feature.f062.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f062.contract.F062Key
import com.example.feature.f063.contract.F063Key
import com.example.feature.f064.contract.F064Key
import com.example.feature.f065.contract.F065Key

fun EntryProviderScope<NavKey>.f062Entries(backStack: NavBackStack<NavKey>) {
    entry<F062Key> {
        F062Screen(
            onF063Key = {
                backStack.add(F063Key)
            },
            onF064Key = {
                backStack.add(F064Key)
            },
            onF065Key = {
                backStack.add(F065Key)
            },
        )
    }
}

@Composable
internal fun F062Screen(
    onF063Key: () -> Unit,
    onF064Key: () -> Unit,
    onF065Key: () -> Unit,
) {
    Column {
        Text("F062")
        Button(onClick = onF063Key) {
            Text("F062 -> F063")
        }
        Button(onClick = onF064Key) {
            Text("F062 -> F064")
        }
        Button(onClick = onF065Key) {
            Text("F062 -> F065")
        }
    }
}
