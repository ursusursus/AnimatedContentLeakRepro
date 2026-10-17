package com.example.feature.f179.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f179.contract.F179Key
import com.example.feature.f180.contract.F180Key
import com.example.feature.f181.contract.F181Key
import com.example.feature.f182.contract.F182Key

fun EntryProviderScope<NavKey>.f179Entries(backStack: NavBackStack<NavKey>) {
    entry<F179Key> {
        F179Screen(
            onF180Key = {
                backStack.add(F180Key)
            },
            onF181Key = {
                backStack.add(F181Key)
            },
            onF182Key = {
                backStack.add(F182Key)
            },
        )
    }
}

@Composable
internal fun F179Screen(
    onF180Key: () -> Unit,
    onF181Key: () -> Unit,
    onF182Key: () -> Unit,
) {
    Column {
        Text("F179")
        Button(onClick = onF180Key) {
            Text("F179 -> F180")
        }
        Button(onClick = onF181Key) {
            Text("F179 -> F181")
        }
        Button(onClick = onF182Key) {
            Text("F179 -> F182")
        }
    }
}
