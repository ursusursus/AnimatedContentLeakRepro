package com.example.feature.f163.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f163.contract.F163Key
import com.example.feature.f164.contract.F164Key
import com.example.feature.f165.contract.F165Key
import com.example.feature.f166.contract.F166Key

fun EntryProviderScope<NavKey>.f163Entries(backStack: NavBackStack<NavKey>) {
    entry<F163Key> {
        F163Screen(
            onF164Key = {
                backStack.add(F164Key)
            },
            onF165Key = {
                backStack.add(F165Key)
            },
            onF166Key = {
                backStack.add(F166Key)
            },
        )
    }
}

@Composable
internal fun F163Screen(
    onF164Key: () -> Unit,
    onF165Key: () -> Unit,
    onF166Key: () -> Unit,
) {
    Column {
        Text("F163")
        Button(onClick = onF164Key) {
            Text("F163 -> F164")
        }
        Button(onClick = onF165Key) {
            Text("F163 -> F165")
        }
        Button(onClick = onF166Key) {
            Text("F163 -> F166")
        }
    }
}
