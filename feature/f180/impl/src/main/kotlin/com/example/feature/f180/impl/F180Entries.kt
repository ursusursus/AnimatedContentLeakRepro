package com.example.feature.f180.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f180.contract.F180Key
import com.example.feature.f181.contract.F181Key
import com.example.feature.f182.contract.F182Key
import com.example.feature.f183.contract.F183Key

fun EntryProviderScope<NavKey>.f180Entries(backStack: NavBackStack<NavKey>) {
    entry<F180Key> {
        F180Screen(
            onF181Key = {
                backStack.add(F181Key)
            },
            onF182Key = {
                backStack.add(F182Key)
            },
            onF183Key = {
                backStack.add(F183Key)
            },
        )
    }
}

@Composable
internal fun F180Screen(
    onF181Key: () -> Unit,
    onF182Key: () -> Unit,
    onF183Key: () -> Unit,
) {
    Column {
        Text("F180")
        Button(onClick = onF181Key) {
            Text("F180 -> F181")
        }
        Button(onClick = onF182Key) {
            Text("F180 -> F182")
        }
        Button(onClick = onF183Key) {
            Text("F180 -> F183")
        }
    }
}
