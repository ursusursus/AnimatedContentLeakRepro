package com.example.feature.f008.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f008.contract.F008Key
import com.example.feature.f009.contract.F009Key
import com.example.feature.f010.contract.F010Key
import com.example.feature.f011.contract.F011Key

fun EntryProviderScope<NavKey>.f008Entries(backStack: NavBackStack<NavKey>) {
    entry<F008Key> {
        F008Screen(
            onF009Key = {
                backStack.add(F009Key)
            },
            onF010Key = {
                backStack.add(F010Key)
            },
            onF011Key = {
                backStack.add(F011Key)
            },
        )
    }
}

@Composable
internal fun F008Screen(
    onF009Key: () -> Unit,
    onF010Key: () -> Unit,
    onF011Key: () -> Unit,
) {
    Column {
        Text("F008")
        Button(onClick = onF009Key) {
            Text("F008 -> F009")
        }
        Button(onClick = onF010Key) {
            Text("F008 -> F010")
        }
        Button(onClick = onF011Key) {
            Text("F008 -> F011")
        }
    }
}
