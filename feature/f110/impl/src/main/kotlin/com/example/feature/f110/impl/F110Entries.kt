package com.example.feature.f110.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f110.contract.F110Key
import com.example.feature.f111.contract.F111Key
import com.example.feature.f112.contract.F112Key
import com.example.feature.f113.contract.F113Key

fun EntryProviderScope<NavKey>.f110Entries(backStack: NavBackStack<NavKey>) {
    entry<F110Key> {
        F110Screen(
            onF111Key = {
                backStack.add(F111Key)
            },
            onF112Key = {
                backStack.add(F112Key)
            },
            onF113Key = {
                backStack.add(F113Key)
            },
        )
    }
}

@Composable
internal fun F110Screen(
    onF111Key: () -> Unit,
    onF112Key: () -> Unit,
    onF113Key: () -> Unit,
) {
    Column {
        Text("F110")
        Button(onClick = onF111Key) {
            Text("F110 -> F111")
        }
        Button(onClick = onF112Key) {
            Text("F110 -> F112")
        }
        Button(onClick = onF113Key) {
            Text("F110 -> F113")
        }
    }
}
