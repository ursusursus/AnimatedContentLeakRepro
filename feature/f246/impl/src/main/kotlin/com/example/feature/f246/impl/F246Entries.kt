package com.example.feature.f246.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f246.contract.F246Key
import com.example.feature.f247.contract.F247Key
import com.example.feature.f248.contract.F248Key
import com.example.feature.f249.contract.F249Key

fun EntryProviderScope<NavKey>.f246Entries(backStack: NavBackStack<NavKey>) {
    entry<F246Key> {
        F246Screen(
            onF247Key = {
                backStack.add(F247Key)
            },
            onF248Key = {
                backStack.add(F248Key)
            },
            onF249Key = {
                backStack.add(F249Key)
            },
        )
    }
}

@Composable
internal fun F246Screen(
    onF247Key: () -> Unit,
    onF248Key: () -> Unit,
    onF249Key: () -> Unit,
) {
    Column {
        Text("F246")
        Button(onClick = onF247Key) {
            Text("F246 -> F247")
        }
        Button(onClick = onF248Key) {
            Text("F246 -> F248")
        }
        Button(onClick = onF249Key) {
            Text("F246 -> F249")
        }
    }
}
