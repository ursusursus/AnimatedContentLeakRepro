package com.example.feature.f254.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f254.contract.F254Key
import com.example.feature.f255.contract.F255Key
import com.example.feature.f256.contract.F256Key
import com.example.feature.f257.contract.F257Key

fun EntryProviderScope<NavKey>.f254Entries(backStack: NavBackStack<NavKey>) {
    entry<F254Key> {
        F254Screen(
            onF255Key = {
                backStack.add(F255Key)
            },
            onF256Key = {
                backStack.add(F256Key)
            },
            onF257Key = {
                backStack.add(F257Key)
            },
        )
    }
}

@Composable
internal fun F254Screen(
    onF255Key: () -> Unit,
    onF256Key: () -> Unit,
    onF257Key: () -> Unit,
) {
    Column {
        Text("F254")
        Button(onClick = onF255Key) {
            Text("F254 -> F255")
        }
        Button(onClick = onF256Key) {
            Text("F254 -> F256")
        }
        Button(onClick = onF257Key) {
            Text("F254 -> F257")
        }
    }
}
