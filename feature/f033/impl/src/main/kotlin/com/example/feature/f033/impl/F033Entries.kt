package com.example.feature.f033.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f033.contract.F033Key
import com.example.feature.f034.contract.F034Key
import com.example.feature.f035.contract.F035Key
import com.example.feature.f036.contract.F036Key

fun EntryProviderScope<NavKey>.f033Entries(backStack: NavBackStack<NavKey>) {
    entry<F033Key> {
        F033Screen(
            onF034Key = {
                backStack.add(F034Key)
            },
            onF035Key = {
                backStack.add(F035Key)
            },
            onF036Key = {
                backStack.add(F036Key)
            },
        )
    }
}

@Composable
internal fun F033Screen(
    onF034Key: () -> Unit,
    onF035Key: () -> Unit,
    onF036Key: () -> Unit,
) {
    Column {
        Text("F033")
        Button(onClick = onF034Key) {
            Text("F033 -> F034")
        }
        Button(onClick = onF035Key) {
            Text("F033 -> F035")
        }
        Button(onClick = onF036Key) {
            Text("F033 -> F036")
        }
    }
}
