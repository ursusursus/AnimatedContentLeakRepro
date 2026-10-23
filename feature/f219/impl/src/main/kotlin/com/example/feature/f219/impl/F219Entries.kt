package com.example.feature.f219.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f219.contract.F219Key
import com.example.feature.f220.contract.F220Key
import com.example.feature.f221.contract.F221Key
import com.example.feature.f222.contract.F222Key

fun EntryProviderScope<NavKey>.f219Entries(backStack: NavBackStack<NavKey>) {
    entry<F219Key> {
        F219Screen(
            onF220Key = {
                backStack.add(F220Key)
            },
            onF221Key = {
                backStack.add(F221Key)
            },
            onF222Key = {
                backStack.add(F222Key)
            },
        )
    }
}

@Composable
internal fun F219Screen(
    onF220Key: () -> Unit,
    onF221Key: () -> Unit,
    onF222Key: () -> Unit,
) {
    Column {
        Text("F219")
        Button(onClick = onF220Key) {
            Text("F219 -> F220")
        }
        Button(onClick = onF221Key) {
            Text("F219 -> F221")
        }
        Button(onClick = onF222Key) {
            Text("F219 -> F222")
        }
    }
}
