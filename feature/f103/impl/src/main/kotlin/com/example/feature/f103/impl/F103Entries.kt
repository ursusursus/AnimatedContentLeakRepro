package com.example.feature.f103.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f103.contract.F103Key
import com.example.feature.f104.contract.F104Key
import com.example.feature.f105.contract.F105Key
import com.example.feature.f106.contract.F106Key

fun EntryProviderScope<NavKey>.f103Entries(backStack: NavBackStack<NavKey>) {
    entry<F103Key> {
        F103Screen(
            onF104Key = {
                backStack.add(F104Key)
            },
            onF105Key = {
                backStack.add(F105Key)
            },
            onF106Key = {
                backStack.add(F106Key)
            },
        )
    }
}

@Composable
internal fun F103Screen(
    onF104Key: () -> Unit,
    onF105Key: () -> Unit,
    onF106Key: () -> Unit,
) {
    Column {
        Text("F103")
        Button(onClick = onF104Key) {
            Text("F103 -> F104")
        }
        Button(onClick = onF105Key) {
            Text("F103 -> F105")
        }
        Button(onClick = onF106Key) {
            Text("F103 -> F106")
        }
    }
}
