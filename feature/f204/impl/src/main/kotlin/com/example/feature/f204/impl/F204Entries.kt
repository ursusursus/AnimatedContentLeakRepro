package com.example.feature.f204.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f204.contract.F204Key
import com.example.feature.f205.contract.F205Key
import com.example.feature.f206.contract.F206Key
import com.example.feature.f207.contract.F207Key

fun EntryProviderScope<NavKey>.f204Entries(backStack: NavBackStack<NavKey>) {
    entry<F204Key> {
        F204Screen(
            onF205Key = {
                backStack.add(F205Key)
            },
            onF206Key = {
                backStack.add(F206Key)
            },
            onF207Key = {
                backStack.add(F207Key)
            },
        )
    }
}

@Composable
internal fun F204Screen(
    onF205Key: () -> Unit,
    onF206Key: () -> Unit,
    onF207Key: () -> Unit,
) {
    Column {
        Text("F204")
        Button(onClick = onF205Key) {
            Text("F204 -> F205")
        }
        Button(onClick = onF206Key) {
            Text("F204 -> F206")
        }
        Button(onClick = onF207Key) {
            Text("F204 -> F207")
        }
    }
}
