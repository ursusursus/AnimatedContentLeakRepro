package com.example.feature.f085.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f085.contract.F085Key
import com.example.feature.f086.contract.F086Key
import com.example.feature.f087.contract.F087Key
import com.example.feature.f088.contract.F088Key

fun EntryProviderScope<NavKey>.f085Entries(backStack: NavBackStack<NavKey>) {
    entry<F085Key> {
        F085Screen(
            onF086Key = {
                backStack.add(F086Key)
            },
            onF087Key = {
                backStack.add(F087Key)
            },
            onF088Key = {
                backStack.add(F088Key)
            },
        )
    }
}

@Composable
internal fun F085Screen(
    onF086Key: () -> Unit,
    onF087Key: () -> Unit,
    onF088Key: () -> Unit,
) {
    Column {
        Text("F085")
        Button(onClick = onF086Key) {
            Text("F085 -> F086")
        }
        Button(onClick = onF087Key) {
            Text("F085 -> F087")
        }
        Button(onClick = onF088Key) {
            Text("F085 -> F088")
        }
    }
}
