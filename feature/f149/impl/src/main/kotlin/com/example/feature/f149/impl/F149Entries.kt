package com.example.feature.f149.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f149.contract.F149Key
import com.example.feature.f150.contract.F150Key
import com.example.feature.f151.contract.F151Key
import com.example.feature.f152.contract.F152Key

fun EntryProviderScope<NavKey>.f149Entries(backStack: NavBackStack<NavKey>) {
    entry<F149Key> {
        F149Screen(
            onF150Key = {
                backStack.add(F150Key)
            },
            onF151Key = {
                backStack.add(F151Key)
            },
            onF152Key = {
                backStack.add(F152Key)
            },
        )
    }
}

@Composable
internal fun F149Screen(
    onF150Key: () -> Unit,
    onF151Key: () -> Unit,
    onF152Key: () -> Unit,
) {
    Column {
        Text("F149")
        Button(onClick = onF150Key) {
            Text("F149 -> F150")
        }
        Button(onClick = onF151Key) {
            Text("F149 -> F151")
        }
        Button(onClick = onF152Key) {
            Text("F149 -> F152")
        }
    }
}
