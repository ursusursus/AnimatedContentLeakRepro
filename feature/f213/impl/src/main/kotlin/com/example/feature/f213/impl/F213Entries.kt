package com.example.feature.f213.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f213.contract.F213Key
import com.example.feature.f214.contract.F214Key
import com.example.feature.f215.contract.F215Key
import com.example.feature.f216.contract.F216Key

fun EntryProviderScope<NavKey>.f213Entries(backStack: NavBackStack<NavKey>) {
    entry<F213Key> {
        F213Screen(
            onF214Key = {
                backStack.add(F214Key)
            },
            onF215Key = {
                backStack.add(F215Key)
            },
            onF216Key = {
                backStack.add(F216Key)
            },
        )
    }
}

@Composable
internal fun F213Screen(
    onF214Key: () -> Unit,
    onF215Key: () -> Unit,
    onF216Key: () -> Unit,
) {
    Column {
        Text("F213")
        Button(onClick = onF214Key) {
            Text("F213 -> F214")
        }
        Button(onClick = onF215Key) {
            Text("F213 -> F215")
        }
        Button(onClick = onF216Key) {
            Text("F213 -> F216")
        }
    }
}
