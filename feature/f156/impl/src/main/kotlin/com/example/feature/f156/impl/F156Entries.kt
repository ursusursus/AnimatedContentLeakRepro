package com.example.feature.f156.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f156.contract.F156Key
import com.example.feature.f157.contract.F157Key
import com.example.feature.f158.contract.F158Key
import com.example.feature.f159.contract.F159Key

fun EntryProviderScope<NavKey>.f156Entries(backStack: NavBackStack<NavKey>) {
    entry<F156Key> {
        F156Screen(
            onF157Key = {
                backStack.add(F157Key)
            },
            onF158Key = {
                backStack.add(F158Key)
            },
            onF159Key = {
                backStack.add(F159Key)
            },
        )
    }
}

@Composable
internal fun F156Screen(
    onF157Key: () -> Unit,
    onF158Key: () -> Unit,
    onF159Key: () -> Unit,
) {
    Column {
        Text("F156")
        Button(onClick = onF157Key) {
            Text("F156 -> F157")
        }
        Button(onClick = onF158Key) {
            Text("F156 -> F158")
        }
        Button(onClick = onF159Key) {
            Text("F156 -> F159")
        }
    }
}
