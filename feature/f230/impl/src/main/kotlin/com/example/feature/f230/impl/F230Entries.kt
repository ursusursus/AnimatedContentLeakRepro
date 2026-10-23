package com.example.feature.f230.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f230.contract.F230Key
import com.example.feature.f231.contract.F231Key
import com.example.feature.f232.contract.F232Key
import com.example.feature.f233.contract.F233Key

fun EntryProviderScope<NavKey>.f230Entries(backStack: NavBackStack<NavKey>) {
    entry<F230Key> {
        F230Screen(
            onF231Key = {
                backStack.add(F231Key)
            },
            onF232Key = {
                backStack.add(F232Key)
            },
            onF233Key = {
                backStack.add(F233Key)
            },
        )
    }
}

@Composable
internal fun F230Screen(
    onF231Key: () -> Unit,
    onF232Key: () -> Unit,
    onF233Key: () -> Unit,
) {
    Column {
        Text("F230")
        Button(onClick = onF231Key) {
            Text("F230 -> F231")
        }
        Button(onClick = onF232Key) {
            Text("F230 -> F232")
        }
        Button(onClick = onF233Key) {
            Text("F230 -> F233")
        }
    }
}
