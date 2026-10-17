package com.example.feature.f029.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f029.contract.F029Key
import com.example.feature.f030.contract.F030Key
import com.example.feature.f031.contract.F031Key
import com.example.feature.f032.contract.F032Key

fun EntryProviderScope<NavKey>.f029Entries(backStack: NavBackStack<NavKey>) {
    entry<F029Key> {
        F029Screen(
            onF030Key = {
                backStack.add(F030Key)
            },
            onF031Key = {
                backStack.add(F031Key)
            },
            onF032Key = {
                backStack.add(F032Key)
            },
        )
    }
}

@Composable
internal fun F029Screen(
    onF030Key: () -> Unit,
    onF031Key: () -> Unit,
    onF032Key: () -> Unit,
) {
    Column {
        Text("F029")
        Button(onClick = onF030Key) {
            Text("F029 -> F030")
        }
        Button(onClick = onF031Key) {
            Text("F029 -> F031")
        }
        Button(onClick = onF032Key) {
            Text("F029 -> F032")
        }
    }
}
