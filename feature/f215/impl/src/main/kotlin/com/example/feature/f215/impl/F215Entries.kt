package com.example.feature.f215.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f215.contract.F215Key
import com.example.feature.f216.contract.F216Key
import com.example.feature.f217.contract.F217Key
import com.example.feature.f218.contract.F218Key

fun EntryProviderScope<NavKey>.f215Entries(backStack: NavBackStack<NavKey>) {
    entry<F215Key> {
        F215Screen(
            onF216Key = {
                backStack.add(F216Key)
            },
            onF217Key = {
                backStack.add(F217Key)
            },
            onF218Key = {
                backStack.add(F218Key)
            },
        )
    }
}

@Composable
internal fun F215Screen(
    onF216Key: () -> Unit,
    onF217Key: () -> Unit,
    onF218Key: () -> Unit,
) {
    Column {
        Text("F215")
        Button(onClick = onF216Key) {
            Text("F215 -> F216")
        }
        Button(onClick = onF217Key) {
            Text("F215 -> F217")
        }
        Button(onClick = onF218Key) {
            Text("F215 -> F218")
        }
    }
}
