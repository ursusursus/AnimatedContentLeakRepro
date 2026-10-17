package com.example.feature.f017.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f017.contract.F017Key
import com.example.feature.f018.contract.F018Key
import com.example.feature.f019.contract.F019Key
import com.example.feature.f020.contract.F020Key

fun EntryProviderScope<NavKey>.f017Entries(backStack: NavBackStack<NavKey>) {
    entry<F017Key> {
        F017Screen(
            onF018Key = {
                backStack.add(F018Key)
            },
            onF019Key = {
                backStack.add(F019Key)
            },
            onF020Key = {
                backStack.add(F020Key)
            },
        )
    }
}

@Composable
internal fun F017Screen(
    onF018Key: () -> Unit,
    onF019Key: () -> Unit,
    onF020Key: () -> Unit,
) {
    Column {
        Text("F017")
        Button(onClick = onF018Key) {
            Text("F017 -> F018")
        }
        Button(onClick = onF019Key) {
            Text("F017 -> F019")
        }
        Button(onClick = onF020Key) {
            Text("F017 -> F020")
        }
    }
}
