package com.example.feature.f079.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f079.contract.F079Key
import com.example.feature.f080.contract.F080Key
import com.example.feature.f081.contract.F081Key
import com.example.feature.f082.contract.F082Key

fun EntryProviderScope<NavKey>.f079Entries(backStack: NavBackStack<NavKey>) {
    entry<F079Key> {
        F079Screen(
            onF080Key = {
                backStack.add(F080Key)
            },
            onF081Key = {
                backStack.add(F081Key)
            },
            onF082Key = {
                backStack.add(F082Key)
            },
        )
    }
}

@Composable
internal fun F079Screen(
    onF080Key: () -> Unit,
    onF081Key: () -> Unit,
    onF082Key: () -> Unit,
) {
    Column {
        Text("F079")
        Button(onClick = onF080Key) {
            Text("F079 -> F080")
        }
        Button(onClick = onF081Key) {
            Text("F079 -> F081")
        }
        Button(onClick = onF082Key) {
            Text("F079 -> F082")
        }
    }
}
