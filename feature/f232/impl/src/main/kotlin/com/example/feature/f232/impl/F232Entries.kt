package com.example.feature.f232.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f232.contract.F232Key
import com.example.feature.f233.contract.F233Key
import com.example.feature.f234.contract.F234Key
import com.example.feature.f235.contract.F235Key

fun EntryProviderScope<NavKey>.f232Entries(backStack: NavBackStack<NavKey>) {
    entry<F232Key> {
        F232Screen(
            onF233Key = {
                backStack.add(F233Key)
            },
            onF234Key = {
                backStack.add(F234Key)
            },
            onF235Key = {
                backStack.add(F235Key)
            },
        )
    }
}

@Composable
internal fun F232Screen(
    onF233Key: () -> Unit,
    onF234Key: () -> Unit,
    onF235Key: () -> Unit,
) {
    Column {
        Text("F232")
        Button(onClick = onF233Key) {
            Text("F232 -> F233")
        }
        Button(onClick = onF234Key) {
            Text("F232 -> F234")
        }
        Button(onClick = onF235Key) {
            Text("F232 -> F235")
        }
    }
}
