package com.example.feature.f122.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f122.contract.F122Key
import com.example.feature.f123.contract.F123Key
import com.example.feature.f124.contract.F124Key
import com.example.feature.f125.contract.F125Key

fun EntryProviderScope<NavKey>.f122Entries(backStack: NavBackStack<NavKey>) {
    entry<F122Key> {
        F122Screen(
            onF123Key = {
                backStack.add(F123Key)
            },
            onF124Key = {
                backStack.add(F124Key)
            },
            onF125Key = {
                backStack.add(F125Key)
            },
        )
    }
}

@Composable
internal fun F122Screen(
    onF123Key: () -> Unit,
    onF124Key: () -> Unit,
    onF125Key: () -> Unit,
) {
    Column {
        Text("F122")
        Button(onClick = onF123Key) {
            Text("F122 -> F123")
        }
        Button(onClick = onF124Key) {
            Text("F122 -> F124")
        }
        Button(onClick = onF125Key) {
            Text("F122 -> F125")
        }
    }
}
