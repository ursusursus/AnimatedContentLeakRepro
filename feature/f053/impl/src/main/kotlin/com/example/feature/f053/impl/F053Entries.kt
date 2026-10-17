package com.example.feature.f053.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f053.contract.F053Key
import com.example.feature.f054.contract.F054Key
import com.example.feature.f055.contract.F055Key
import com.example.feature.f056.contract.F056Key

fun EntryProviderScope<NavKey>.f053Entries(backStack: NavBackStack<NavKey>) {
    entry<F053Key> {
        F053Screen(
            onF054Key = {
                backStack.add(F054Key)
            },
            onF055Key = {
                backStack.add(F055Key)
            },
            onF056Key = {
                backStack.add(F056Key)
            },
        )
    }
}

@Composable
internal fun F053Screen(
    onF054Key: () -> Unit,
    onF055Key: () -> Unit,
    onF056Key: () -> Unit,
) {
    Column {
        Text("F053")
        Button(onClick = onF054Key) {
            Text("F053 -> F054")
        }
        Button(onClick = onF055Key) {
            Text("F053 -> F055")
        }
        Button(onClick = onF056Key) {
            Text("F053 -> F056")
        }
    }
}
