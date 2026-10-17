package com.example.feature.f028.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f028.contract.F028Key
import com.example.feature.f029.contract.F029Key
import com.example.feature.f030.contract.F030Key
import com.example.feature.f031.contract.F031Key

fun EntryProviderScope<NavKey>.f028Entries(backStack: NavBackStack<NavKey>) {
    entry<F028Key> {
        F028Screen(
            onF029Key = {
                backStack.add(F029Key)
            },
            onF030Key = {
                backStack.add(F030Key)
            },
            onF031Key = {
                backStack.add(F031Key)
            },
        )
    }
}

@Composable
internal fun F028Screen(
    onF029Key: () -> Unit,
    onF030Key: () -> Unit,
    onF031Key: () -> Unit,
) {
    Column {
        Text("F028")
        Button(onClick = onF029Key) {
            Text("F028 -> F029")
        }
        Button(onClick = onF030Key) {
            Text("F028 -> F030")
        }
        Button(onClick = onF031Key) {
            Text("F028 -> F031")
        }
    }
}
