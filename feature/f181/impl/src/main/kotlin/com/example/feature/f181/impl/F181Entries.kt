package com.example.feature.f181.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f181.contract.F181Key
import com.example.feature.f182.contract.F182Key
import com.example.feature.f183.contract.F183Key
import com.example.feature.f184.contract.F184Key

fun EntryProviderScope<NavKey>.f181Entries(backStack: NavBackStack<NavKey>) {
    entry<F181Key> {
        F181Screen(
            onF182Key = {
                backStack.add(F182Key)
            },
            onF183Key = {
                backStack.add(F183Key)
            },
            onF184Key = {
                backStack.add(F184Key)
            },
        )
    }
}

@Composable
internal fun F181Screen(
    onF182Key: () -> Unit,
    onF183Key: () -> Unit,
    onF184Key: () -> Unit,
) {
    Column {
        Text("F181")
        Button(onClick = onF182Key) {
            Text("F181 -> F182")
        }
        Button(onClick = onF183Key) {
            Text("F181 -> F183")
        }
        Button(onClick = onF184Key) {
            Text("F181 -> F184")
        }
    }
}
