package com.example.feature.f111.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f111.contract.F111Key
import com.example.feature.f112.contract.F112Key
import com.example.feature.f113.contract.F113Key
import com.example.feature.f114.contract.F114Key

fun EntryProviderScope<NavKey>.f111Entries(backStack: NavBackStack<NavKey>) {
    entry<F111Key> {
        F111Screen(
            onF112Key = {
                backStack.add(F112Key)
            },
            onF113Key = {
                backStack.add(F113Key)
            },
            onF114Key = {
                backStack.add(F114Key)
            },
        )
    }
}

@Composable
internal fun F111Screen(
    onF112Key: () -> Unit,
    onF113Key: () -> Unit,
    onF114Key: () -> Unit,
) {
    Column {
        Text("F111")
        Button(onClick = onF112Key) {
            Text("F111 -> F112")
        }
        Button(onClick = onF113Key) {
            Text("F111 -> F113")
        }
        Button(onClick = onF114Key) {
            Text("F111 -> F114")
        }
    }
}
