package com.example.feature.f099.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f099.contract.F099Key
import com.example.feature.f100.contract.F100Key
import com.example.feature.f101.contract.F101Key
import com.example.feature.f102.contract.F102Key

fun EntryProviderScope<NavKey>.f099Entries(backStack: NavBackStack<NavKey>) {
    entry<F099Key> {
        F099Screen(
            onF100Key = {
                backStack.add(F100Key)
            },
            onF101Key = {
                backStack.add(F101Key)
            },
            onF102Key = {
                backStack.add(F102Key)
            },
        )
    }
}

@Composable
internal fun F099Screen(
    onF100Key: () -> Unit,
    onF101Key: () -> Unit,
    onF102Key: () -> Unit,
) {
    Column {
        Text("F099")
        Button(onClick = onF100Key) {
            Text("F099 -> F100")
        }
        Button(onClick = onF101Key) {
            Text("F099 -> F101")
        }
        Button(onClick = onF102Key) {
            Text("F099 -> F102")
        }
    }
}
