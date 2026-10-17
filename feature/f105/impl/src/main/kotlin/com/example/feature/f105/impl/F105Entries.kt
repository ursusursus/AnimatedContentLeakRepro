package com.example.feature.f105.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f105.contract.F105Key
import com.example.feature.f106.contract.F106Key
import com.example.feature.f107.contract.F107Key
import com.example.feature.f108.contract.F108Key

fun EntryProviderScope<NavKey>.f105Entries(backStack: NavBackStack<NavKey>) {
    entry<F105Key> {
        F105Screen(
            onF106Key = {
                backStack.add(F106Key)
            },
            onF107Key = {
                backStack.add(F107Key)
            },
            onF108Key = {
                backStack.add(F108Key)
            },
        )
    }
}

@Composable
internal fun F105Screen(
    onF106Key: () -> Unit,
    onF107Key: () -> Unit,
    onF108Key: () -> Unit,
) {
    Column {
        Text("F105")
        Button(onClick = onF106Key) {
            Text("F105 -> F106")
        }
        Button(onClick = onF107Key) {
            Text("F105 -> F107")
        }
        Button(onClick = onF108Key) {
            Text("F105 -> F108")
        }
    }
}
