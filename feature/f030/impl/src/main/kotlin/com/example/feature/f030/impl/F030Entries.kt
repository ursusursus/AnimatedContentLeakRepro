package com.example.feature.f030.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f030.contract.F030Key
import com.example.feature.f031.contract.F031Key
import com.example.feature.f032.contract.F032Key
import com.example.feature.f033.contract.F033Key

fun EntryProviderScope<NavKey>.f030Entries(backStack: NavBackStack<NavKey>) {
    entry<F030Key> {
        F030Screen(
            onF031Key = {
                backStack.add(F031Key)
            },
            onF032Key = {
                backStack.add(F032Key)
            },
            onF033Key = {
                backStack.add(F033Key)
            },
        )
    }
}

@Composable
internal fun F030Screen(
    onF031Key: () -> Unit,
    onF032Key: () -> Unit,
    onF033Key: () -> Unit,
) {
    Column {
        Text("F030")
        Button(onClick = onF031Key) {
            Text("F030 -> F031")
        }
        Button(onClick = onF032Key) {
            Text("F030 -> F032")
        }
        Button(onClick = onF033Key) {
            Text("F030 -> F033")
        }
    }
}
