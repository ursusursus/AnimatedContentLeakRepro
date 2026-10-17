package com.example.feature.f087.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f087.contract.F087Key
import com.example.feature.f088.contract.F088Key
import com.example.feature.f089.contract.F089Key
import com.example.feature.f090.contract.F090Key

fun EntryProviderScope<NavKey>.f087Entries(backStack: NavBackStack<NavKey>) {
    entry<F087Key> {
        F087Screen(
            onF088Key = {
                backStack.add(F088Key)
            },
            onF089Key = {
                backStack.add(F089Key)
            },
            onF090Key = {
                backStack.add(F090Key)
            },
        )
    }
}

@Composable
internal fun F087Screen(
    onF088Key: () -> Unit,
    onF089Key: () -> Unit,
    onF090Key: () -> Unit,
) {
    Column {
        Text("F087")
        Button(onClick = onF088Key) {
            Text("F087 -> F088")
        }
        Button(onClick = onF089Key) {
            Text("F087 -> F089")
        }
        Button(onClick = onF090Key) {
            Text("F087 -> F090")
        }
    }
}
