package com.example.feature.f145.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f145.contract.F145Key
import com.example.feature.f146.contract.F146Key
import com.example.feature.f147.contract.F147Key
import com.example.feature.f148.contract.F148Key

fun EntryProviderScope<NavKey>.f145Entries(backStack: NavBackStack<NavKey>) {
    entry<F145Key> {
        F145Screen(
            onF146Key = {
                backStack.add(F146Key)
            },
            onF147Key = {
                backStack.add(F147Key)
            },
            onF148Key = {
                backStack.add(F148Key)
            },
        )
    }
}

@Composable
internal fun F145Screen(
    onF146Key: () -> Unit,
    onF147Key: () -> Unit,
    onF148Key: () -> Unit,
) {
    Column {
        Text("F145")
        Button(onClick = onF146Key) {
            Text("F145 -> F146")
        }
        Button(onClick = onF147Key) {
            Text("F145 -> F147")
        }
        Button(onClick = onF148Key) {
            Text("F145 -> F148")
        }
    }
}
