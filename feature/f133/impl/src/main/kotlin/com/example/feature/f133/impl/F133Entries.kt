package com.example.feature.f133.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f133.contract.F133Key
import com.example.feature.f134.contract.F134Key
import com.example.feature.f135.contract.F135Key
import com.example.feature.f136.contract.F136Key

fun EntryProviderScope<NavKey>.f133Entries(backStack: NavBackStack<NavKey>) {
    entry<F133Key> {
        F133Screen(
            onF134Key = {
                backStack.add(F134Key)
            },
            onF135Key = {
                backStack.add(F135Key)
            },
            onF136Key = {
                backStack.add(F136Key)
            },
        )
    }
}

@Composable
internal fun F133Screen(
    onF134Key: () -> Unit,
    onF135Key: () -> Unit,
    onF136Key: () -> Unit,
) {
    Column {
        Text("F133")
        Button(onClick = onF134Key) {
            Text("F133 -> F134")
        }
        Button(onClick = onF135Key) {
            Text("F133 -> F135")
        }
        Button(onClick = onF136Key) {
            Text("F133 -> F136")
        }
    }
}
