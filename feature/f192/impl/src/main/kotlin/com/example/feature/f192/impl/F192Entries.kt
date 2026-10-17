package com.example.feature.f192.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f192.contract.F192Key
import com.example.feature.f193.contract.F193Key
import com.example.feature.f194.contract.F194Key
import com.example.feature.f195.contract.F195Key

fun EntryProviderScope<NavKey>.f192Entries(backStack: NavBackStack<NavKey>) {
    entry<F192Key> {
        F192Screen(
            onF193Key = {
                backStack.add(F193Key)
            },
            onF194Key = {
                backStack.add(F194Key)
            },
            onF195Key = {
                backStack.add(F195Key)
            },
        )
    }
}

@Composable
internal fun F192Screen(
    onF193Key: () -> Unit,
    onF194Key: () -> Unit,
    onF195Key: () -> Unit,
) {
    Column {
        Text("F192")
        Button(onClick = onF193Key) {
            Text("F192 -> F193")
        }
        Button(onClick = onF194Key) {
            Text("F192 -> F194")
        }
        Button(onClick = onF195Key) {
            Text("F192 -> F195")
        }
    }
}
