package com.example.feature.f018.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f018.contract.F018Key
import com.example.feature.f019.contract.F019Key
import com.example.feature.f020.contract.F020Key
import com.example.feature.f021.contract.F021Key

fun EntryProviderScope<NavKey>.f018Entries(backStack: NavBackStack<NavKey>) {
    entry<F018Key> {
        F018Screen(
            onF019Key = {
                backStack.add(F019Key)
            },
            onF020Key = {
                backStack.add(F020Key)
            },
            onF021Key = {
                backStack.add(F021Key)
            },
        )
    }
}

@Composable
internal fun F018Screen(
    onF019Key: () -> Unit,
    onF020Key: () -> Unit,
    onF021Key: () -> Unit,
) {
    Column {
        Text("F018")
        Button(onClick = onF019Key) {
            Text("F018 -> F019")
        }
        Button(onClick = onF020Key) {
            Text("F018 -> F020")
        }
        Button(onClick = onF021Key) {
            Text("F018 -> F021")
        }
    }
}
