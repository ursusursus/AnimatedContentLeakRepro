package com.example.feature.f146.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f146.contract.F146Key
import com.example.feature.f147.contract.F147Key
import com.example.feature.f148.contract.F148Key
import com.example.feature.f149.contract.F149Key

fun EntryProviderScope<NavKey>.f146Entries(backStack: NavBackStack<NavKey>) {
    entry<F146Key> {
        F146Screen(
            onF147Key = {
                backStack.add(F147Key)
            },
            onF148Key = {
                backStack.add(F148Key)
            },
            onF149Key = {
                backStack.add(F149Key)
            },
        )
    }
}

@Composable
internal fun F146Screen(
    onF147Key: () -> Unit,
    onF148Key: () -> Unit,
    onF149Key: () -> Unit,
) {
    Column {
        Text("F146")
        Button(onClick = onF147Key) {
            Text("F146 -> F147")
        }
        Button(onClick = onF148Key) {
            Text("F146 -> F148")
        }
        Button(onClick = onF149Key) {
            Text("F146 -> F149")
        }
    }
}
