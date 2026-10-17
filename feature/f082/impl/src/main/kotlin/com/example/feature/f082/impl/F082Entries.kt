package com.example.feature.f082.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f082.contract.F082Key
import com.example.feature.f083.contract.F083Key
import com.example.feature.f084.contract.F084Key
import com.example.feature.f085.contract.F085Key

fun EntryProviderScope<NavKey>.f082Entries(backStack: NavBackStack<NavKey>) {
    entry<F082Key> {
        F082Screen(
            onF083Key = {
                backStack.add(F083Key)
            },
            onF084Key = {
                backStack.add(F084Key)
            },
            onF085Key = {
                backStack.add(F085Key)
            },
        )
    }
}

@Composable
internal fun F082Screen(
    onF083Key: () -> Unit,
    onF084Key: () -> Unit,
    onF085Key: () -> Unit,
) {
    Column {
        Text("F082")
        Button(onClick = onF083Key) {
            Text("F082 -> F083")
        }
        Button(onClick = onF084Key) {
            Text("F082 -> F084")
        }
        Button(onClick = onF085Key) {
            Text("F082 -> F085")
        }
    }
}
