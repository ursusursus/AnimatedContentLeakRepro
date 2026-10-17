package com.example.feature.f132.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f132.contract.F132Key
import com.example.feature.f133.contract.F133Key
import com.example.feature.f134.contract.F134Key
import com.example.feature.f135.contract.F135Key

fun EntryProviderScope<NavKey>.f132Entries(backStack: NavBackStack<NavKey>) {
    entry<F132Key> {
        F132Screen(
            onF133Key = {
                backStack.add(F133Key)
            },
            onF134Key = {
                backStack.add(F134Key)
            },
            onF135Key = {
                backStack.add(F135Key)
            },
        )
    }
}

@Composable
internal fun F132Screen(
    onF133Key: () -> Unit,
    onF134Key: () -> Unit,
    onF135Key: () -> Unit,
) {
    Column {
        Text("F132")
        Button(onClick = onF133Key) {
            Text("F132 -> F133")
        }
        Button(onClick = onF134Key) {
            Text("F132 -> F134")
        }
        Button(onClick = onF135Key) {
            Text("F132 -> F135")
        }
    }
}
