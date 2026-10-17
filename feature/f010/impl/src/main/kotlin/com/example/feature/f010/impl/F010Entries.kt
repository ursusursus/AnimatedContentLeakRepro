package com.example.feature.f010.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f010.contract.F010Key
import com.example.feature.f011.contract.F011Key
import com.example.feature.f012.contract.F012Key
import com.example.feature.f013.contract.F013Key

fun EntryProviderScope<NavKey>.f010Entries(backStack: NavBackStack<NavKey>) {
    entry<F010Key> {
        F010Screen(
            onF011Key = {
                backStack.add(F011Key)
            },
            onF012Key = {
                backStack.add(F012Key)
            },
            onF013Key = {
                backStack.add(F013Key)
            },
        )
    }
}

@Composable
internal fun F010Screen(
    onF011Key: () -> Unit,
    onF012Key: () -> Unit,
    onF013Key: () -> Unit,
) {
    Column {
        Text("F010")
        Button(onClick = onF011Key) {
            Text("F010 -> F011")
        }
        Button(onClick = onF012Key) {
            Text("F010 -> F012")
        }
        Button(onClick = onF013Key) {
            Text("F010 -> F013")
        }
    }
}
