package com.example.feature.f165.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f165.contract.F165Key
import com.example.feature.f166.contract.F166Key
import com.example.feature.f167.contract.F167Key
import com.example.feature.f168.contract.F168Key

fun EntryProviderScope<NavKey>.f165Entries(backStack: NavBackStack<NavKey>) {
    entry<F165Key> {
        F165Screen(
            onF166Key = {
                backStack.add(F166Key)
            },
            onF167Key = {
                backStack.add(F167Key)
            },
            onF168Key = {
                backStack.add(F168Key)
            },
        )
    }
}

@Composable
internal fun F165Screen(
    onF166Key: () -> Unit,
    onF167Key: () -> Unit,
    onF168Key: () -> Unit,
) {
    Column {
        Text("F165")
        Button(onClick = onF166Key) {
            Text("F165 -> F166")
        }
        Button(onClick = onF167Key) {
            Text("F165 -> F167")
        }
        Button(onClick = onF168Key) {
            Text("F165 -> F168")
        }
    }
}
