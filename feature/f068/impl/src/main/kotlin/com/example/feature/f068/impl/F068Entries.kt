package com.example.feature.f068.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f068.contract.F068Key
import com.example.feature.f069.contract.F069Key
import com.example.feature.f070.contract.F070Key
import com.example.feature.f071.contract.F071Key

fun EntryProviderScope<NavKey>.f068Entries(backStack: NavBackStack<NavKey>) {
    entry<F068Key> {
        F068Screen(
            onF069Key = {
                backStack.add(F069Key)
            },
            onF070Key = {
                backStack.add(F070Key)
            },
            onF071Key = {
                backStack.add(F071Key)
            },
        )
    }
}

@Composable
internal fun F068Screen(
    onF069Key: () -> Unit,
    onF070Key: () -> Unit,
    onF071Key: () -> Unit,
) {
    Column {
        Text("F068")
        Button(onClick = onF069Key) {
            Text("F068 -> F069")
        }
        Button(onClick = onF070Key) {
            Text("F068 -> F070")
        }
        Button(onClick = onF071Key) {
            Text("F068 -> F071")
        }
    }
}
