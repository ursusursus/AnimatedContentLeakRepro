package com.example.feature.f091.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f091.contract.F091Key
import com.example.feature.f092.contract.F092Key
import com.example.feature.f093.contract.F093Key
import com.example.feature.f094.contract.F094Key

fun EntryProviderScope<NavKey>.f091Entries(backStack: NavBackStack<NavKey>) {
    entry<F091Key> {
        F091Screen(
            onF092Key = {
                backStack.add(F092Key)
            },
            onF093Key = {
                backStack.add(F093Key)
            },
            onF094Key = {
                backStack.add(F094Key)
            },
        )
    }
}

@Composable
internal fun F091Screen(
    onF092Key: () -> Unit,
    onF093Key: () -> Unit,
    onF094Key: () -> Unit,
) {
    Column {
        Text("F091")
        Button(onClick = onF092Key) {
            Text("F091 -> F092")
        }
        Button(onClick = onF093Key) {
            Text("F091 -> F093")
        }
        Button(onClick = onF094Key) {
            Text("F091 -> F094")
        }
    }
}
