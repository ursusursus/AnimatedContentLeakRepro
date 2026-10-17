package com.example.feature.f178.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f178.contract.F178Key
import com.example.feature.f179.contract.F179Key
import com.example.feature.f180.contract.F180Key
import com.example.feature.f181.contract.F181Key

fun EntryProviderScope<NavKey>.f178Entries(backStack: NavBackStack<NavKey>) {
    entry<F178Key> {
        F178Screen(
            onF179Key = {
                backStack.add(F179Key)
            },
            onF180Key = {
                backStack.add(F180Key)
            },
            onF181Key = {
                backStack.add(F181Key)
            },
        )
    }
}

@Composable
internal fun F178Screen(
    onF179Key: () -> Unit,
    onF180Key: () -> Unit,
    onF181Key: () -> Unit,
) {
    Column {
        Text("F178")
        Button(onClick = onF179Key) {
            Text("F178 -> F179")
        }
        Button(onClick = onF180Key) {
            Text("F178 -> F180")
        }
        Button(onClick = onF181Key) {
            Text("F178 -> F181")
        }
    }
}
