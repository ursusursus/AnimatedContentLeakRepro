package com.example.feature.f150.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f150.contract.F150Key
import com.example.feature.f151.contract.F151Key
import com.example.feature.f152.contract.F152Key
import com.example.feature.f153.contract.F153Key

fun EntryProviderScope<NavKey>.f150Entries(backStack: NavBackStack<NavKey>) {
    entry<F150Key> {
        F150Screen(
            onF151Key = {
                backStack.add(F151Key)
            },
            onF152Key = {
                backStack.add(F152Key)
            },
            onF153Key = {
                backStack.add(F153Key)
            },
        )
    }
}

@Composable
internal fun F150Screen(
    onF151Key: () -> Unit,
    onF152Key: () -> Unit,
    onF153Key: () -> Unit,
) {
    Column {
        Text("F150")
        Button(onClick = onF151Key) {
            Text("F150 -> F151")
        }
        Button(onClick = onF152Key) {
            Text("F150 -> F152")
        }
        Button(onClick = onF153Key) {
            Text("F150 -> F153")
        }
    }
}
