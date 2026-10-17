package com.example.feature.f077.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f077.contract.F077Key
import com.example.feature.f078.contract.F078Key
import com.example.feature.f079.contract.F079Key
import com.example.feature.f080.contract.F080Key

fun EntryProviderScope<NavKey>.f077Entries(backStack: NavBackStack<NavKey>) {
    entry<F077Key> {
        F077Screen(
            onF078Key = {
                backStack.add(F078Key)
            },
            onF079Key = {
                backStack.add(F079Key)
            },
            onF080Key = {
                backStack.add(F080Key)
            },
        )
    }
}

@Composable
internal fun F077Screen(
    onF078Key: () -> Unit,
    onF079Key: () -> Unit,
    onF080Key: () -> Unit,
) {
    Column {
        Text("F077")
        Button(onClick = onF078Key) {
            Text("F077 -> F078")
        }
        Button(onClick = onF079Key) {
            Text("F077 -> F079")
        }
        Button(onClick = onF080Key) {
            Text("F077 -> F080")
        }
    }
}
