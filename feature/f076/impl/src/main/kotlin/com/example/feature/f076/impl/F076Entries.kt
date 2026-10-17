package com.example.feature.f076.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f076.contract.F076Key
import com.example.feature.f077.contract.F077Key
import com.example.feature.f078.contract.F078Key
import com.example.feature.f079.contract.F079Key

fun EntryProviderScope<NavKey>.f076Entries(backStack: NavBackStack<NavKey>) {
    entry<F076Key> {
        F076Screen(
            onF077Key = {
                backStack.add(F077Key)
            },
            onF078Key = {
                backStack.add(F078Key)
            },
            onF079Key = {
                backStack.add(F079Key)
            },
        )
    }
}

@Composable
internal fun F076Screen(
    onF077Key: () -> Unit,
    onF078Key: () -> Unit,
    onF079Key: () -> Unit,
) {
    Column {
        Text("F076")
        Button(onClick = onF077Key) {
            Text("F076 -> F077")
        }
        Button(onClick = onF078Key) {
            Text("F076 -> F078")
        }
        Button(onClick = onF079Key) {
            Text("F076 -> F079")
        }
    }
}
