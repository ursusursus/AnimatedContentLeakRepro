package com.example.feature.f166.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f166.contract.F166Key
import com.example.feature.f167.contract.F167Key
import com.example.feature.f168.contract.F168Key
import com.example.feature.f169.contract.F169Key

fun EntryProviderScope<NavKey>.f166Entries(backStack: NavBackStack<NavKey>) {
    entry<F166Key> {
        F166Screen(
            onF167Key = {
                backStack.add(F167Key)
            },
            onF168Key = {
                backStack.add(F168Key)
            },
            onF169Key = {
                backStack.add(F169Key)
            },
        )
    }
}

@Composable
internal fun F166Screen(
    onF167Key: () -> Unit,
    onF168Key: () -> Unit,
    onF169Key: () -> Unit,
) {
    Column {
        Text("F166")
        Button(onClick = onF167Key) {
            Text("F166 -> F167")
        }
        Button(onClick = onF168Key) {
            Text("F166 -> F168")
        }
        Button(onClick = onF169Key) {
            Text("F166 -> F169")
        }
    }
}
