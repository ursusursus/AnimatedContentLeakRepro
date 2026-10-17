package com.example.feature.f158.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f158.contract.F158Key
import com.example.feature.f159.contract.F159Key
import com.example.feature.f160.contract.F160Key
import com.example.feature.f161.contract.F161Key

fun EntryProviderScope<NavKey>.f158Entries(backStack: NavBackStack<NavKey>) {
    entry<F158Key> {
        F158Screen(
            onF159Key = {
                backStack.add(F159Key)
            },
            onF160Key = {
                backStack.add(F160Key)
            },
            onF161Key = {
                backStack.add(F161Key)
            },
        )
    }
}

@Composable
internal fun F158Screen(
    onF159Key: () -> Unit,
    onF160Key: () -> Unit,
    onF161Key: () -> Unit,
) {
    Column {
        Text("F158")
        Button(onClick = onF159Key) {
            Text("F158 -> F159")
        }
        Button(onClick = onF160Key) {
            Text("F158 -> F160")
        }
        Button(onClick = onF161Key) {
            Text("F158 -> F161")
        }
    }
}
