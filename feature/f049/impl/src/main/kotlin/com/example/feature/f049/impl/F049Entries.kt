package com.example.feature.f049.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f049.contract.F049Key
import com.example.feature.f050.contract.F050Key
import com.example.feature.f051.contract.F051Key
import com.example.feature.f052.contract.F052Key

fun EntryProviderScope<NavKey>.f049Entries(backStack: NavBackStack<NavKey>) {
    entry<F049Key> {
        F049Screen(
            onF050Key = {
                backStack.add(F050Key)
            },
            onF051Key = {
                backStack.add(F051Key)
            },
            onF052Key = {
                backStack.add(F052Key)
            },
        )
    }
}

@Composable
internal fun F049Screen(
    onF050Key: () -> Unit,
    onF051Key: () -> Unit,
    onF052Key: () -> Unit,
) {
    Column {
        Text("F049")
        Button(onClick = onF050Key) {
            Text("F049 -> F050")
        }
        Button(onClick = onF051Key) {
            Text("F049 -> F051")
        }
        Button(onClick = onF052Key) {
            Text("F049 -> F052")
        }
    }
}
