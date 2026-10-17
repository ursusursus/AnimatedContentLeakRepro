package com.example.feature.f012.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f012.contract.F012Key
import com.example.feature.f013.contract.F013Key
import com.example.feature.f014.contract.F014Key
import com.example.feature.f015.contract.F015Key

fun EntryProviderScope<NavKey>.f012Entries(backStack: NavBackStack<NavKey>) {
    entry<F012Key> {
        F012Screen(
            onF013Key = {
                backStack.add(F013Key)
            },
            onF014Key = {
                backStack.add(F014Key)
            },
            onF015Key = {
                backStack.add(F015Key)
            },
        )
    }
}

@Composable
internal fun F012Screen(
    onF013Key: () -> Unit,
    onF014Key: () -> Unit,
    onF015Key: () -> Unit,
) {
    Column {
        Text("F012")
        Button(onClick = onF013Key) {
            Text("F012 -> F013")
        }
        Button(onClick = onF014Key) {
            Text("F012 -> F014")
        }
        Button(onClick = onF015Key) {
            Text("F012 -> F015")
        }
    }
}
