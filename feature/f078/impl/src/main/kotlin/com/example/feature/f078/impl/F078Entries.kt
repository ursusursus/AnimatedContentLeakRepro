package com.example.feature.f078.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f078.contract.F078Key
import com.example.feature.f079.contract.F079Key
import com.example.feature.f080.contract.F080Key
import com.example.feature.f081.contract.F081Key

fun EntryProviderScope<NavKey>.f078Entries(backStack: NavBackStack<NavKey>) {
    entry<F078Key> {
        F078Screen(
            onF079Key = {
                backStack.add(F079Key)
            },
            onF080Key = {
                backStack.add(F080Key)
            },
            onF081Key = {
                backStack.add(F081Key)
            },
        )
    }
}

@Composable
internal fun F078Screen(
    onF079Key: () -> Unit,
    onF080Key: () -> Unit,
    onF081Key: () -> Unit,
) {
    Column {
        Text("F078")
        Button(onClick = onF079Key) {
            Text("F078 -> F079")
        }
        Button(onClick = onF080Key) {
            Text("F078 -> F080")
        }
        Button(onClick = onF081Key) {
            Text("F078 -> F081")
        }
    }
}
