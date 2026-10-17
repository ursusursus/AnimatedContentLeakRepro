package com.example.feature.f108.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f108.contract.F108Key
import com.example.feature.f109.contract.F109Key
import com.example.feature.f110.contract.F110Key
import com.example.feature.f111.contract.F111Key

fun EntryProviderScope<NavKey>.f108Entries(backStack: NavBackStack<NavKey>) {
    entry<F108Key> {
        F108Screen(
            onF109Key = {
                backStack.add(F109Key)
            },
            onF110Key = {
                backStack.add(F110Key)
            },
            onF111Key = {
                backStack.add(F111Key)
            },
        )
    }
}

@Composable
internal fun F108Screen(
    onF109Key: () -> Unit,
    onF110Key: () -> Unit,
    onF111Key: () -> Unit,
) {
    Column {
        Text("F108")
        Button(onClick = onF109Key) {
            Text("F108 -> F109")
        }
        Button(onClick = onF110Key) {
            Text("F108 -> F110")
        }
        Button(onClick = onF111Key) {
            Text("F108 -> F111")
        }
    }
}
