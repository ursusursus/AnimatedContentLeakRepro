package com.example.feature.f015.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f015.contract.F015Key
import com.example.feature.f016.contract.F016Key
import com.example.feature.f017.contract.F017Key
import com.example.feature.f018.contract.F018Key

fun EntryProviderScope<NavKey>.f015Entries(backStack: NavBackStack<NavKey>) {
    entry<F015Key> {
        F015Screen(
            onF016Key = {
                backStack.add(F016Key)
            },
            onF017Key = {
                backStack.add(F017Key)
            },
            onF018Key = {
                backStack.add(F018Key)
            },
        )
    }
}

@Composable
internal fun F015Screen(
    onF016Key: () -> Unit,
    onF017Key: () -> Unit,
    onF018Key: () -> Unit,
) {
    Column {
        Text("F015")
        Button(onClick = onF016Key) {
            Text("F015 -> F016")
        }
        Button(onClick = onF017Key) {
            Text("F015 -> F017")
        }
        Button(onClick = onF018Key) {
            Text("F015 -> F018")
        }
    }
}
