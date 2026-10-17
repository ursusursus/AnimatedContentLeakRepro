package com.example.feature.f148.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f148.contract.F148Key
import com.example.feature.f149.contract.F149Key
import com.example.feature.f150.contract.F150Key
import com.example.feature.f151.contract.F151Key

fun EntryProviderScope<NavKey>.f148Entries(backStack: NavBackStack<NavKey>) {
    entry<F148Key> {
        F148Screen(
            onF149Key = {
                backStack.add(F149Key)
            },
            onF150Key = {
                backStack.add(F150Key)
            },
            onF151Key = {
                backStack.add(F151Key)
            },
        )
    }
}

@Composable
internal fun F148Screen(
    onF149Key: () -> Unit,
    onF150Key: () -> Unit,
    onF151Key: () -> Unit,
) {
    Column {
        Text("F148")
        Button(onClick = onF149Key) {
            Text("F148 -> F149")
        }
        Button(onClick = onF150Key) {
            Text("F148 -> F150")
        }
        Button(onClick = onF151Key) {
            Text("F148 -> F151")
        }
    }
}
