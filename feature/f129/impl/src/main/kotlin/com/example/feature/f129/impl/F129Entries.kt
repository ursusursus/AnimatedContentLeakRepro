package com.example.feature.f129.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f129.contract.F129Key
import com.example.feature.f130.contract.F130Key
import com.example.feature.f131.contract.F131Key
import com.example.feature.f132.contract.F132Key

fun EntryProviderScope<NavKey>.f129Entries(backStack: NavBackStack<NavKey>) {
    entry<F129Key> {
        F129Screen(
            onF130Key = {
                backStack.add(F130Key)
            },
            onF131Key = {
                backStack.add(F131Key)
            },
            onF132Key = {
                backStack.add(F132Key)
            },
        )
    }
}

@Composable
internal fun F129Screen(
    onF130Key: () -> Unit,
    onF131Key: () -> Unit,
    onF132Key: () -> Unit,
) {
    Column {
        Text("F129")
        Button(onClick = onF130Key) {
            Text("F129 -> F130")
        }
        Button(onClick = onF131Key) {
            Text("F129 -> F131")
        }
        Button(onClick = onF132Key) {
            Text("F129 -> F132")
        }
    }
}
