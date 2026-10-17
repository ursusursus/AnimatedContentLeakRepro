package com.example.feature.f187.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f187.contract.F187Key
import com.example.feature.f188.contract.F188Key
import com.example.feature.f189.contract.F189Key
import com.example.feature.f190.contract.F190Key

fun EntryProviderScope<NavKey>.f187Entries(backStack: NavBackStack<NavKey>) {
    entry<F187Key> {
        F187Screen(
            onF188Key = {
                backStack.add(F188Key)
            },
            onF189Key = {
                backStack.add(F189Key)
            },
            onF190Key = {
                backStack.add(F190Key)
            },
        )
    }
}

@Composable
internal fun F187Screen(
    onF188Key: () -> Unit,
    onF189Key: () -> Unit,
    onF190Key: () -> Unit,
) {
    Column {
        Text("F187")
        Button(onClick = onF188Key) {
            Text("F187 -> F188")
        }
        Button(onClick = onF189Key) {
            Text("F187 -> F189")
        }
        Button(onClick = onF190Key) {
            Text("F187 -> F190")
        }
    }
}
