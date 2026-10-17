package com.example.feature.f160.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f160.contract.F160Key
import com.example.feature.f161.contract.F161Key
import com.example.feature.f162.contract.F162Key
import com.example.feature.f163.contract.F163Key

fun EntryProviderScope<NavKey>.f160Entries(backStack: NavBackStack<NavKey>) {
    entry<F160Key> {
        F160Screen(
            onF161Key = {
                backStack.add(F161Key)
            },
            onF162Key = {
                backStack.add(F162Key)
            },
            onF163Key = {
                backStack.add(F163Key)
            },
        )
    }
}

@Composable
internal fun F160Screen(
    onF161Key: () -> Unit,
    onF162Key: () -> Unit,
    onF163Key: () -> Unit,
) {
    Column {
        Text("F160")
        Button(onClick = onF161Key) {
            Text("F160 -> F161")
        }
        Button(onClick = onF162Key) {
            Text("F160 -> F162")
        }
        Button(onClick = onF163Key) {
            Text("F160 -> F163")
        }
    }
}
