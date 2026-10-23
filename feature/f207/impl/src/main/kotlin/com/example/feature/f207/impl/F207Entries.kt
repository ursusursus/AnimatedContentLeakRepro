package com.example.feature.f207.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f207.contract.F207Key
import com.example.feature.f208.contract.F208Key
import com.example.feature.f209.contract.F209Key
import com.example.feature.f210.contract.F210Key

fun EntryProviderScope<NavKey>.f207Entries(backStack: NavBackStack<NavKey>) {
    entry<F207Key> {
        F207Screen(
            onF208Key = {
                backStack.add(F208Key)
            },
            onF209Key = {
                backStack.add(F209Key)
            },
            onF210Key = {
                backStack.add(F210Key)
            },
        )
    }
}

@Composable
internal fun F207Screen(
    onF208Key: () -> Unit,
    onF209Key: () -> Unit,
    onF210Key: () -> Unit,
) {
    Column {
        Text("F207")
        Button(onClick = onF208Key) {
            Text("F207 -> F208")
        }
        Button(onClick = onF209Key) {
            Text("F207 -> F209")
        }
        Button(onClick = onF210Key) {
            Text("F207 -> F210")
        }
    }
}
