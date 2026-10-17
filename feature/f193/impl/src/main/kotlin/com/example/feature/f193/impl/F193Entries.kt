package com.example.feature.f193.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f193.contract.F193Key
import com.example.feature.f194.contract.F194Key
import com.example.feature.f195.contract.F195Key
import com.example.feature.f196.contract.F196Key

fun EntryProviderScope<NavKey>.f193Entries(backStack: NavBackStack<NavKey>) {
    entry<F193Key> {
        F193Screen(
            onF194Key = {
                backStack.add(F194Key)
            },
            onF195Key = {
                backStack.add(F195Key)
            },
            onF196Key = {
                backStack.add(F196Key)
            },
        )
    }
}

@Composable
internal fun F193Screen(
    onF194Key: () -> Unit,
    onF195Key: () -> Unit,
    onF196Key: () -> Unit,
) {
    Column {
        Text("F193")
        Button(onClick = onF194Key) {
            Text("F193 -> F194")
        }
        Button(onClick = onF195Key) {
            Text("F193 -> F195")
        }
        Button(onClick = onF196Key) {
            Text("F193 -> F196")
        }
    }
}
