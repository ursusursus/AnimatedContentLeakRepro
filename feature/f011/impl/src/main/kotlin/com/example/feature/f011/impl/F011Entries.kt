package com.example.feature.f011.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f011.contract.F011Key
import com.example.feature.f012.contract.F012Key
import com.example.feature.f013.contract.F013Key
import com.example.feature.f014.contract.F014Key

fun EntryProviderScope<NavKey>.f011Entries(backStack: NavBackStack<NavKey>) {
    entry<F011Key> {
        F011Screen(
            onF012Key = {
                backStack.add(F012Key)
            },
            onF013Key = {
                backStack.add(F013Key)
            },
            onF014Key = {
                backStack.add(F014Key)
            },
        )
    }
}

@Composable
internal fun F011Screen(
    onF012Key: () -> Unit,
    onF013Key: () -> Unit,
    onF014Key: () -> Unit,
) {
    Column {
        Text("F011")
        Button(onClick = onF012Key) {
            Text("F011 -> F012")
        }
        Button(onClick = onF013Key) {
            Text("F011 -> F013")
        }
        Button(onClick = onF014Key) {
            Text("F011 -> F014")
        }
    }
}
