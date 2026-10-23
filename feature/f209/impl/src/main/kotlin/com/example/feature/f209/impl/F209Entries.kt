package com.example.feature.f209.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f209.contract.F209Key
import com.example.feature.f210.contract.F210Key
import com.example.feature.f211.contract.F211Key
import com.example.feature.f212.contract.F212Key

fun EntryProviderScope<NavKey>.f209Entries(backStack: NavBackStack<NavKey>) {
    entry<F209Key> {
        F209Screen(
            onF210Key = {
                backStack.add(F210Key)
            },
            onF211Key = {
                backStack.add(F211Key)
            },
            onF212Key = {
                backStack.add(F212Key)
            },
        )
    }
}

@Composable
internal fun F209Screen(
    onF210Key: () -> Unit,
    onF211Key: () -> Unit,
    onF212Key: () -> Unit,
) {
    Column {
        Text("F209")
        Button(onClick = onF210Key) {
            Text("F209 -> F210")
        }
        Button(onClick = onF211Key) {
            Text("F209 -> F211")
        }
        Button(onClick = onF212Key) {
            Text("F209 -> F212")
        }
    }
}
