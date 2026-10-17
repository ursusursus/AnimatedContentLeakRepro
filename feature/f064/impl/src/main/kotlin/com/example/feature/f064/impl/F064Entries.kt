package com.example.feature.f064.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f064.contract.F064Key
import com.example.feature.f065.contract.F065Key
import com.example.feature.f066.contract.F066Key
import com.example.feature.f067.contract.F067Key

fun EntryProviderScope<NavKey>.f064Entries(backStack: NavBackStack<NavKey>) {
    entry<F064Key> {
        F064Screen(
            onF065Key = {
                backStack.add(F065Key)
            },
            onF066Key = {
                backStack.add(F066Key)
            },
            onF067Key = {
                backStack.add(F067Key)
            },
        )
    }
}

@Composable
internal fun F064Screen(
    onF065Key: () -> Unit,
    onF066Key: () -> Unit,
    onF067Key: () -> Unit,
) {
    Column {
        Text("F064")
        Button(onClick = onF065Key) {
            Text("F064 -> F065")
        }
        Button(onClick = onF066Key) {
            Text("F064 -> F066")
        }
        Button(onClick = onF067Key) {
            Text("F064 -> F067")
        }
    }
}
