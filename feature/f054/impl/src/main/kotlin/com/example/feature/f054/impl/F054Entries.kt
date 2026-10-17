package com.example.feature.f054.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f054.contract.F054Key
import com.example.feature.f055.contract.F055Key
import com.example.feature.f056.contract.F056Key
import com.example.feature.f057.contract.F057Key

fun EntryProviderScope<NavKey>.f054Entries(backStack: NavBackStack<NavKey>) {
    entry<F054Key> {
        F054Screen(
            onF055Key = {
                backStack.add(F055Key)
            },
            onF056Key = {
                backStack.add(F056Key)
            },
            onF057Key = {
                backStack.add(F057Key)
            },
        )
    }
}

@Composable
internal fun F054Screen(
    onF055Key: () -> Unit,
    onF056Key: () -> Unit,
    onF057Key: () -> Unit,
) {
    Column {
        Text("F054")
        Button(onClick = onF055Key) {
            Text("F054 -> F055")
        }
        Button(onClick = onF056Key) {
            Text("F054 -> F056")
        }
        Button(onClick = onF057Key) {
            Text("F054 -> F057")
        }
    }
}
