package com.example.feature.f092.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f092.contract.F092Key
import com.example.feature.f093.contract.F093Key
import com.example.feature.f094.contract.F094Key
import com.example.feature.f095.contract.F095Key

fun EntryProviderScope<NavKey>.f092Entries(backStack: NavBackStack<NavKey>) {
    entry<F092Key> {
        F092Screen(
            onF093Key = {
                backStack.add(F093Key)
            },
            onF094Key = {
                backStack.add(F094Key)
            },
            onF095Key = {
                backStack.add(F095Key)
            },
        )
    }
}

@Composable
internal fun F092Screen(
    onF093Key: () -> Unit,
    onF094Key: () -> Unit,
    onF095Key: () -> Unit,
) {
    Column {
        Text("F092")
        Button(onClick = onF093Key) {
            Text("F092 -> F093")
        }
        Button(onClick = onF094Key) {
            Text("F092 -> F094")
        }
        Button(onClick = onF095Key) {
            Text("F092 -> F095")
        }
    }
}
