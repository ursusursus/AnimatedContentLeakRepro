package com.example.feature.f154.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f154.contract.F154Key
import com.example.feature.f155.contract.F155Key
import com.example.feature.f156.contract.F156Key
import com.example.feature.f157.contract.F157Key

fun EntryProviderScope<NavKey>.f154Entries(backStack: NavBackStack<NavKey>) {
    entry<F154Key> {
        F154Screen(
            onF155Key = {
                backStack.add(F155Key)
            },
            onF156Key = {
                backStack.add(F156Key)
            },
            onF157Key = {
                backStack.add(F157Key)
            },
        )
    }
}

@Composable
internal fun F154Screen(
    onF155Key: () -> Unit,
    onF156Key: () -> Unit,
    onF157Key: () -> Unit,
) {
    Column {
        Text("F154")
        Button(onClick = onF155Key) {
            Text("F154 -> F155")
        }
        Button(onClick = onF156Key) {
            Text("F154 -> F156")
        }
        Button(onClick = onF157Key) {
            Text("F154 -> F157")
        }
    }
}
