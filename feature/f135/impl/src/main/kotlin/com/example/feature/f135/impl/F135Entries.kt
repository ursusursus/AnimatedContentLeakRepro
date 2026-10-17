package com.example.feature.f135.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f135.contract.F135Key
import com.example.feature.f136.contract.F136Key
import com.example.feature.f137.contract.F137Key
import com.example.feature.f138.contract.F138Key

fun EntryProviderScope<NavKey>.f135Entries(backStack: NavBackStack<NavKey>) {
    entry<F135Key> {
        F135Screen(
            onF136Key = {
                backStack.add(F136Key)
            },
            onF137Key = {
                backStack.add(F137Key)
            },
            onF138Key = {
                backStack.add(F138Key)
            },
        )
    }
}

@Composable
internal fun F135Screen(
    onF136Key: () -> Unit,
    onF137Key: () -> Unit,
    onF138Key: () -> Unit,
) {
    Column {
        Text("F135")
        Button(onClick = onF136Key) {
            Text("F135 -> F136")
        }
        Button(onClick = onF137Key) {
            Text("F135 -> F137")
        }
        Button(onClick = onF138Key) {
            Text("F135 -> F138")
        }
    }
}
