package com.example.feature.f152.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f152.contract.F152Key
import com.example.feature.f153.contract.F153Key
import com.example.feature.f154.contract.F154Key
import com.example.feature.f155.contract.F155Key

fun EntryProviderScope<NavKey>.f152Entries(backStack: NavBackStack<NavKey>) {
    entry<F152Key> {
        F152Screen(
            onF153Key = {
                backStack.add(F153Key)
            },
            onF154Key = {
                backStack.add(F154Key)
            },
            onF155Key = {
                backStack.add(F155Key)
            },
        )
    }
}

@Composable
internal fun F152Screen(
    onF153Key: () -> Unit,
    onF154Key: () -> Unit,
    onF155Key: () -> Unit,
) {
    Column {
        Text("F152")
        Button(onClick = onF153Key) {
            Text("F152 -> F153")
        }
        Button(onClick = onF154Key) {
            Text("F152 -> F154")
        }
        Button(onClick = onF155Key) {
            Text("F152 -> F155")
        }
    }
}
