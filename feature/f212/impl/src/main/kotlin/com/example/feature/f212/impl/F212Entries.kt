package com.example.feature.f212.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f212.contract.F212Key
import com.example.feature.f213.contract.F213Key
import com.example.feature.f214.contract.F214Key
import com.example.feature.f215.contract.F215Key

fun EntryProviderScope<NavKey>.f212Entries(backStack: NavBackStack<NavKey>) {
    entry<F212Key> {
        F212Screen(
            onF213Key = {
                backStack.add(F213Key)
            },
            onF214Key = {
                backStack.add(F214Key)
            },
            onF215Key = {
                backStack.add(F215Key)
            },
        )
    }
}

@Composable
internal fun F212Screen(
    onF213Key: () -> Unit,
    onF214Key: () -> Unit,
    onF215Key: () -> Unit,
) {
    Column {
        Text("F212")
        Button(onClick = onF213Key) {
            Text("F212 -> F213")
        }
        Button(onClick = onF214Key) {
            Text("F212 -> F214")
        }
        Button(onClick = onF215Key) {
            Text("F212 -> F215")
        }
    }
}
