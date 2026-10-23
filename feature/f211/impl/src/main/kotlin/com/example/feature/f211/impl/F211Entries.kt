package com.example.feature.f211.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f211.contract.F211Key
import com.example.feature.f212.contract.F212Key
import com.example.feature.f213.contract.F213Key
import com.example.feature.f214.contract.F214Key

fun EntryProviderScope<NavKey>.f211Entries(backStack: NavBackStack<NavKey>) {
    entry<F211Key> {
        F211Screen(
            onF212Key = {
                backStack.add(F212Key)
            },
            onF213Key = {
                backStack.add(F213Key)
            },
            onF214Key = {
                backStack.add(F214Key)
            },
        )
    }
}

@Composable
internal fun F211Screen(
    onF212Key: () -> Unit,
    onF213Key: () -> Unit,
    onF214Key: () -> Unit,
) {
    Column {
        Text("F211")
        Button(onClick = onF212Key) {
            Text("F211 -> F212")
        }
        Button(onClick = onF213Key) {
            Text("F211 -> F213")
        }
        Button(onClick = onF214Key) {
            Text("F211 -> F214")
        }
    }
}
