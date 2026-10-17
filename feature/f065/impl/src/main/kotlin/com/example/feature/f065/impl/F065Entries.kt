package com.example.feature.f065.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f065.contract.F065Key
import com.example.feature.f066.contract.F066Key
import com.example.feature.f067.contract.F067Key
import com.example.feature.f068.contract.F068Key

fun EntryProviderScope<NavKey>.f065Entries(backStack: NavBackStack<NavKey>) {
    entry<F065Key> {
        F065Screen(
            onF066Key = {
                backStack.add(F066Key)
            },
            onF067Key = {
                backStack.add(F067Key)
            },
            onF068Key = {
                backStack.add(F068Key)
            },
        )
    }
}

@Composable
internal fun F065Screen(
    onF066Key: () -> Unit,
    onF067Key: () -> Unit,
    onF068Key: () -> Unit,
) {
    Column {
        Text("F065")
        Button(onClick = onF066Key) {
            Text("F065 -> F066")
        }
        Button(onClick = onF067Key) {
            Text("F065 -> F067")
        }
        Button(onClick = onF068Key) {
            Text("F065 -> F068")
        }
    }
}
