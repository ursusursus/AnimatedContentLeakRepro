package com.example.feature.f130.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f130.contract.F130Key
import com.example.feature.f131.contract.F131Key
import com.example.feature.f132.contract.F132Key
import com.example.feature.f133.contract.F133Key

fun EntryProviderScope<NavKey>.f130Entries(backStack: NavBackStack<NavKey>) {
    entry<F130Key> {
        F130Screen(
            onF131Key = {
                backStack.add(F131Key)
            },
            onF132Key = {
                backStack.add(F132Key)
            },
            onF133Key = {
                backStack.add(F133Key)
            },
        )
    }
}

@Composable
internal fun F130Screen(
    onF131Key: () -> Unit,
    onF132Key: () -> Unit,
    onF133Key: () -> Unit,
) {
    Column {
        Text("F130")
        Button(onClick = onF131Key) {
            Text("F130 -> F131")
        }
        Button(onClick = onF132Key) {
            Text("F130 -> F132")
        }
        Button(onClick = onF133Key) {
            Text("F130 -> F133")
        }
    }
}
