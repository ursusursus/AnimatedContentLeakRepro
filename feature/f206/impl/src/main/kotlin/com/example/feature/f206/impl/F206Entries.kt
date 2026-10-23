package com.example.feature.f206.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f206.contract.F206Key
import com.example.feature.f207.contract.F207Key
import com.example.feature.f208.contract.F208Key
import com.example.feature.f209.contract.F209Key

fun EntryProviderScope<NavKey>.f206Entries(backStack: NavBackStack<NavKey>) {
    entry<F206Key> {
        F206Screen(
            onF207Key = {
                backStack.add(F207Key)
            },
            onF208Key = {
                backStack.add(F208Key)
            },
            onF209Key = {
                backStack.add(F209Key)
            },
        )
    }
}

@Composable
internal fun F206Screen(
    onF207Key: () -> Unit,
    onF208Key: () -> Unit,
    onF209Key: () -> Unit,
) {
    Column {
        Text("F206")
        Button(onClick = onF207Key) {
            Text("F206 -> F207")
        }
        Button(onClick = onF208Key) {
            Text("F206 -> F208")
        }
        Button(onClick = onF209Key) {
            Text("F206 -> F209")
        }
    }
}
