package com.example.feature.f188.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f188.contract.F188Key
import com.example.feature.f189.contract.F189Key
import com.example.feature.f190.contract.F190Key
import com.example.feature.f191.contract.F191Key

fun EntryProviderScope<NavKey>.f188Entries(backStack: NavBackStack<NavKey>) {
    entry<F188Key> {
        F188Screen(
            onF189Key = {
                backStack.add(F189Key)
            },
            onF190Key = {
                backStack.add(F190Key)
            },
            onF191Key = {
                backStack.add(F191Key)
            },
        )
    }
}

@Composable
internal fun F188Screen(
    onF189Key: () -> Unit,
    onF190Key: () -> Unit,
    onF191Key: () -> Unit,
) {
    Column {
        Text("F188")
        Button(onClick = onF189Key) {
            Text("F188 -> F189")
        }
        Button(onClick = onF190Key) {
            Text("F188 -> F190")
        }
        Button(onClick = onF191Key) {
            Text("F188 -> F191")
        }
    }
}
