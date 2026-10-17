package com.example.feature.f109.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f109.contract.F109Key
import com.example.feature.f110.contract.F110Key
import com.example.feature.f111.contract.F111Key
import com.example.feature.f112.contract.F112Key

fun EntryProviderScope<NavKey>.f109Entries(backStack: NavBackStack<NavKey>) {
    entry<F109Key> {
        F109Screen(
            onF110Key = {
                backStack.add(F110Key)
            },
            onF111Key = {
                backStack.add(F111Key)
            },
            onF112Key = {
                backStack.add(F112Key)
            },
        )
    }
}

@Composable
internal fun F109Screen(
    onF110Key: () -> Unit,
    onF111Key: () -> Unit,
    onF112Key: () -> Unit,
) {
    Column {
        Text("F109")
        Button(onClick = onF110Key) {
            Text("F109 -> F110")
        }
        Button(onClick = onF111Key) {
            Text("F109 -> F111")
        }
        Button(onClick = onF112Key) {
            Text("F109 -> F112")
        }
    }
}
