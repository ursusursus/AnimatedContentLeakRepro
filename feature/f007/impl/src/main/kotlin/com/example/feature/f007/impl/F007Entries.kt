package com.example.feature.f007.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f007.contract.F007Key
import com.example.feature.f008.contract.F008Key
import com.example.feature.f009.contract.F009Key
import com.example.feature.f010.contract.F010Key

fun EntryProviderScope<NavKey>.f007Entries(backStack: NavBackStack<NavKey>) {
    entry<F007Key> {
        F007Screen(
            onF008Key = {
                backStack.add(F008Key)
            },
            onF009Key = {
                backStack.add(F009Key)
            },
            onF010Key = {
                backStack.add(F010Key)
            },
        )
    }
}

@Composable
internal fun F007Screen(
    onF008Key: () -> Unit,
    onF009Key: () -> Unit,
    onF010Key: () -> Unit,
) {
    Column {
        Text("F007")
        Button(onClick = onF008Key) {
            Text("F007 -> F008")
        }
        Button(onClick = onF009Key) {
            Text("F007 -> F009")
        }
        Button(onClick = onF010Key) {
            Text("F007 -> F010")
        }
    }
}
