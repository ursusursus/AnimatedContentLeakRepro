package com.example.feature.f038.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f038.contract.F038Key
import com.example.feature.f039.contract.F039Key
import com.example.feature.f040.contract.F040Key
import com.example.feature.f041.contract.F041Key

fun EntryProviderScope<NavKey>.f038Entries(backStack: NavBackStack<NavKey>) {
    entry<F038Key> {
        F038Screen(
            onF039Key = {
                backStack.add(F039Key)
            },
            onF040Key = {
                backStack.add(F040Key)
            },
            onF041Key = {
                backStack.add(F041Key)
            },
        )
    }
}

@Composable
internal fun F038Screen(
    onF039Key: () -> Unit,
    onF040Key: () -> Unit,
    onF041Key: () -> Unit,
) {
    Column {
        Text("F038")
        Button(onClick = onF039Key) {
            Text("F038 -> F039")
        }
        Button(onClick = onF040Key) {
            Text("F038 -> F040")
        }
        Button(onClick = onF041Key) {
            Text("F038 -> F041")
        }
    }
}
