package com.example.feature.f200.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f201.contract.F201Key
import com.example.feature.f202.contract.F202Key
import com.example.feature.f203.contract.F203Key
import com.example.feature.f200.contract.F200Key

fun EntryProviderScope<NavKey>.f200Entries(backStack: NavBackStack<NavKey>) {
    entry<F200Key> {
        F200Screen(
            onF201Key = {
                backStack.add(F201Key)
            },
            onF202Key = {
                backStack.add(F202Key)
            },
            onF203Key = {
                backStack.add(F203Key)
            },
        )
    }
}

@Composable
internal fun F200Screen(
    onF201Key: () -> Unit,
    onF202Key: () -> Unit,
    onF203Key: () -> Unit,
) {
    Column {
        Text("F200")
        Button(onClick = onF201Key) {
            Text("F200 -> F201")
        }
        Button(onClick = onF202Key) {
            Text("F200 -> F202")
        }
        Button(onClick = onF203Key) {
            Text("F200 -> F203")
        }
    }
}
