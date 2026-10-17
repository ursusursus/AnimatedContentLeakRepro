package com.example.feature.f095.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f095.contract.F095Key
import com.example.feature.f096.contract.F096Key
import com.example.feature.f097.contract.F097Key
import com.example.feature.f098.contract.F098Key

fun EntryProviderScope<NavKey>.f095Entries(backStack: NavBackStack<NavKey>) {
    entry<F095Key> {
        F095Screen(
            onF096Key = {
                backStack.add(F096Key)
            },
            onF097Key = {
                backStack.add(F097Key)
            },
            onF098Key = {
                backStack.add(F098Key)
            },
        )
    }
}

@Composable
internal fun F095Screen(
    onF096Key: () -> Unit,
    onF097Key: () -> Unit,
    onF098Key: () -> Unit,
) {
    Column {
        Text("F095")
        Button(onClick = onF096Key) {
            Text("F095 -> F096")
        }
        Button(onClick = onF097Key) {
            Text("F095 -> F097")
        }
        Button(onClick = onF098Key) {
            Text("F095 -> F098")
        }
    }
}
