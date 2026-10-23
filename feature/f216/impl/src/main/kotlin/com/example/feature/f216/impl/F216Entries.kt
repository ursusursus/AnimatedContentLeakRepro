package com.example.feature.f216.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f216.contract.F216Key
import com.example.feature.f217.contract.F217Key
import com.example.feature.f218.contract.F218Key
import com.example.feature.f219.contract.F219Key

fun EntryProviderScope<NavKey>.f216Entries(backStack: NavBackStack<NavKey>) {
    entry<F216Key> {
        F216Screen(
            onF217Key = {
                backStack.add(F217Key)
            },
            onF218Key = {
                backStack.add(F218Key)
            },
            onF219Key = {
                backStack.add(F219Key)
            },
        )
    }
}

@Composable
internal fun F216Screen(
    onF217Key: () -> Unit,
    onF218Key: () -> Unit,
    onF219Key: () -> Unit,
) {
    Column {
        Text("F216")
        Button(onClick = onF217Key) {
            Text("F216 -> F217")
        }
        Button(onClick = onF218Key) {
            Text("F216 -> F218")
        }
        Button(onClick = onF219Key) {
            Text("F216 -> F219")
        }
    }
}
