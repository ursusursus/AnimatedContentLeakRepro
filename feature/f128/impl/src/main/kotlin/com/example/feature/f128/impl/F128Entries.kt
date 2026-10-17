package com.example.feature.f128.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f128.contract.F128Key
import com.example.feature.f129.contract.F129Key
import com.example.feature.f130.contract.F130Key
import com.example.feature.f131.contract.F131Key

fun EntryProviderScope<NavKey>.f128Entries(backStack: NavBackStack<NavKey>) {
    entry<F128Key> {
        F128Screen(
            onF129Key = {
                backStack.add(F129Key)
            },
            onF130Key = {
                backStack.add(F130Key)
            },
            onF131Key = {
                backStack.add(F131Key)
            },
        )
    }
}

@Composable
internal fun F128Screen(
    onF129Key: () -> Unit,
    onF130Key: () -> Unit,
    onF131Key: () -> Unit,
) {
    Column {
        Text("F128")
        Button(onClick = onF129Key) {
            Text("F128 -> F129")
        }
        Button(onClick = onF130Key) {
            Text("F128 -> F130")
        }
        Button(onClick = onF131Key) {
            Text("F128 -> F131")
        }
    }
}
