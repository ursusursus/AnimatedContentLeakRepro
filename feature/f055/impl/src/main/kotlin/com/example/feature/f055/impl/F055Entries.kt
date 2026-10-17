package com.example.feature.f055.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f055.contract.F055Key
import com.example.feature.f056.contract.F056Key
import com.example.feature.f057.contract.F057Key
import com.example.feature.f058.contract.F058Key

fun EntryProviderScope<NavKey>.f055Entries(backStack: NavBackStack<NavKey>) {
    entry<F055Key> {
        F055Screen(
            onF056Key = {
                backStack.add(F056Key)
            },
            onF057Key = {
                backStack.add(F057Key)
            },
            onF058Key = {
                backStack.add(F058Key)
            },
        )
    }
}

@Composable
internal fun F055Screen(
    onF056Key: () -> Unit,
    onF057Key: () -> Unit,
    onF058Key: () -> Unit,
) {
    Column {
        Text("F055")
        Button(onClick = onF056Key) {
            Text("F055 -> F056")
        }
        Button(onClick = onF057Key) {
            Text("F055 -> F057")
        }
        Button(onClick = onF058Key) {
            Text("F055 -> F058")
        }
    }
}
