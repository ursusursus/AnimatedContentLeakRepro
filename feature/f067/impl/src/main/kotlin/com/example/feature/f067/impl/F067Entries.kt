package com.example.feature.f067.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f067.contract.F067Key
import com.example.feature.f068.contract.F068Key
import com.example.feature.f069.contract.F069Key
import com.example.feature.f070.contract.F070Key

fun EntryProviderScope<NavKey>.f067Entries(backStack: NavBackStack<NavKey>) {
    entry<F067Key> {
        F067Screen(
            onF068Key = {
                backStack.add(F068Key)
            },
            onF069Key = {
                backStack.add(F069Key)
            },
            onF070Key = {
                backStack.add(F070Key)
            },
        )
    }
}

@Composable
internal fun F067Screen(
    onF068Key: () -> Unit,
    onF069Key: () -> Unit,
    onF070Key: () -> Unit,
) {
    Column {
        Text("F067")
        Button(onClick = onF068Key) {
            Text("F067 -> F068")
        }
        Button(onClick = onF069Key) {
            Text("F067 -> F069")
        }
        Button(onClick = onF070Key) {
            Text("F067 -> F070")
        }
    }
}
