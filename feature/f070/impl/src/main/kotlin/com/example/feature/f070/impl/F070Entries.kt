package com.example.feature.f070.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f070.contract.F070Key
import com.example.feature.f071.contract.F071Key
import com.example.feature.f072.contract.F072Key
import com.example.feature.f073.contract.F073Key

fun EntryProviderScope<NavKey>.f070Entries(backStack: NavBackStack<NavKey>) {
    entry<F070Key> {
        F070Screen(
            onF071Key = {
                backStack.add(F071Key)
            },
            onF072Key = {
                backStack.add(F072Key)
            },
            onF073Key = {
                backStack.add(F073Key)
            },
        )
    }
}

@Composable
internal fun F070Screen(
    onF071Key: () -> Unit,
    onF072Key: () -> Unit,
    onF073Key: () -> Unit,
) {
    Column {
        Text("F070")
        Button(onClick = onF071Key) {
            Text("F070 -> F071")
        }
        Button(onClick = onF072Key) {
            Text("F070 -> F072")
        }
        Button(onClick = onF073Key) {
            Text("F070 -> F073")
        }
    }
}
