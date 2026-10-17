package com.example.feature.f197.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f197.contract.F197Key
import com.example.feature.f198.contract.F198Key
import com.example.feature.f199.contract.F199Key
import com.example.feature.f200.contract.F200Key

fun EntryProviderScope<NavKey>.f197Entries(backStack: NavBackStack<NavKey>) {
    entry<F197Key> {
        F197Screen(
            onF198Key = {
                backStack.add(F198Key)
            },
            onF199Key = {
                backStack.add(F199Key)
            },
            onF200Key = {
                backStack.add(F200Key)
            },
        )
    }
}

@Composable
internal fun F197Screen(
    onF198Key: () -> Unit,
    onF199Key: () -> Unit,
    onF200Key: () -> Unit,
) {
    Column {
        Text("F197")
        Button(onClick = onF198Key) {
            Text("F197 -> F198")
        }
        Button(onClick = onF199Key) {
            Text("F197 -> F199")
        }
        Button(onClick = onF200Key) {
            Text("F197 -> F200")
        }
    }
}
