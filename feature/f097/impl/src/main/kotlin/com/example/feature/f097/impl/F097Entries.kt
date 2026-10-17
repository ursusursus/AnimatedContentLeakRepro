package com.example.feature.f097.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f097.contract.F097Key
import com.example.feature.f098.contract.F098Key
import com.example.feature.f099.contract.F099Key
import com.example.feature.f100.contract.F100Key

fun EntryProviderScope<NavKey>.f097Entries(backStack: NavBackStack<NavKey>) {
    entry<F097Key> {
        F097Screen(
            onF098Key = {
                backStack.add(F098Key)
            },
            onF099Key = {
                backStack.add(F099Key)
            },
            onF100Key = {
                backStack.add(F100Key)
            },
        )
    }
}

@Composable
internal fun F097Screen(
    onF098Key: () -> Unit,
    onF099Key: () -> Unit,
    onF100Key: () -> Unit,
) {
    Column {
        Text("F097")
        Button(onClick = onF098Key) {
            Text("F097 -> F098")
        }
        Button(onClick = onF099Key) {
            Text("F097 -> F099")
        }
        Button(onClick = onF100Key) {
            Text("F097 -> F100")
        }
    }
}
