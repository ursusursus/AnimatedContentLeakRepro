package com.example.feature.f126.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f126.contract.F126Key
import com.example.feature.f127.contract.F127Key
import com.example.feature.f128.contract.F128Key
import com.example.feature.f129.contract.F129Key

fun EntryProviderScope<NavKey>.f126Entries(backStack: NavBackStack<NavKey>) {
    entry<F126Key> {
        F126Screen(
            onF127Key = {
                backStack.add(F127Key)
            },
            onF128Key = {
                backStack.add(F128Key)
            },
            onF129Key = {
                backStack.add(F129Key)
            },
        )
    }
}

@Composable
internal fun F126Screen(
    onF127Key: () -> Unit,
    onF128Key: () -> Unit,
    onF129Key: () -> Unit,
) {
    Column {
        Text("F126")
        Button(onClick = onF127Key) {
            Text("F126 -> F127")
        }
        Button(onClick = onF128Key) {
            Text("F126 -> F128")
        }
        Button(onClick = onF129Key) {
            Text("F126 -> F129")
        }
    }
}
