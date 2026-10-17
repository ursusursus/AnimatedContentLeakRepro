package com.example.feature.f075.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f075.contract.F075Key
import com.example.feature.f076.contract.F076Key
import com.example.feature.f077.contract.F077Key
import com.example.feature.f078.contract.F078Key

fun EntryProviderScope<NavKey>.f075Entries(backStack: NavBackStack<NavKey>) {
    entry<F075Key> {
        F075Screen(
            onF076Key = {
                backStack.add(F076Key)
            },
            onF077Key = {
                backStack.add(F077Key)
            },
            onF078Key = {
                backStack.add(F078Key)
            },
        )
    }
}

@Composable
internal fun F075Screen(
    onF076Key: () -> Unit,
    onF077Key: () -> Unit,
    onF078Key: () -> Unit,
) {
    Column {
        Text("F075")
        Button(onClick = onF076Key) {
            Text("F075 -> F076")
        }
        Button(onClick = onF077Key) {
            Text("F075 -> F077")
        }
        Button(onClick = onF078Key) {
            Text("F075 -> F078")
        }
    }
}
