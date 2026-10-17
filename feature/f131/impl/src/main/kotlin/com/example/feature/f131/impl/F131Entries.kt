package com.example.feature.f131.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f131.contract.F131Key
import com.example.feature.f132.contract.F132Key
import com.example.feature.f133.contract.F133Key
import com.example.feature.f134.contract.F134Key

fun EntryProviderScope<NavKey>.f131Entries(backStack: NavBackStack<NavKey>) {
    entry<F131Key> {
        F131Screen(
            onF132Key = {
                backStack.add(F132Key)
            },
            onF133Key = {
                backStack.add(F133Key)
            },
            onF134Key = {
                backStack.add(F134Key)
            },
        )
    }
}

@Composable
internal fun F131Screen(
    onF132Key: () -> Unit,
    onF133Key: () -> Unit,
    onF134Key: () -> Unit,
) {
    Column {
        Text("F131")
        Button(onClick = onF132Key) {
            Text("F131 -> F132")
        }
        Button(onClick = onF133Key) {
            Text("F131 -> F133")
        }
        Button(onClick = onF134Key) {
            Text("F131 -> F134")
        }
    }
}
