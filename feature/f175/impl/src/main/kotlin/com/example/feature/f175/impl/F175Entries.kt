package com.example.feature.f175.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f175.contract.F175Key
import com.example.feature.f176.contract.F176Key
import com.example.feature.f177.contract.F177Key
import com.example.feature.f178.contract.F178Key

fun EntryProviderScope<NavKey>.f175Entries(backStack: NavBackStack<NavKey>) {
    entry<F175Key> {
        F175Screen(
            onF176Key = {
                backStack.add(F176Key)
            },
            onF177Key = {
                backStack.add(F177Key)
            },
            onF178Key = {
                backStack.add(F178Key)
            },
        )
    }
}

@Composable
internal fun F175Screen(
    onF176Key: () -> Unit,
    onF177Key: () -> Unit,
    onF178Key: () -> Unit,
) {
    Column {
        Text("F175")
        Button(onClick = onF176Key) {
            Text("F175 -> F176")
        }
        Button(onClick = onF177Key) {
            Text("F175 -> F177")
        }
        Button(onClick = onF178Key) {
            Text("F175 -> F178")
        }
    }
}
