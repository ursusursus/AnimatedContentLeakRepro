package com.example.feature.f125.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f125.contract.F125Key
import com.example.feature.f126.contract.F126Key
import com.example.feature.f127.contract.F127Key
import com.example.feature.f128.contract.F128Key

fun EntryProviderScope<NavKey>.f125Entries(backStack: NavBackStack<NavKey>) {
    entry<F125Key> {
        F125Screen(
            onF126Key = {
                backStack.add(F126Key)
            },
            onF127Key = {
                backStack.add(F127Key)
            },
            onF128Key = {
                backStack.add(F128Key)
            },
        )
    }
}

@Composable
internal fun F125Screen(
    onF126Key: () -> Unit,
    onF127Key: () -> Unit,
    onF128Key: () -> Unit,
) {
    Column {
        Text("F125")
        Button(onClick = onF126Key) {
            Text("F125 -> F126")
        }
        Button(onClick = onF127Key) {
            Text("F125 -> F127")
        }
        Button(onClick = onF128Key) {
            Text("F125 -> F128")
        }
    }
}
