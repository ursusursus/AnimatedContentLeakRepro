package com.example.feature.f094.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f094.contract.F094Key
import com.example.feature.f095.contract.F095Key
import com.example.feature.f096.contract.F096Key
import com.example.feature.f097.contract.F097Key

fun EntryProviderScope<NavKey>.f094Entries(backStack: NavBackStack<NavKey>) {
    entry<F094Key> {
        F094Screen(
            onF095Key = {
                backStack.add(F095Key)
            },
            onF096Key = {
                backStack.add(F096Key)
            },
            onF097Key = {
                backStack.add(F097Key)
            },
        )
    }
}

@Composable
internal fun F094Screen(
    onF095Key: () -> Unit,
    onF096Key: () -> Unit,
    onF097Key: () -> Unit,
) {
    Column {
        Text("F094")
        Button(onClick = onF095Key) {
            Text("F094 -> F095")
        }
        Button(onClick = onF096Key) {
            Text("F094 -> F096")
        }
        Button(onClick = onF097Key) {
            Text("F094 -> F097")
        }
    }
}
