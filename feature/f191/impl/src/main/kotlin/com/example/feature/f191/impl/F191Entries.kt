package com.example.feature.f191.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f191.contract.F191Key
import com.example.feature.f192.contract.F192Key
import com.example.feature.f193.contract.F193Key
import com.example.feature.f194.contract.F194Key

fun EntryProviderScope<NavKey>.f191Entries(backStack: NavBackStack<NavKey>) {
    entry<F191Key> {
        F191Screen(
            onF192Key = {
                backStack.add(F192Key)
            },
            onF193Key = {
                backStack.add(F193Key)
            },
            onF194Key = {
                backStack.add(F194Key)
            },
        )
    }
}

@Composable
internal fun F191Screen(
    onF192Key: () -> Unit,
    onF193Key: () -> Unit,
    onF194Key: () -> Unit,
) {
    Column {
        Text("F191")
        Button(onClick = onF192Key) {
            Text("F191 -> F192")
        }
        Button(onClick = onF193Key) {
            Text("F191 -> F193")
        }
        Button(onClick = onF194Key) {
            Text("F191 -> F194")
        }
    }
}
