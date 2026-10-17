package com.example.feature.f194.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f194.contract.F194Key
import com.example.feature.f195.contract.F195Key
import com.example.feature.f196.contract.F196Key
import com.example.feature.f197.contract.F197Key

fun EntryProviderScope<NavKey>.f194Entries(backStack: NavBackStack<NavKey>) {
    entry<F194Key> {
        F194Screen(
            onF195Key = {
                backStack.add(F195Key)
            },
            onF196Key = {
                backStack.add(F196Key)
            },
            onF197Key = {
                backStack.add(F197Key)
            },
        )
    }
}

@Composable
internal fun F194Screen(
    onF195Key: () -> Unit,
    onF196Key: () -> Unit,
    onF197Key: () -> Unit,
) {
    Column {
        Text("F194")
        Button(onClick = onF195Key) {
            Text("F194 -> F195")
        }
        Button(onClick = onF196Key) {
            Text("F194 -> F196")
        }
        Button(onClick = onF197Key) {
            Text("F194 -> F197")
        }
    }
}
