package com.example.feature.f159.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f159.contract.F159Key
import com.example.feature.f160.contract.F160Key
import com.example.feature.f161.contract.F161Key
import com.example.feature.f162.contract.F162Key

fun EntryProviderScope<NavKey>.f159Entries(backStack: NavBackStack<NavKey>) {
    entry<F159Key> {
        F159Screen(
            onF160Key = {
                backStack.add(F160Key)
            },
            onF161Key = {
                backStack.add(F161Key)
            },
            onF162Key = {
                backStack.add(F162Key)
            },
        )
    }
}

@Composable
internal fun F159Screen(
    onF160Key: () -> Unit,
    onF161Key: () -> Unit,
    onF162Key: () -> Unit,
) {
    Column {
        Text("F159")
        Button(onClick = onF160Key) {
            Text("F159 -> F160")
        }
        Button(onClick = onF161Key) {
            Text("F159 -> F161")
        }
        Button(onClick = onF162Key) {
            Text("F159 -> F162")
        }
    }
}
