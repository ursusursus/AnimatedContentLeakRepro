package com.example.feature.f057.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f057.contract.F057Key
import com.example.feature.f058.contract.F058Key
import com.example.feature.f059.contract.F059Key
import com.example.feature.f060.contract.F060Key

fun EntryProviderScope<NavKey>.f057Entries(backStack: NavBackStack<NavKey>) {
    entry<F057Key> {
        F057Screen(
            onF058Key = {
                backStack.add(F058Key)
            },
            onF059Key = {
                backStack.add(F059Key)
            },
            onF060Key = {
                backStack.add(F060Key)
            },
        )
    }
}

@Composable
internal fun F057Screen(
    onF058Key: () -> Unit,
    onF059Key: () -> Unit,
    onF060Key: () -> Unit,
) {
    Column {
        Text("F057")
        Button(onClick = onF058Key) {
            Text("F057 -> F058")
        }
        Button(onClick = onF059Key) {
            Text("F057 -> F059")
        }
        Button(onClick = onF060Key) {
            Text("F057 -> F060")
        }
    }
}
