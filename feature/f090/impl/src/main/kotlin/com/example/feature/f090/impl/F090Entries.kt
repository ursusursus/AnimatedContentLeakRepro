package com.example.feature.f090.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f090.contract.F090Key
import com.example.feature.f091.contract.F091Key
import com.example.feature.f092.contract.F092Key
import com.example.feature.f093.contract.F093Key

fun EntryProviderScope<NavKey>.f090Entries(backStack: NavBackStack<NavKey>) {
    entry<F090Key> {
        F090Screen(
            onF091Key = {
                backStack.add(F091Key)
            },
            onF092Key = {
                backStack.add(F092Key)
            },
            onF093Key = {
                backStack.add(F093Key)
            },
        )
    }
}

@Composable
internal fun F090Screen(
    onF091Key: () -> Unit,
    onF092Key: () -> Unit,
    onF093Key: () -> Unit,
) {
    Column {
        Text("F090")
        Button(onClick = onF091Key) {
            Text("F090 -> F091")
        }
        Button(onClick = onF092Key) {
            Text("F090 -> F092")
        }
        Button(onClick = onF093Key) {
            Text("F090 -> F093")
        }
    }
}
