package com.example.feature.f196.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f196.contract.F196Key
import com.example.feature.f197.contract.F197Key
import com.example.feature.f198.contract.F198Key
import com.example.feature.f199.contract.F199Key

fun EntryProviderScope<NavKey>.f196Entries(backStack: NavBackStack<NavKey>) {
    entry<F196Key> {
        F196Screen(
            onF197Key = {
                backStack.add(F197Key)
            },
            onF198Key = {
                backStack.add(F198Key)
            },
            onF199Key = {
                backStack.add(F199Key)
            },
        )
    }
}

@Composable
internal fun F196Screen(
    onF197Key: () -> Unit,
    onF198Key: () -> Unit,
    onF199Key: () -> Unit,
) {
    Column {
        Text("F196")
        Button(onClick = onF197Key) {
            Text("F196 -> F197")
        }
        Button(onClick = onF198Key) {
            Text("F196 -> F198")
        }
        Button(onClick = onF199Key) {
            Text("F196 -> F199")
        }
    }
}
