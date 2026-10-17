package com.example.feature.f102.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f102.contract.F102Key
import com.example.feature.f103.contract.F103Key
import com.example.feature.f104.contract.F104Key
import com.example.feature.f105.contract.F105Key

fun EntryProviderScope<NavKey>.f102Entries(backStack: NavBackStack<NavKey>) {
    entry<F102Key> {
        F102Screen(
            onF103Key = {
                backStack.add(F103Key)
            },
            onF104Key = {
                backStack.add(F104Key)
            },
            onF105Key = {
                backStack.add(F105Key)
            },
        )
    }
}

@Composable
internal fun F102Screen(
    onF103Key: () -> Unit,
    onF104Key: () -> Unit,
    onF105Key: () -> Unit,
) {
    Column {
        Text("F102")
        Button(onClick = onF103Key) {
            Text("F102 -> F103")
        }
        Button(onClick = onF104Key) {
            Text("F102 -> F104")
        }
        Button(onClick = onF105Key) {
            Text("F102 -> F105")
        }
    }
}
