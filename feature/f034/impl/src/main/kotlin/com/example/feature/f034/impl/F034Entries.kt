package com.example.feature.f034.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f034.contract.F034Key
import com.example.feature.f035.contract.F035Key
import com.example.feature.f036.contract.F036Key
import com.example.feature.f037.contract.F037Key

fun EntryProviderScope<NavKey>.f034Entries(backStack: NavBackStack<NavKey>) {
    entry<F034Key> {
        F034Screen(
            onF035Key = {
                backStack.add(F035Key)
            },
            onF036Key = {
                backStack.add(F036Key)
            },
            onF037Key = {
                backStack.add(F037Key)
            },
        )
    }
}

@Composable
internal fun F034Screen(
    onF035Key: () -> Unit,
    onF036Key: () -> Unit,
    onF037Key: () -> Unit,
) {
    Column {
        Text("F034")
        Button(onClick = onF035Key) {
            Text("F034 -> F035")
        }
        Button(onClick = onF036Key) {
            Text("F034 -> F036")
        }
        Button(onClick = onF037Key) {
            Text("F034 -> F037")
        }
    }
}
