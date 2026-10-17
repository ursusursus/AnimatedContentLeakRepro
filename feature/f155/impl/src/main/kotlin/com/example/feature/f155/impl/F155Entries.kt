package com.example.feature.f155.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f155.contract.F155Key
import com.example.feature.f156.contract.F156Key
import com.example.feature.f157.contract.F157Key
import com.example.feature.f158.contract.F158Key

fun EntryProviderScope<NavKey>.f155Entries(backStack: NavBackStack<NavKey>) {
    entry<F155Key> {
        F155Screen(
            onF156Key = {
                backStack.add(F156Key)
            },
            onF157Key = {
                backStack.add(F157Key)
            },
            onF158Key = {
                backStack.add(F158Key)
            },
        )
    }
}

@Composable
internal fun F155Screen(
    onF156Key: () -> Unit,
    onF157Key: () -> Unit,
    onF158Key: () -> Unit,
) {
    Column {
        Text("F155")
        Button(onClick = onF156Key) {
            Text("F155 -> F156")
        }
        Button(onClick = onF157Key) {
            Text("F155 -> F157")
        }
        Button(onClick = onF158Key) {
            Text("F155 -> F158")
        }
    }
}
