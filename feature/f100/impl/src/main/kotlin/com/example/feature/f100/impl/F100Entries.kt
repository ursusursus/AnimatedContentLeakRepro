package com.example.feature.f100.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f100.contract.F100Key
import com.example.feature.f101.contract.F101Key
import com.example.feature.f102.contract.F102Key
import com.example.feature.f103.contract.F103Key

fun EntryProviderScope<NavKey>.f100Entries(backStack: NavBackStack<NavKey>) {
    entry<F100Key> {
        F100Screen(
            onF101Key = {
                backStack.add(F101Key)
            },
            onF102Key = {
                backStack.add(F102Key)
            },
            onF103Key = {
                backStack.add(F103Key)
            },
        )
    }
}

@Composable
internal fun F100Screen(
    onF101Key: () -> Unit,
    onF102Key: () -> Unit,
    onF103Key: () -> Unit,
) {
    Column {
        Text("F100")
        Button(onClick = onF101Key) {
            Text("F100 -> F101")
        }
        Button(onClick = onF102Key) {
            Text("F100 -> F102")
        }
        Button(onClick = onF103Key) {
            Text("F100 -> F103")
        }
    }
}
