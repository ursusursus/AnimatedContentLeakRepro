package com.example.feature.f144.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f144.contract.F144Key
import com.example.feature.f145.contract.F145Key
import com.example.feature.f146.contract.F146Key
import com.example.feature.f147.contract.F147Key

fun EntryProviderScope<NavKey>.f144Entries(backStack: NavBackStack<NavKey>) {
    entry<F144Key> {
        F144Screen(
            onF145Key = {
                backStack.add(F145Key)
            },
            onF146Key = {
                backStack.add(F146Key)
            },
            onF147Key = {
                backStack.add(F147Key)
            },
        )
    }
}

@Composable
internal fun F144Screen(
    onF145Key: () -> Unit,
    onF146Key: () -> Unit,
    onF147Key: () -> Unit,
) {
    Column {
        Text("F144")
        Button(onClick = onF145Key) {
            Text("F144 -> F145")
        }
        Button(onClick = onF146Key) {
            Text("F144 -> F146")
        }
        Button(onClick = onF147Key) {
            Text("F144 -> F147")
        }
    }
}
