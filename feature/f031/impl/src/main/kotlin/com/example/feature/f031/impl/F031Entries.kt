package com.example.feature.f031.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f031.contract.F031Key
import com.example.feature.f032.contract.F032Key
import com.example.feature.f033.contract.F033Key
import com.example.feature.f034.contract.F034Key

fun EntryProviderScope<NavKey>.f031Entries(backStack: NavBackStack<NavKey>) {
    entry<F031Key> {
        F031Screen(
            onF032Key = {
                backStack.add(F032Key)
            },
            onF033Key = {
                backStack.add(F033Key)
            },
            onF034Key = {
                backStack.add(F034Key)
            },
        )
    }
}

@Composable
internal fun F031Screen(
    onF032Key: () -> Unit,
    onF033Key: () -> Unit,
    onF034Key: () -> Unit,
) {
    Column {
        Text("F031")
        Button(onClick = onF032Key) {
            Text("F031 -> F032")
        }
        Button(onClick = onF033Key) {
            Text("F031 -> F033")
        }
        Button(onClick = onF034Key) {
            Text("F031 -> F034")
        }
    }
}
