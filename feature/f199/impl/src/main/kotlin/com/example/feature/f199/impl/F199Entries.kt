package com.example.feature.f199.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f201.contract.F201Key
import com.example.feature.f202.contract.F202Key
import com.example.feature.f199.contract.F199Key
import com.example.feature.f200.contract.F200Key

fun EntryProviderScope<NavKey>.f199Entries(backStack: NavBackStack<NavKey>) {
    entry<F199Key> {
        F199Screen(
            onF200Key = {
                backStack.add(F200Key)
            },
            onF201Key = {
                backStack.add(F201Key)
            },
            onF202Key = {
                backStack.add(F202Key)
            },
        )
    }
}

@Composable
internal fun F199Screen(
    onF200Key: () -> Unit,
    onF201Key: () -> Unit,
    onF202Key: () -> Unit,
) {
    Column {
        Text("F199")
        Button(onClick = onF200Key) {
            Text("F199 -> F200")
        }
        Button(onClick = onF201Key) {
            Text("F199 -> F201")
        }
        Button(onClick = onF202Key) {
            Text("F199 -> F202")
        }
    }
}
