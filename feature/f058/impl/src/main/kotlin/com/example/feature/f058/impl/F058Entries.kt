package com.example.feature.f058.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f058.contract.F058Key
import com.example.feature.f059.contract.F059Key
import com.example.feature.f060.contract.F060Key
import com.example.feature.f061.contract.F061Key

fun EntryProviderScope<NavKey>.f058Entries(backStack: NavBackStack<NavKey>) {
    entry<F058Key> {
        F058Screen(
            onF059Key = {
                backStack.add(F059Key)
            },
            onF060Key = {
                backStack.add(F060Key)
            },
            onF061Key = {
                backStack.add(F061Key)
            },
        )
    }
}

@Composable
internal fun F058Screen(
    onF059Key: () -> Unit,
    onF060Key: () -> Unit,
    onF061Key: () -> Unit,
) {
    Column {
        Text("F058")
        Button(onClick = onF059Key) {
            Text("F058 -> F059")
        }
        Button(onClick = onF060Key) {
            Text("F058 -> F060")
        }
        Button(onClick = onF061Key) {
            Text("F058 -> F061")
        }
    }
}
