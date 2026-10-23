package com.example.feature.f205.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f205.contract.F205Key
import com.example.feature.f206.contract.F206Key
import com.example.feature.f207.contract.F207Key
import com.example.feature.f208.contract.F208Key

fun EntryProviderScope<NavKey>.f205Entries(backStack: NavBackStack<NavKey>) {
    entry<F205Key> {
        F205Screen(
            onF206Key = {
                backStack.add(F206Key)
            },
            onF207Key = {
                backStack.add(F207Key)
            },
            onF208Key = {
                backStack.add(F208Key)
            },
        )
    }
}

@Composable
internal fun F205Screen(
    onF206Key: () -> Unit,
    onF207Key: () -> Unit,
    onF208Key: () -> Unit,
) {
    Column {
        Text("F205")
        Button(onClick = onF206Key) {
            Text("F205 -> F206")
        }
        Button(onClick = onF207Key) {
            Text("F205 -> F207")
        }
        Button(onClick = onF208Key) {
            Text("F205 -> F208")
        }
    }
}
