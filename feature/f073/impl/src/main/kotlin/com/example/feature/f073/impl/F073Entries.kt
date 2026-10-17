package com.example.feature.f073.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f073.contract.F073Key
import com.example.feature.f074.contract.F074Key
import com.example.feature.f075.contract.F075Key
import com.example.feature.f076.contract.F076Key

fun EntryProviderScope<NavKey>.f073Entries(backStack: NavBackStack<NavKey>) {
    entry<F073Key> {
        F073Screen(
            onF074Key = {
                backStack.add(F074Key)
            },
            onF075Key = {
                backStack.add(F075Key)
            },
            onF076Key = {
                backStack.add(F076Key)
            },
        )
    }
}

@Composable
internal fun F073Screen(
    onF074Key: () -> Unit,
    onF075Key: () -> Unit,
    onF076Key: () -> Unit,
) {
    Column {
        Text("F073")
        Button(onClick = onF074Key) {
            Text("F073 -> F074")
        }
        Button(onClick = onF075Key) {
            Text("F073 -> F075")
        }
        Button(onClick = onF076Key) {
            Text("F073 -> F076")
        }
    }
}
