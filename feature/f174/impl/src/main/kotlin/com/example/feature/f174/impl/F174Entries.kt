package com.example.feature.f174.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f174.contract.F174Key
import com.example.feature.f175.contract.F175Key
import com.example.feature.f176.contract.F176Key
import com.example.feature.f177.contract.F177Key

fun EntryProviderScope<NavKey>.f174Entries(backStack: NavBackStack<NavKey>) {
    entry<F174Key> {
        F174Screen(
            onF175Key = {
                backStack.add(F175Key)
            },
            onF176Key = {
                backStack.add(F176Key)
            },
            onF177Key = {
                backStack.add(F177Key)
            },
        )
    }
}

@Composable
internal fun F174Screen(
    onF175Key: () -> Unit,
    onF176Key: () -> Unit,
    onF177Key: () -> Unit,
) {
    Column {
        Text("F174")
        Button(onClick = onF175Key) {
            Text("F174 -> F175")
        }
        Button(onClick = onF176Key) {
            Text("F174 -> F176")
        }
        Button(onClick = onF177Key) {
            Text("F174 -> F177")
        }
    }
}
