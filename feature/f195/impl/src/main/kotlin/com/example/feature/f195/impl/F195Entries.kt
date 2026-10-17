package com.example.feature.f195.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f195.contract.F195Key
import com.example.feature.f196.contract.F196Key
import com.example.feature.f197.contract.F197Key
import com.example.feature.f198.contract.F198Key

fun EntryProviderScope<NavKey>.f195Entries(backStack: NavBackStack<NavKey>) {
    entry<F195Key> {
        F195Screen(
            onF196Key = {
                backStack.add(F196Key)
            },
            onF197Key = {
                backStack.add(F197Key)
            },
            onF198Key = {
                backStack.add(F198Key)
            },
        )
    }
}

@Composable
internal fun F195Screen(
    onF196Key: () -> Unit,
    onF197Key: () -> Unit,
    onF198Key: () -> Unit,
) {
    Column {
        Text("F195")
        Button(onClick = onF196Key) {
            Text("F195 -> F196")
        }
        Button(onClick = onF197Key) {
            Text("F195 -> F197")
        }
        Button(onClick = onF198Key) {
            Text("F195 -> F198")
        }
    }
}
