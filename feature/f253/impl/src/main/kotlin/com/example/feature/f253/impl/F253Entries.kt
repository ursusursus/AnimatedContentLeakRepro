package com.example.feature.f253.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f253.contract.F253Key
import com.example.feature.f254.contract.F254Key
import com.example.feature.f255.contract.F255Key
import com.example.feature.f256.contract.F256Key

fun EntryProviderScope<NavKey>.f253Entries(backStack: NavBackStack<NavKey>) {
    entry<F253Key> {
        F253Screen(
            onF254Key = {
                backStack.add(F254Key)
            },
            onF255Key = {
                backStack.add(F255Key)
            },
            onF256Key = {
                backStack.add(F256Key)
            },
        )
    }
}

@Composable
internal fun F253Screen(
    onF254Key: () -> Unit,
    onF255Key: () -> Unit,
    onF256Key: () -> Unit,
) {
    Column {
        Text("F253")
        Button(onClick = onF254Key) {
            Text("F253 -> F254")
        }
        Button(onClick = onF255Key) {
            Text("F253 -> F255")
        }
        Button(onClick = onF256Key) {
            Text("F253 -> F256")
        }
    }
}
