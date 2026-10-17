package com.example.feature.f016.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f016.contract.F016Key
import com.example.feature.f017.contract.F017Key
import com.example.feature.f018.contract.F018Key
import com.example.feature.f019.contract.F019Key

fun EntryProviderScope<NavKey>.f016Entries(backStack: NavBackStack<NavKey>) {
    entry<F016Key> {
        F016Screen(
            onF017Key = {
                backStack.add(F017Key)
            },
            onF018Key = {
                backStack.add(F018Key)
            },
            onF019Key = {
                backStack.add(F019Key)
            },
        )
    }
}

@Composable
internal fun F016Screen(
    onF017Key: () -> Unit,
    onF018Key: () -> Unit,
    onF019Key: () -> Unit,
) {
    Column {
        Text("F016")
        Button(onClick = onF017Key) {
            Text("F016 -> F017")
        }
        Button(onClick = onF018Key) {
            Text("F016 -> F018")
        }
        Button(onClick = onF019Key) {
            Text("F016 -> F019")
        }
    }
}
