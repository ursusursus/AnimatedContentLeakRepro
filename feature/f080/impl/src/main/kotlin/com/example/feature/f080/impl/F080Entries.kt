package com.example.feature.f080.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f080.contract.F080Key
import com.example.feature.f081.contract.F081Key
import com.example.feature.f082.contract.F082Key
import com.example.feature.f083.contract.F083Key

fun EntryProviderScope<NavKey>.f080Entries(backStack: NavBackStack<NavKey>) {
    entry<F080Key> {
        F080Screen(
            onF081Key = {
                backStack.add(F081Key)
            },
            onF082Key = {
                backStack.add(F082Key)
            },
            onF083Key = {
                backStack.add(F083Key)
            },
        )
    }
}

@Composable
internal fun F080Screen(
    onF081Key: () -> Unit,
    onF082Key: () -> Unit,
    onF083Key: () -> Unit,
) {
    Column {
        Text("F080")
        Button(onClick = onF081Key) {
            Text("F080 -> F081")
        }
        Button(onClick = onF082Key) {
            Text("F080 -> F082")
        }
        Button(onClick = onF083Key) {
            Text("F080 -> F083")
        }
    }
}
