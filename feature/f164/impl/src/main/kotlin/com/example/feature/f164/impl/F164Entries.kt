package com.example.feature.f164.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f164.contract.F164Key
import com.example.feature.f165.contract.F165Key
import com.example.feature.f166.contract.F166Key
import com.example.feature.f167.contract.F167Key

fun EntryProviderScope<NavKey>.f164Entries(backStack: NavBackStack<NavKey>) {
    entry<F164Key> {
        F164Screen(
            onF165Key = {
                backStack.add(F165Key)
            },
            onF166Key = {
                backStack.add(F166Key)
            },
            onF167Key = {
                backStack.add(F167Key)
            },
        )
    }
}

@Composable
internal fun F164Screen(
    onF165Key: () -> Unit,
    onF166Key: () -> Unit,
    onF167Key: () -> Unit,
) {
    Column {
        Text("F164")
        Button(onClick = onF165Key) {
            Text("F164 -> F165")
        }
        Button(onClick = onF166Key) {
            Text("F164 -> F166")
        }
        Button(onClick = onF167Key) {
            Text("F164 -> F167")
        }
    }
}
