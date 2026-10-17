package com.example.feature.f101.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f101.contract.F101Key
import com.example.feature.f102.contract.F102Key
import com.example.feature.f103.contract.F103Key
import com.example.feature.f104.contract.F104Key

fun EntryProviderScope<NavKey>.f101Entries(backStack: NavBackStack<NavKey>) {
    entry<F101Key> {
        F101Screen(
            onF102Key = {
                backStack.add(F102Key)
            },
            onF103Key = {
                backStack.add(F103Key)
            },
            onF104Key = {
                backStack.add(F104Key)
            },
        )
    }
}

@Composable
internal fun F101Screen(
    onF102Key: () -> Unit,
    onF103Key: () -> Unit,
    onF104Key: () -> Unit,
) {
    Column {
        Text("F101")
        Button(onClick = onF102Key) {
            Text("F101 -> F102")
        }
        Button(onClick = onF103Key) {
            Text("F101 -> F103")
        }
        Button(onClick = onF104Key) {
            Text("F101 -> F104")
        }
    }
}
