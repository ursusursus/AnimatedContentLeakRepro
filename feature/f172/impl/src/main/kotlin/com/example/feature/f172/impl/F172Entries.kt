package com.example.feature.f172.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f172.contract.F172Key
import com.example.feature.f173.contract.F173Key
import com.example.feature.f174.contract.F174Key
import com.example.feature.f175.contract.F175Key

fun EntryProviderScope<NavKey>.f172Entries(backStack: NavBackStack<NavKey>) {
    entry<F172Key> {
        F172Screen(
            onF173Key = {
                backStack.add(F173Key)
            },
            onF174Key = {
                backStack.add(F174Key)
            },
            onF175Key = {
                backStack.add(F175Key)
            },
        )
    }
}

@Composable
internal fun F172Screen(
    onF173Key: () -> Unit,
    onF174Key: () -> Unit,
    onF175Key: () -> Unit,
) {
    Column {
        Text("F172")
        Button(onClick = onF173Key) {
            Text("F172 -> F173")
        }
        Button(onClick = onF174Key) {
            Text("F172 -> F174")
        }
        Button(onClick = onF175Key) {
            Text("F172 -> F175")
        }
    }
}
