package com.example.feature.f173.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f173.contract.F173Key
import com.example.feature.f174.contract.F174Key
import com.example.feature.f175.contract.F175Key
import com.example.feature.f176.contract.F176Key

fun EntryProviderScope<NavKey>.f173Entries(backStack: NavBackStack<NavKey>) {
    entry<F173Key> {
        F173Screen(
            onF174Key = {
                backStack.add(F174Key)
            },
            onF175Key = {
                backStack.add(F175Key)
            },
            onF176Key = {
                backStack.add(F176Key)
            },
        )
    }
}

@Composable
internal fun F173Screen(
    onF174Key: () -> Unit,
    onF175Key: () -> Unit,
    onF176Key: () -> Unit,
) {
    Column {
        Text("F173")
        Button(onClick = onF174Key) {
            Text("F173 -> F174")
        }
        Button(onClick = onF175Key) {
            Text("F173 -> F175")
        }
        Button(onClick = onF176Key) {
            Text("F173 -> F176")
        }
    }
}
