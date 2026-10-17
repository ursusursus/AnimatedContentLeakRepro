package com.example.feature.f071.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f071.contract.F071Key
import com.example.feature.f072.contract.F072Key
import com.example.feature.f073.contract.F073Key
import com.example.feature.f074.contract.F074Key

fun EntryProviderScope<NavKey>.f071Entries(backStack: NavBackStack<NavKey>) {
    entry<F071Key> {
        F071Screen(
            onF072Key = {
                backStack.add(F072Key)
            },
            onF073Key = {
                backStack.add(F073Key)
            },
            onF074Key = {
                backStack.add(F074Key)
            },
        )
    }
}

@Composable
internal fun F071Screen(
    onF072Key: () -> Unit,
    onF073Key: () -> Unit,
    onF074Key: () -> Unit,
) {
    Column {
        Text("F071")
        Button(onClick = onF072Key) {
            Text("F071 -> F072")
        }
        Button(onClick = onF073Key) {
            Text("F071 -> F073")
        }
        Button(onClick = onF074Key) {
            Text("F071 -> F074")
        }
    }
}
