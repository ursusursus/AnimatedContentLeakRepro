package com.example.feature.f098.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f098.contract.F098Key
import com.example.feature.f099.contract.F099Key
import com.example.feature.f100.contract.F100Key
import com.example.feature.f101.contract.F101Key

fun EntryProviderScope<NavKey>.f098Entries(backStack: NavBackStack<NavKey>) {
    entry<F098Key> {
        F098Screen(
            onF099Key = {
                backStack.add(F099Key)
            },
            onF100Key = {
                backStack.add(F100Key)
            },
            onF101Key = {
                backStack.add(F101Key)
            },
        )
    }
}

@Composable
internal fun F098Screen(
    onF099Key: () -> Unit,
    onF100Key: () -> Unit,
    onF101Key: () -> Unit,
) {
    Column {
        Text("F098")
        Button(onClick = onF099Key) {
            Text("F098 -> F099")
        }
        Button(onClick = onF100Key) {
            Text("F098 -> F100")
        }
        Button(onClick = onF101Key) {
            Text("F098 -> F101")
        }
    }
}
