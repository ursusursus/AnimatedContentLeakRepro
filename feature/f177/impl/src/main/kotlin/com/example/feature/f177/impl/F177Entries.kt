package com.example.feature.f177.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f177.contract.F177Key
import com.example.feature.f178.contract.F178Key
import com.example.feature.f179.contract.F179Key
import com.example.feature.f180.contract.F180Key

fun EntryProviderScope<NavKey>.f177Entries(backStack: NavBackStack<NavKey>) {
    entry<F177Key> {
        F177Screen(
            onF178Key = {
                backStack.add(F178Key)
            },
            onF179Key = {
                backStack.add(F179Key)
            },
            onF180Key = {
                backStack.add(F180Key)
            },
        )
    }
}

@Composable
internal fun F177Screen(
    onF178Key: () -> Unit,
    onF179Key: () -> Unit,
    onF180Key: () -> Unit,
) {
    Column {
        Text("F177")
        Button(onClick = onF178Key) {
            Text("F177 -> F178")
        }
        Button(onClick = onF179Key) {
            Text("F177 -> F179")
        }
        Button(onClick = onF180Key) {
            Text("F177 -> F180")
        }
    }
}
