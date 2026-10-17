package com.example.feature.f182.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f182.contract.F182Key
import com.example.feature.f183.contract.F183Key
import com.example.feature.f184.contract.F184Key
import com.example.feature.f185.contract.F185Key

fun EntryProviderScope<NavKey>.f182Entries(backStack: NavBackStack<NavKey>) {
    entry<F182Key> {
        F182Screen(
            onF183Key = {
                backStack.add(F183Key)
            },
            onF184Key = {
                backStack.add(F184Key)
            },
            onF185Key = {
                backStack.add(F185Key)
            },
        )
    }
}

@Composable
internal fun F182Screen(
    onF183Key: () -> Unit,
    onF184Key: () -> Unit,
    onF185Key: () -> Unit,
) {
    Column {
        Text("F182")
        Button(onClick = onF183Key) {
            Text("F182 -> F183")
        }
        Button(onClick = onF184Key) {
            Text("F182 -> F184")
        }
        Button(onClick = onF185Key) {
            Text("F182 -> F185")
        }
    }
}
