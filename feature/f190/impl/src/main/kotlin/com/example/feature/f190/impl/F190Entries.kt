package com.example.feature.f190.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f190.contract.F190Key
import com.example.feature.f191.contract.F191Key
import com.example.feature.f192.contract.F192Key
import com.example.feature.f193.contract.F193Key

fun EntryProviderScope<NavKey>.f190Entries(backStack: NavBackStack<NavKey>) {
    entry<F190Key> {
        F190Screen(
            onF191Key = {
                backStack.add(F191Key)
            },
            onF192Key = {
                backStack.add(F192Key)
            },
            onF193Key = {
                backStack.add(F193Key)
            },
        )
    }
}

@Composable
internal fun F190Screen(
    onF191Key: () -> Unit,
    onF192Key: () -> Unit,
    onF193Key: () -> Unit,
) {
    Column {
        Text("F190")
        Button(onClick = onF191Key) {
            Text("F190 -> F191")
        }
        Button(onClick = onF192Key) {
            Text("F190 -> F192")
        }
        Button(onClick = onF193Key) {
            Text("F190 -> F193")
        }
    }
}
