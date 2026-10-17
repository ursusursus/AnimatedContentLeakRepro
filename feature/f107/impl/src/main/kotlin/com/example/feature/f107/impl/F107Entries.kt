package com.example.feature.f107.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f107.contract.F107Key
import com.example.feature.f108.contract.F108Key
import com.example.feature.f109.contract.F109Key
import com.example.feature.f110.contract.F110Key

fun EntryProviderScope<NavKey>.f107Entries(backStack: NavBackStack<NavKey>) {
    entry<F107Key> {
        F107Screen(
            onF108Key = {
                backStack.add(F108Key)
            },
            onF109Key = {
                backStack.add(F109Key)
            },
            onF110Key = {
                backStack.add(F110Key)
            },
        )
    }
}

@Composable
internal fun F107Screen(
    onF108Key: () -> Unit,
    onF109Key: () -> Unit,
    onF110Key: () -> Unit,
) {
    Column {
        Text("F107")
        Button(onClick = onF108Key) {
            Text("F107 -> F108")
        }
        Button(onClick = onF109Key) {
            Text("F107 -> F109")
        }
        Button(onClick = onF110Key) {
            Text("F107 -> F110")
        }
    }
}
