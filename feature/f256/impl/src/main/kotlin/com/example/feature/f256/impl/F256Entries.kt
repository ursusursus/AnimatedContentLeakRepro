package com.example.feature.f256.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f256.contract.F256Key
import com.example.feature.f257.contract.F257Key
import com.example.feature.f258.contract.F258Key
import com.example.feature.f259.contract.F259Key

fun EntryProviderScope<NavKey>.f256Entries(backStack: NavBackStack<NavKey>) {
    entry<F256Key> {
        F256Screen(
            onF257Key = {
                backStack.add(F257Key)
            },
            onF258Key = {
                backStack.add(F258Key)
            },
            onF259Key = {
                backStack.add(F259Key)
            },
        )
    }
}

@Composable
internal fun F256Screen(
    onF257Key: () -> Unit,
    onF258Key: () -> Unit,
    onF259Key: () -> Unit,
) {
    Column {
        Text("F256")
        Button(onClick = onF257Key) {
            Text("F256 -> F257")
        }
        Button(onClick = onF258Key) {
            Text("F256 -> F258")
        }
        Button(onClick = onF259Key) {
            Text("F256 -> F259")
        }
    }
}
