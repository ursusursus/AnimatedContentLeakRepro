package com.example.feature.f035.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f035.contract.F035Key
import com.example.feature.f036.contract.F036Key
import com.example.feature.f037.contract.F037Key
import com.example.feature.f038.contract.F038Key

fun EntryProviderScope<NavKey>.f035Entries(backStack: NavBackStack<NavKey>) {
    entry<F035Key> {
        F035Screen(
            onF036Key = {
                backStack.add(F036Key)
            },
            onF037Key = {
                backStack.add(F037Key)
            },
            onF038Key = {
                backStack.add(F038Key)
            },
        )
    }
}

@Composable
internal fun F035Screen(
    onF036Key: () -> Unit,
    onF037Key: () -> Unit,
    onF038Key: () -> Unit,
) {
    Column {
        Text("F035")
        Button(onClick = onF036Key) {
            Text("F035 -> F036")
        }
        Button(onClick = onF037Key) {
            Text("F035 -> F037")
        }
        Button(onClick = onF038Key) {
            Text("F035 -> F038")
        }
    }
}
