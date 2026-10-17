package com.example.feature.f115.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f115.contract.F115Key
import com.example.feature.f116.contract.F116Key
import com.example.feature.f117.contract.F117Key
import com.example.feature.f118.contract.F118Key

fun EntryProviderScope<NavKey>.f115Entries(backStack: NavBackStack<NavKey>) {
    entry<F115Key> {
        F115Screen(
            onF116Key = {
                backStack.add(F116Key)
            },
            onF117Key = {
                backStack.add(F117Key)
            },
            onF118Key = {
                backStack.add(F118Key)
            },
        )
    }
}

@Composable
internal fun F115Screen(
    onF116Key: () -> Unit,
    onF117Key: () -> Unit,
    onF118Key: () -> Unit,
) {
    Column {
        Text("F115")
        Button(onClick = onF116Key) {
            Text("F115 -> F116")
        }
        Button(onClick = onF117Key) {
            Text("F115 -> F117")
        }
        Button(onClick = onF118Key) {
            Text("F115 -> F118")
        }
    }
}
