package com.example.feature.f255.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f255.contract.F255Key
import com.example.feature.f256.contract.F256Key
import com.example.feature.f257.contract.F257Key
import com.example.feature.f258.contract.F258Key

fun EntryProviderScope<NavKey>.f255Entries(backStack: NavBackStack<NavKey>) {
    entry<F255Key> {
        F255Screen(
            onF256Key = {
                backStack.add(F256Key)
            },
            onF257Key = {
                backStack.add(F257Key)
            },
            onF258Key = {
                backStack.add(F258Key)
            },
        )
    }
}

@Composable
internal fun F255Screen(
    onF256Key: () -> Unit,
    onF257Key: () -> Unit,
    onF258Key: () -> Unit,
) {
    Column {
        Text("F255")
        Button(onClick = onF256Key) {
            Text("F255 -> F256")
        }
        Button(onClick = onF257Key) {
            Text("F255 -> F257")
        }
        Button(onClick = onF258Key) {
            Text("F255 -> F258")
        }
    }
}
