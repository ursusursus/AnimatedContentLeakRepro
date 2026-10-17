package com.example.feature.f041.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f041.contract.F041Key
import com.example.feature.f042.contract.F042Key
import com.example.feature.f043.contract.F043Key
import com.example.feature.f044.contract.F044Key

fun EntryProviderScope<NavKey>.f041Entries(backStack: NavBackStack<NavKey>) {
    entry<F041Key> {
        F041Screen(
            onF042Key = {
                backStack.add(F042Key)
            },
            onF043Key = {
                backStack.add(F043Key)
            },
            onF044Key = {
                backStack.add(F044Key)
            },
        )
    }
}

@Composable
internal fun F041Screen(
    onF042Key: () -> Unit,
    onF043Key: () -> Unit,
    onF044Key: () -> Unit,
) {
    Column {
        Text("F041")
        Button(onClick = onF042Key) {
            Text("F041 -> F042")
        }
        Button(onClick = onF043Key) {
            Text("F041 -> F043")
        }
        Button(onClick = onF044Key) {
            Text("F041 -> F044")
        }
    }
}
