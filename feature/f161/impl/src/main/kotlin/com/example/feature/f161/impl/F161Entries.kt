package com.example.feature.f161.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f161.contract.F161Key
import com.example.feature.f162.contract.F162Key
import com.example.feature.f163.contract.F163Key
import com.example.feature.f164.contract.F164Key

fun EntryProviderScope<NavKey>.f161Entries(backStack: NavBackStack<NavKey>) {
    entry<F161Key> {
        F161Screen(
            onF162Key = {
                backStack.add(F162Key)
            },
            onF163Key = {
                backStack.add(F163Key)
            },
            onF164Key = {
                backStack.add(F164Key)
            },
        )
    }
}

@Composable
internal fun F161Screen(
    onF162Key: () -> Unit,
    onF163Key: () -> Unit,
    onF164Key: () -> Unit,
) {
    Column {
        Text("F161")
        Button(onClick = onF162Key) {
            Text("F161 -> F162")
        }
        Button(onClick = onF163Key) {
            Text("F161 -> F163")
        }
        Button(onClick = onF164Key) {
            Text("F161 -> F164")
        }
    }
}
