package com.example.feature.f157.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f157.contract.F157Key
import com.example.feature.f158.contract.F158Key
import com.example.feature.f159.contract.F159Key
import com.example.feature.f160.contract.F160Key

fun EntryProviderScope<NavKey>.f157Entries(backStack: NavBackStack<NavKey>) {
    entry<F157Key> {
        F157Screen(
            onF158Key = {
                backStack.add(F158Key)
            },
            onF159Key = {
                backStack.add(F159Key)
            },
            onF160Key = {
                backStack.add(F160Key)
            },
        )
    }
}

@Composable
internal fun F157Screen(
    onF158Key: () -> Unit,
    onF159Key: () -> Unit,
    onF160Key: () -> Unit,
) {
    Column {
        Text("F157")
        Button(onClick = onF158Key) {
            Text("F157 -> F158")
        }
        Button(onClick = onF159Key) {
            Text("F157 -> F159")
        }
        Button(onClick = onF160Key) {
            Text("F157 -> F160")
        }
    }
}
