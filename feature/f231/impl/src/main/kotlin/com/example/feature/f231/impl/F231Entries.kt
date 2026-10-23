package com.example.feature.f231.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f231.contract.F231Key
import com.example.feature.f232.contract.F232Key
import com.example.feature.f233.contract.F233Key
import com.example.feature.f234.contract.F234Key

fun EntryProviderScope<NavKey>.f231Entries(backStack: NavBackStack<NavKey>) {
    entry<F231Key> {
        F231Screen(
            onF232Key = {
                backStack.add(F232Key)
            },
            onF233Key = {
                backStack.add(F233Key)
            },
            onF234Key = {
                backStack.add(F234Key)
            },
        )
    }
}

@Composable
internal fun F231Screen(
    onF232Key: () -> Unit,
    onF233Key: () -> Unit,
    onF234Key: () -> Unit,
) {
    Column {
        Text("F231")
        Button(onClick = onF232Key) {
            Text("F231 -> F232")
        }
        Button(onClick = onF233Key) {
            Text("F231 -> F233")
        }
        Button(onClick = onF234Key) {
            Text("F231 -> F234")
        }
    }
}
