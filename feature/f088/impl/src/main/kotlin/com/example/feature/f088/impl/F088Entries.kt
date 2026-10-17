package com.example.feature.f088.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f088.contract.F088Key
import com.example.feature.f089.contract.F089Key
import com.example.feature.f090.contract.F090Key
import com.example.feature.f091.contract.F091Key

fun EntryProviderScope<NavKey>.f088Entries(backStack: NavBackStack<NavKey>) {
    entry<F088Key> {
        F088Screen(
            onF089Key = {
                backStack.add(F089Key)
            },
            onF090Key = {
                backStack.add(F090Key)
            },
            onF091Key = {
                backStack.add(F091Key)
            },
        )
    }
}

@Composable
internal fun F088Screen(
    onF089Key: () -> Unit,
    onF090Key: () -> Unit,
    onF091Key: () -> Unit,
) {
    Column {
        Text("F088")
        Button(onClick = onF089Key) {
            Text("F088 -> F089")
        }
        Button(onClick = onF090Key) {
            Text("F088 -> F090")
        }
        Button(onClick = onF091Key) {
            Text("F088 -> F091")
        }
    }
}
