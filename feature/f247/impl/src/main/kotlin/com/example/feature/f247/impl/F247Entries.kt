package com.example.feature.f247.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f247.contract.F247Key
import com.example.feature.f248.contract.F248Key
import com.example.feature.f249.contract.F249Key
import com.example.feature.f250.contract.F250Key

fun EntryProviderScope<NavKey>.f247Entries(backStack: NavBackStack<NavKey>) {
    entry<F247Key> {
        F247Screen(
            onF248Key = {
                backStack.add(F248Key)
            },
            onF249Key = {
                backStack.add(F249Key)
            },
            onF250Key = {
                backStack.add(F250Key)
            },
        )
    }
}

@Composable
internal fun F247Screen(
    onF248Key: () -> Unit,
    onF249Key: () -> Unit,
    onF250Key: () -> Unit,
) {
    Column {
        Text("F247")
        Button(onClick = onF248Key) {
            Text("F247 -> F248")
        }
        Button(onClick = onF249Key) {
            Text("F247 -> F249")
        }
        Button(onClick = onF250Key) {
            Text("F247 -> F250")
        }
    }
}
