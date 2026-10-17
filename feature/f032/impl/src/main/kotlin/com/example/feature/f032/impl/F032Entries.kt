package com.example.feature.f032.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f032.contract.F032Key
import com.example.feature.f033.contract.F033Key
import com.example.feature.f034.contract.F034Key
import com.example.feature.f035.contract.F035Key

fun EntryProviderScope<NavKey>.f032Entries(backStack: NavBackStack<NavKey>) {
    entry<F032Key> {
        F032Screen(
            onF033Key = {
                backStack.add(F033Key)
            },
            onF034Key = {
                backStack.add(F034Key)
            },
            onF035Key = {
                backStack.add(F035Key)
            },
        )
    }
}

@Composable
internal fun F032Screen(
    onF033Key: () -> Unit,
    onF034Key: () -> Unit,
    onF035Key: () -> Unit,
) {
    Column {
        Text("F032")
        Button(onClick = onF033Key) {
            Text("F032 -> F033")
        }
        Button(onClick = onF034Key) {
            Text("F032 -> F034")
        }
        Button(onClick = onF035Key) {
            Text("F032 -> F035")
        }
    }
}
