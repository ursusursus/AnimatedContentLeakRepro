package com.example.feature.f214.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f214.contract.F214Key
import com.example.feature.f215.contract.F215Key
import com.example.feature.f216.contract.F216Key
import com.example.feature.f217.contract.F217Key

fun EntryProviderScope<NavKey>.f214Entries(backStack: NavBackStack<NavKey>) {
    entry<F214Key> {
        F214Screen(
            onF215Key = {
                backStack.add(F215Key)
            },
            onF216Key = {
                backStack.add(F216Key)
            },
            onF217Key = {
                backStack.add(F217Key)
            },
        )
    }
}

@Composable
internal fun F214Screen(
    onF215Key: () -> Unit,
    onF216Key: () -> Unit,
    onF217Key: () -> Unit,
) {
    Column {
        Text("F214")
        Button(onClick = onF215Key) {
            Text("F214 -> F215")
        }
        Button(onClick = onF216Key) {
            Text("F214 -> F216")
        }
        Button(onClick = onF217Key) {
            Text("F214 -> F217")
        }
    }
}
