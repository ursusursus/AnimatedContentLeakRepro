package com.example.feature.f040.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f040.contract.F040Key
import com.example.feature.f041.contract.F041Key
import com.example.feature.f042.contract.F042Key
import com.example.feature.f043.contract.F043Key

fun EntryProviderScope<NavKey>.f040Entries(backStack: NavBackStack<NavKey>) {
    entry<F040Key> {
        F040Screen(
            onF041Key = {
                backStack.add(F041Key)
            },
            onF042Key = {
                backStack.add(F042Key)
            },
            onF043Key = {
                backStack.add(F043Key)
            },
        )
    }
}

@Composable
internal fun F040Screen(
    onF041Key: () -> Unit,
    onF042Key: () -> Unit,
    onF043Key: () -> Unit,
) {
    Column {
        Text("F040")
        Button(onClick = onF041Key) {
            Text("F040 -> F041")
        }
        Button(onClick = onF042Key) {
            Text("F040 -> F042")
        }
        Button(onClick = onF043Key) {
            Text("F040 -> F043")
        }
    }
}
