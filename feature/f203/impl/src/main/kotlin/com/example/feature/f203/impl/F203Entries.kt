package com.example.feature.f203.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f203.contract.F203Key
import com.example.feature.f204.contract.F204Key
import com.example.feature.f205.contract.F205Key
import com.example.feature.f206.contract.F206Key

fun EntryProviderScope<NavKey>.f203Entries(backStack: NavBackStack<NavKey>) {
    entry<F203Key> {
        F203Screen(
            onF204Key = {
                backStack.add(F204Key)
            },
            onF205Key = {
                backStack.add(F205Key)
            },
            onF206Key = {
                backStack.add(F206Key)
            },
        )
    }
}

@Composable
internal fun F203Screen(
    onF204Key: () -> Unit,
    onF205Key: () -> Unit,
    onF206Key: () -> Unit,
) {
    Column {
        Text("F203")
        Button(onClick = onF204Key) {
            Text("F203 -> F204")
        }
        Button(onClick = onF205Key) {
            Text("F203 -> F205")
        }
        Button(onClick = onF206Key) {
            Text("F203 -> F206")
        }
    }
}
