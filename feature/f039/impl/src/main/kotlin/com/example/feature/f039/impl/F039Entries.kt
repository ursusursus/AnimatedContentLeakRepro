package com.example.feature.f039.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f039.contract.F039Key
import com.example.feature.f040.contract.F040Key
import com.example.feature.f041.contract.F041Key
import com.example.feature.f042.contract.F042Key

fun EntryProviderScope<NavKey>.f039Entries(backStack: NavBackStack<NavKey>) {
    entry<F039Key> {
        F039Screen(
            onF040Key = {
                backStack.add(F040Key)
            },
            onF041Key = {
                backStack.add(F041Key)
            },
            onF042Key = {
                backStack.add(F042Key)
            },
        )
    }
}

@Composable
internal fun F039Screen(
    onF040Key: () -> Unit,
    onF041Key: () -> Unit,
    onF042Key: () -> Unit,
) {
    Column {
        Text("F039")
        Button(onClick = onF040Key) {
            Text("F039 -> F040")
        }
        Button(onClick = onF041Key) {
            Text("F039 -> F041")
        }
        Button(onClick = onF042Key) {
            Text("F039 -> F042")
        }
    }
}
