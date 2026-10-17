package com.example.feature.f042.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f042.contract.F042Key
import com.example.feature.f043.contract.F043Key
import com.example.feature.f044.contract.F044Key
import com.example.feature.f045.contract.F045Key

fun EntryProviderScope<NavKey>.f042Entries(backStack: NavBackStack<NavKey>) {
    entry<F042Key> {
        F042Screen(
            onF043Key = {
                backStack.add(F043Key)
            },
            onF044Key = {
                backStack.add(F044Key)
            },
            onF045Key = {
                backStack.add(F045Key)
            },
        )
    }
}

@Composable
internal fun F042Screen(
    onF043Key: () -> Unit,
    onF044Key: () -> Unit,
    onF045Key: () -> Unit,
) {
    Column {
        Text("F042")
        Button(onClick = onF043Key) {
            Text("F042 -> F043")
        }
        Button(onClick = onF044Key) {
            Text("F042 -> F044")
        }
        Button(onClick = onF045Key) {
            Text("F042 -> F045")
        }
    }
}
