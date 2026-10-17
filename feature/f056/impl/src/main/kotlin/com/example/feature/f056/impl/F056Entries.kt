package com.example.feature.f056.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f056.contract.F056Key
import com.example.feature.f057.contract.F057Key
import com.example.feature.f058.contract.F058Key
import com.example.feature.f059.contract.F059Key

fun EntryProviderScope<NavKey>.f056Entries(backStack: NavBackStack<NavKey>) {
    entry<F056Key> {
        F056Screen(
            onF057Key = {
                backStack.add(F057Key)
            },
            onF058Key = {
                backStack.add(F058Key)
            },
            onF059Key = {
                backStack.add(F059Key)
            },
        )
    }
}

@Composable
internal fun F056Screen(
    onF057Key: () -> Unit,
    onF058Key: () -> Unit,
    onF059Key: () -> Unit,
) {
    Column {
        Text("F056")
        Button(onClick = onF057Key) {
            Text("F056 -> F057")
        }
        Button(onClick = onF058Key) {
            Text("F056 -> F058")
        }
        Button(onClick = onF059Key) {
            Text("F056 -> F059")
        }
    }
}
