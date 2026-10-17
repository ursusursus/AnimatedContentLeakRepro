package com.example.feature.f096.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f096.contract.F096Key
import com.example.feature.f097.contract.F097Key
import com.example.feature.f098.contract.F098Key
import com.example.feature.f099.contract.F099Key

fun EntryProviderScope<NavKey>.f096Entries(backStack: NavBackStack<NavKey>) {
    entry<F096Key> {
        F096Screen(
            onF097Key = {
                backStack.add(F097Key)
            },
            onF098Key = {
                backStack.add(F098Key)
            },
            onF099Key = {
                backStack.add(F099Key)
            },
        )
    }
}

@Composable
internal fun F096Screen(
    onF097Key: () -> Unit,
    onF098Key: () -> Unit,
    onF099Key: () -> Unit,
) {
    Column {
        Text("F096")
        Button(onClick = onF097Key) {
            Text("F096 -> F097")
        }
        Button(onClick = onF098Key) {
            Text("F096 -> F098")
        }
        Button(onClick = onF099Key) {
            Text("F096 -> F099")
        }
    }
}
