package com.example.feature.f023.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f023.contract.F023Key
import com.example.feature.f024.contract.F024Key
import com.example.feature.f025.contract.F025Key
import com.example.feature.f026.contract.F026Key

fun EntryProviderScope<NavKey>.f023Entries(backStack: NavBackStack<NavKey>) {
    entry<F023Key> {
        F023Screen(
            onF024Key = {
                backStack.add(F024Key)
            },
            onF025Key = {
                backStack.add(F025Key)
            },
            onF026Key = {
                backStack.add(F026Key)
            },
        )
    }
}

@Composable
internal fun F023Screen(
    onF024Key: () -> Unit,
    onF025Key: () -> Unit,
    onF026Key: () -> Unit,
) {
    Column {
        Text("F023")
        Button(onClick = onF024Key) {
            Text("F023 -> F024")
        }
        Button(onClick = onF025Key) {
            Text("F023 -> F025")
        }
        Button(onClick = onF026Key) {
            Text("F023 -> F026")
        }
    }
}
