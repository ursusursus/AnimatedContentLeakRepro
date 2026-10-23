package com.example.feature.f208.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f208.contract.F208Key
import com.example.feature.f209.contract.F209Key
import com.example.feature.f210.contract.F210Key
import com.example.feature.f211.contract.F211Key

fun EntryProviderScope<NavKey>.f208Entries(backStack: NavBackStack<NavKey>) {
    entry<F208Key> {
        F208Screen(
            onF209Key = {
                backStack.add(F209Key)
            },
            onF210Key = {
                backStack.add(F210Key)
            },
            onF211Key = {
                backStack.add(F211Key)
            },
        )
    }
}

@Composable
internal fun F208Screen(
    onF209Key: () -> Unit,
    onF210Key: () -> Unit,
    onF211Key: () -> Unit,
) {
    Column {
        Text("F208")
        Button(onClick = onF209Key) {
            Text("F208 -> F209")
        }
        Button(onClick = onF210Key) {
            Text("F208 -> F210")
        }
        Button(onClick = onF211Key) {
            Text("F208 -> F211")
        }
    }
}
