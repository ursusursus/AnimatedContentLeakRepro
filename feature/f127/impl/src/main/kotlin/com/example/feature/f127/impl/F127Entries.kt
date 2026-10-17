package com.example.feature.f127.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f127.contract.F127Key
import com.example.feature.f128.contract.F128Key
import com.example.feature.f129.contract.F129Key
import com.example.feature.f130.contract.F130Key

fun EntryProviderScope<NavKey>.f127Entries(backStack: NavBackStack<NavKey>) {
    entry<F127Key> {
        F127Screen(
            onF128Key = {
                backStack.add(F128Key)
            },
            onF129Key = {
                backStack.add(F129Key)
            },
            onF130Key = {
                backStack.add(F130Key)
            },
        )
    }
}

@Composable
internal fun F127Screen(
    onF128Key: () -> Unit,
    onF129Key: () -> Unit,
    onF130Key: () -> Unit,
) {
    Column {
        Text("F127")
        Button(onClick = onF128Key) {
            Text("F127 -> F128")
        }
        Button(onClick = onF129Key) {
            Text("F127 -> F129")
        }
        Button(onClick = onF130Key) {
            Text("F127 -> F130")
        }
    }
}
