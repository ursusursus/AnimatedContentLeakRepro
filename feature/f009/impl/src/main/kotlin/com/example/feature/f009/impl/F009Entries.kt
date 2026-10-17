package com.example.feature.f009.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f009.contract.F009Key
import com.example.feature.f010.contract.F010Key
import com.example.feature.f011.contract.F011Key
import com.example.feature.f012.contract.F012Key

fun EntryProviderScope<NavKey>.f009Entries(backStack: NavBackStack<NavKey>) {
    entry<F009Key> {
        F009Screen(
            onF010Key = {
                backStack.add(F010Key)
            },
            onF011Key = {
                backStack.add(F011Key)
            },
            onF012Key = {
                backStack.add(F012Key)
            },
        )
    }
}

@Composable
internal fun F009Screen(
    onF010Key: () -> Unit,
    onF011Key: () -> Unit,
    onF012Key: () -> Unit,
) {
    Column {
        Text("F009")
        Button(onClick = onF010Key) {
            Text("F009 -> F010")
        }
        Button(onClick = onF011Key) {
            Text("F009 -> F011")
        }
        Button(onClick = onF012Key) {
            Text("F009 -> F012")
        }
    }
}
