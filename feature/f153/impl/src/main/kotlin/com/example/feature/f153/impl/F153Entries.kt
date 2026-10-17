package com.example.feature.f153.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f153.contract.F153Key
import com.example.feature.f154.contract.F154Key
import com.example.feature.f155.contract.F155Key
import com.example.feature.f156.contract.F156Key

fun EntryProviderScope<NavKey>.f153Entries(backStack: NavBackStack<NavKey>) {
    entry<F153Key> {
        F153Screen(
            onF154Key = {
                backStack.add(F154Key)
            },
            onF155Key = {
                backStack.add(F155Key)
            },
            onF156Key = {
                backStack.add(F156Key)
            },
        )
    }
}

@Composable
internal fun F153Screen(
    onF154Key: () -> Unit,
    onF155Key: () -> Unit,
    onF156Key: () -> Unit,
) {
    Column {
        Text("F153")
        Button(onClick = onF154Key) {
            Text("F153 -> F154")
        }
        Button(onClick = onF155Key) {
            Text("F153 -> F155")
        }
        Button(onClick = onF156Key) {
            Text("F153 -> F156")
        }
    }
}
