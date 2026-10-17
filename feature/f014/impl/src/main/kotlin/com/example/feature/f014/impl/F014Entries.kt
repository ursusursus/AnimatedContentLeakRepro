package com.example.feature.f014.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f014.contract.F014Key
import com.example.feature.f015.contract.F015Key
import com.example.feature.f016.contract.F016Key
import com.example.feature.f017.contract.F017Key

fun EntryProviderScope<NavKey>.f014Entries(backStack: NavBackStack<NavKey>) {
    entry<F014Key> {
        F014Screen(
            onF015Key = {
                backStack.add(F015Key)
            },
            onF016Key = {
                backStack.add(F016Key)
            },
            onF017Key = {
                backStack.add(F017Key)
            },
        )
    }
}

@Composable
internal fun F014Screen(
    onF015Key: () -> Unit,
    onF016Key: () -> Unit,
    onF017Key: () -> Unit,
) {
    Column {
        Text("F014")
        Button(onClick = onF015Key) {
            Text("F014 -> F015")
        }
        Button(onClick = onF016Key) {
            Text("F014 -> F016")
        }
        Button(onClick = onF017Key) {
            Text("F014 -> F017")
        }
    }
}
