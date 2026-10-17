package com.example.feature.f184.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f184.contract.F184Key
import com.example.feature.f185.contract.F185Key
import com.example.feature.f186.contract.F186Key
import com.example.feature.f187.contract.F187Key

fun EntryProviderScope<NavKey>.f184Entries(backStack: NavBackStack<NavKey>) {
    entry<F184Key> {
        F184Screen(
            onF185Key = {
                backStack.add(F185Key)
            },
            onF186Key = {
                backStack.add(F186Key)
            },
            onF187Key = {
                backStack.add(F187Key)
            },
        )
    }
}

@Composable
internal fun F184Screen(
    onF185Key: () -> Unit,
    onF186Key: () -> Unit,
    onF187Key: () -> Unit,
) {
    Column {
        Text("F184")
        Button(onClick = onF185Key) {
            Text("F184 -> F185")
        }
        Button(onClick = onF186Key) {
            Text("F184 -> F186")
        }
        Button(onClick = onF187Key) {
            Text("F184 -> F187")
        }
    }
}
