package com.example.feature.f020.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f020.contract.F020Key
import com.example.feature.f021.contract.F021Key
import com.example.feature.f022.contract.F022Key
import com.example.feature.f023.contract.F023Key

fun EntryProviderScope<NavKey>.f020Entries(backStack: NavBackStack<NavKey>) {
    entry<F020Key> {
        F020Screen(
            onF021Key = {
                backStack.add(F021Key)
            },
            onF022Key = {
                backStack.add(F022Key)
            },
            onF023Key = {
                backStack.add(F023Key)
            },
        )
    }
}

@Composable
internal fun F020Screen(
    onF021Key: () -> Unit,
    onF022Key: () -> Unit,
    onF023Key: () -> Unit,
) {
    Column {
        Text("F020")
        Button(onClick = onF021Key) {
            Text("F020 -> F021")
        }
        Button(onClick = onF022Key) {
            Text("F020 -> F022")
        }
        Button(onClick = onF023Key) {
            Text("F020 -> F023")
        }
    }
}
