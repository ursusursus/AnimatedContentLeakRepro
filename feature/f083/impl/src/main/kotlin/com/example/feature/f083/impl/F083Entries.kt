package com.example.feature.f083.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f083.contract.F083Key
import com.example.feature.f084.contract.F084Key
import com.example.feature.f085.contract.F085Key
import com.example.feature.f086.contract.F086Key

fun EntryProviderScope<NavKey>.f083Entries(backStack: NavBackStack<NavKey>) {
    entry<F083Key> {
        F083Screen(
            onF084Key = {
                backStack.add(F084Key)
            },
            onF085Key = {
                backStack.add(F085Key)
            },
            onF086Key = {
                backStack.add(F086Key)
            },
        )
    }
}

@Composable
internal fun F083Screen(
    onF084Key: () -> Unit,
    onF085Key: () -> Unit,
    onF086Key: () -> Unit,
) {
    Column {
        Text("F083")
        Button(onClick = onF084Key) {
            Text("F083 -> F084")
        }
        Button(onClick = onF085Key) {
            Text("F083 -> F085")
        }
        Button(onClick = onF086Key) {
            Text("F083 -> F086")
        }
    }
}
