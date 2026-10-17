package com.example.feature.f013.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f013.contract.F013Key
import com.example.feature.f014.contract.F014Key
import com.example.feature.f015.contract.F015Key
import com.example.feature.f016.contract.F016Key

fun EntryProviderScope<NavKey>.f013Entries(backStack: NavBackStack<NavKey>) {
    entry<F013Key> {
        F013Screen(
            onF014Key = {
                backStack.add(F014Key)
            },
            onF015Key = {
                backStack.add(F015Key)
            },
            onF016Key = {
                backStack.add(F016Key)
            },
        )
    }
}

@Composable
internal fun F013Screen(
    onF014Key: () -> Unit,
    onF015Key: () -> Unit,
    onF016Key: () -> Unit,
) {
    Column {
        Text("F013")
        Button(onClick = onF014Key) {
            Text("F013 -> F014")
        }
        Button(onClick = onF015Key) {
            Text("F013 -> F015")
        }
        Button(onClick = onF016Key) {
            Text("F013 -> F016")
        }
    }
}
