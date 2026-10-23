package com.example.feature.f202.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f202.contract.F202Key
import com.example.feature.f203.contract.F203Key
import com.example.feature.f204.contract.F204Key
import com.example.feature.f205.contract.F205Key

fun EntryProviderScope<NavKey>.f202Entries(backStack: NavBackStack<NavKey>) {
    entry<F202Key> {
        F202Screen(
            onF203Key = {
                backStack.add(F203Key)
            },
            onF204Key = {
                backStack.add(F204Key)
            },
            onF205Key = {
                backStack.add(F205Key)
            },
        )
    }
}

@Composable
internal fun F202Screen(
    onF203Key: () -> Unit,
    onF204Key: () -> Unit,
    onF205Key: () -> Unit,
) {
    Column {
        Text("F202")
        Button(onClick = onF203Key) {
            Text("F202 -> F203")
        }
        Button(onClick = onF204Key) {
            Text("F202 -> F204")
        }
        Button(onClick = onF205Key) {
            Text("F202 -> F205")
        }
    }
}
