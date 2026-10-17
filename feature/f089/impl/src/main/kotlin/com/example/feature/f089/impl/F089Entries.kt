package com.example.feature.f089.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f089.contract.F089Key
import com.example.feature.f090.contract.F090Key
import com.example.feature.f091.contract.F091Key
import com.example.feature.f092.contract.F092Key

fun EntryProviderScope<NavKey>.f089Entries(backStack: NavBackStack<NavKey>) {
    entry<F089Key> {
        F089Screen(
            onF090Key = {
                backStack.add(F090Key)
            },
            onF091Key = {
                backStack.add(F091Key)
            },
            onF092Key = {
                backStack.add(F092Key)
            },
        )
    }
}

@Composable
internal fun F089Screen(
    onF090Key: () -> Unit,
    onF091Key: () -> Unit,
    onF092Key: () -> Unit,
) {
    Column {
        Text("F089")
        Button(onClick = onF090Key) {
            Text("F089 -> F090")
        }
        Button(onClick = onF091Key) {
            Text("F089 -> F091")
        }
        Button(onClick = onF092Key) {
            Text("F089 -> F092")
        }
    }
}
