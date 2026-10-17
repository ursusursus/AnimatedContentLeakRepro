package com.example.feature.f183.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f183.contract.F183Key
import com.example.feature.f184.contract.F184Key
import com.example.feature.f185.contract.F185Key
import com.example.feature.f186.contract.F186Key

fun EntryProviderScope<NavKey>.f183Entries(backStack: NavBackStack<NavKey>) {
    entry<F183Key> {
        F183Screen(
            onF184Key = {
                backStack.add(F184Key)
            },
            onF185Key = {
                backStack.add(F185Key)
            },
            onF186Key = {
                backStack.add(F186Key)
            },
        )
    }
}

@Composable
internal fun F183Screen(
    onF184Key: () -> Unit,
    onF185Key: () -> Unit,
    onF186Key: () -> Unit,
) {
    Column {
        Text("F183")
        Button(onClick = onF184Key) {
            Text("F183 -> F184")
        }
        Button(onClick = onF185Key) {
            Text("F183 -> F185")
        }
        Button(onClick = onF186Key) {
            Text("F183 -> F186")
        }
    }
}
