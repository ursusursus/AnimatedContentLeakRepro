package com.example.feature.f021.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f021.contract.F021Key
import com.example.feature.f022.contract.F022Key
import com.example.feature.f023.contract.F023Key
import com.example.feature.f024.contract.F024Key

fun EntryProviderScope<NavKey>.f021Entries(backStack: NavBackStack<NavKey>) {
    entry<F021Key> {
        F021Screen(
            onF022Key = {
                backStack.add(F022Key)
            },
            onF023Key = {
                backStack.add(F023Key)
            },
            onF024Key = {
                backStack.add(F024Key)
            },
        )
    }
}

@Composable
internal fun F021Screen(
    onF022Key: () -> Unit,
    onF023Key: () -> Unit,
    onF024Key: () -> Unit,
) {
    Column {
        Text("F021")
        Button(onClick = onF022Key) {
            Text("F021 -> F022")
        }
        Button(onClick = onF023Key) {
            Text("F021 -> F023")
        }
        Button(onClick = onF024Key) {
            Text("F021 -> F024")
        }
    }
}
