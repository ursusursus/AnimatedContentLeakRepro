package com.example.feature.f069.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f069.contract.F069Key
import com.example.feature.f070.contract.F070Key
import com.example.feature.f071.contract.F071Key
import com.example.feature.f072.contract.F072Key

fun EntryProviderScope<NavKey>.f069Entries(backStack: NavBackStack<NavKey>) {
    entry<F069Key> {
        F069Screen(
            onF070Key = {
                backStack.add(F070Key)
            },
            onF071Key = {
                backStack.add(F071Key)
            },
            onF072Key = {
                backStack.add(F072Key)
            },
        )
    }
}

@Composable
internal fun F069Screen(
    onF070Key: () -> Unit,
    onF071Key: () -> Unit,
    onF072Key: () -> Unit,
) {
    Column {
        Text("F069")
        Button(onClick = onF070Key) {
            Text("F069 -> F070")
        }
        Button(onClick = onF071Key) {
            Text("F069 -> F071")
        }
        Button(onClick = onF072Key) {
            Text("F069 -> F072")
        }
    }
}
