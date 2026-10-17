package com.example.feature.f019.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f019.contract.F019Key
import com.example.feature.f020.contract.F020Key
import com.example.feature.f021.contract.F021Key
import com.example.feature.f022.contract.F022Key

fun EntryProviderScope<NavKey>.f019Entries(backStack: NavBackStack<NavKey>) {
    entry<F019Key> {
        F019Screen(
            onF020Key = {
                backStack.add(F020Key)
            },
            onF021Key = {
                backStack.add(F021Key)
            },
            onF022Key = {
                backStack.add(F022Key)
            },
        )
    }
}

@Composable
internal fun F019Screen(
    onF020Key: () -> Unit,
    onF021Key: () -> Unit,
    onF022Key: () -> Unit,
) {
    Column {
        Text("F019")
        Button(onClick = onF020Key) {
            Text("F019 -> F020")
        }
        Button(onClick = onF021Key) {
            Text("F019 -> F021")
        }
        Button(onClick = onF022Key) {
            Text("F019 -> F022")
        }
    }
}
