package com.example.feature.f143.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f143.contract.F143Key
import com.example.feature.f144.contract.F144Key
import com.example.feature.f145.contract.F145Key
import com.example.feature.f146.contract.F146Key

fun EntryProviderScope<NavKey>.f143Entries(backStack: NavBackStack<NavKey>) {
    entry<F143Key> {
        F143Screen(
            onF144Key = {
                backStack.add(F144Key)
            },
            onF145Key = {
                backStack.add(F145Key)
            },
            onF146Key = {
                backStack.add(F146Key)
            },
        )
    }
}

@Composable
internal fun F143Screen(
    onF144Key: () -> Unit,
    onF145Key: () -> Unit,
    onF146Key: () -> Unit,
) {
    Column {
        Text("F143")
        Button(onClick = onF144Key) {
            Text("F143 -> F144")
        }
        Button(onClick = onF145Key) {
            Text("F143 -> F145")
        }
        Button(onClick = onF146Key) {
            Text("F143 -> F146")
        }
    }
}
