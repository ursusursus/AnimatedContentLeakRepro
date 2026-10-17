package com.example.feature.f134.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f134.contract.F134Key
import com.example.feature.f135.contract.F135Key
import com.example.feature.f136.contract.F136Key
import com.example.feature.f137.contract.F137Key

fun EntryProviderScope<NavKey>.f134Entries(backStack: NavBackStack<NavKey>) {
    entry<F134Key> {
        F134Screen(
            onF135Key = {
                backStack.add(F135Key)
            },
            onF136Key = {
                backStack.add(F136Key)
            },
            onF137Key = {
                backStack.add(F137Key)
            },
        )
    }
}

@Composable
internal fun F134Screen(
    onF135Key: () -> Unit,
    onF136Key: () -> Unit,
    onF137Key: () -> Unit,
) {
    Column {
        Text("F134")
        Button(onClick = onF135Key) {
            Text("F134 -> F135")
        }
        Button(onClick = onF136Key) {
            Text("F134 -> F136")
        }
        Button(onClick = onF137Key) {
            Text("F134 -> F137")
        }
    }
}
