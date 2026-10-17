package com.example.feature.f104.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f104.contract.F104Key
import com.example.feature.f105.contract.F105Key
import com.example.feature.f106.contract.F106Key
import com.example.feature.f107.contract.F107Key

fun EntryProviderScope<NavKey>.f104Entries(backStack: NavBackStack<NavKey>) {
    entry<F104Key> {
        F104Screen(
            onF105Key = {
                backStack.add(F105Key)
            },
            onF106Key = {
                backStack.add(F106Key)
            },
            onF107Key = {
                backStack.add(F107Key)
            },
        )
    }
}

@Composable
internal fun F104Screen(
    onF105Key: () -> Unit,
    onF106Key: () -> Unit,
    onF107Key: () -> Unit,
) {
    Column {
        Text("F104")
        Button(onClick = onF105Key) {
            Text("F104 -> F105")
        }
        Button(onClick = onF106Key) {
            Text("F104 -> F106")
        }
        Button(onClick = onF107Key) {
            Text("F104 -> F107")
        }
    }
}
