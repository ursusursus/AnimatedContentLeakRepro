package com.example.feature.f151.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f151.contract.F151Key
import com.example.feature.f152.contract.F152Key
import com.example.feature.f153.contract.F153Key
import com.example.feature.f154.contract.F154Key

fun EntryProviderScope<NavKey>.f151Entries(backStack: NavBackStack<NavKey>) {
    entry<F151Key> {
        F151Screen(
            onF152Key = {
                backStack.add(F152Key)
            },
            onF153Key = {
                backStack.add(F153Key)
            },
            onF154Key = {
                backStack.add(F154Key)
            },
        )
    }
}

@Composable
internal fun F151Screen(
    onF152Key: () -> Unit,
    onF153Key: () -> Unit,
    onF154Key: () -> Unit,
) {
    Column {
        Text("F151")
        Button(onClick = onF152Key) {
            Text("F151 -> F152")
        }
        Button(onClick = onF153Key) {
            Text("F151 -> F153")
        }
        Button(onClick = onF154Key) {
            Text("F151 -> F154")
        }
    }
}
