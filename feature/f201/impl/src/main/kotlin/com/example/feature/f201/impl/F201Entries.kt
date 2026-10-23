package com.example.feature.f201.impl

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
import com.example.feature.f204.contract.F204Key

fun EntryProviderScope<NavKey>.f201Entries(backStack: NavBackStack<NavKey>) {
    entry<F201Key> {
        F201Screen(
            onF202Key = {
                backStack.add(F202Key)
            },
            onF203Key = {
                backStack.add(F203Key)
            },
            onF204Key = {
                backStack.add(F204Key)
            },
        )
    }
}

@Composable
internal fun F201Screen(
    onF202Key: () -> Unit,
    onF203Key: () -> Unit,
    onF204Key: () -> Unit,
) {
    Column {
        Text("F201")
        Button(onClick = onF202Key) {
            Text("F201 -> F202")
        }
        Button(onClick = onF203Key) {
            Text("F201 -> F203")
        }
        Button(onClick = onF204Key) {
            Text("F201 -> F204")
        }
    }
}
