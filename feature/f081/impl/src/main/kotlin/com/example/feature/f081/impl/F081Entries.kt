package com.example.feature.f081.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f081.contract.F081Key
import com.example.feature.f082.contract.F082Key
import com.example.feature.f083.contract.F083Key
import com.example.feature.f084.contract.F084Key

fun EntryProviderScope<NavKey>.f081Entries(backStack: NavBackStack<NavKey>) {
    entry<F081Key> {
        F081Screen(
            onF082Key = {
                backStack.add(F082Key)
            },
            onF083Key = {
                backStack.add(F083Key)
            },
            onF084Key = {
                backStack.add(F084Key)
            },
        )
    }
}

@Composable
internal fun F081Screen(
    onF082Key: () -> Unit,
    onF083Key: () -> Unit,
    onF084Key: () -> Unit,
) {
    Column {
        Text("F081")
        Button(onClick = onF082Key) {
            Text("F081 -> F082")
        }
        Button(onClick = onF083Key) {
            Text("F081 -> F083")
        }
        Button(onClick = onF084Key) {
            Text("F081 -> F084")
        }
    }
}
