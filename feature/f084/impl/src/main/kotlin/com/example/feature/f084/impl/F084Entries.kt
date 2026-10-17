package com.example.feature.f084.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f084.contract.F084Key
import com.example.feature.f085.contract.F085Key
import com.example.feature.f086.contract.F086Key
import com.example.feature.f087.contract.F087Key

fun EntryProviderScope<NavKey>.f084Entries(backStack: NavBackStack<NavKey>) {
    entry<F084Key> {
        F084Screen(
            onF085Key = {
                backStack.add(F085Key)
            },
            onF086Key = {
                backStack.add(F086Key)
            },
            onF087Key = {
                backStack.add(F087Key)
            },
        )
    }
}

@Composable
internal fun F084Screen(
    onF085Key: () -> Unit,
    onF086Key: () -> Unit,
    onF087Key: () -> Unit,
) {
    Column {
        Text("F084")
        Button(onClick = onF085Key) {
            Text("F084 -> F085")
        }
        Button(onClick = onF086Key) {
            Text("F084 -> F086")
        }
        Button(onClick = onF087Key) {
            Text("F084 -> F087")
        }
    }
}
