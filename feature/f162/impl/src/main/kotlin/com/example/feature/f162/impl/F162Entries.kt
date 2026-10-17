package com.example.feature.f162.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f162.contract.F162Key
import com.example.feature.f163.contract.F163Key
import com.example.feature.f164.contract.F164Key
import com.example.feature.f165.contract.F165Key

fun EntryProviderScope<NavKey>.f162Entries(backStack: NavBackStack<NavKey>) {
    entry<F162Key> {
        F162Screen(
            onF163Key = {
                backStack.add(F163Key)
            },
            onF164Key = {
                backStack.add(F164Key)
            },
            onF165Key = {
                backStack.add(F165Key)
            },
        )
    }
}

@Composable
internal fun F162Screen(
    onF163Key: () -> Unit,
    onF164Key: () -> Unit,
    onF165Key: () -> Unit,
) {
    Column {
        Text("F162")
        Button(onClick = onF163Key) {
            Text("F162 -> F163")
        }
        Button(onClick = onF164Key) {
            Text("F162 -> F164")
        }
        Button(onClick = onF165Key) {
            Text("F162 -> F165")
        }
    }
}
