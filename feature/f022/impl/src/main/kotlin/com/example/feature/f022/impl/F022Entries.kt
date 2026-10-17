package com.example.feature.f022.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f022.contract.F022Key
import com.example.feature.f023.contract.F023Key
import com.example.feature.f024.contract.F024Key
import com.example.feature.f025.contract.F025Key

fun EntryProviderScope<NavKey>.f022Entries(backStack: NavBackStack<NavKey>) {
    entry<F022Key> {
        F022Screen(
            onF023Key = {
                backStack.add(F023Key)
            },
            onF024Key = {
                backStack.add(F024Key)
            },
            onF025Key = {
                backStack.add(F025Key)
            },
        )
    }
}

@Composable
internal fun F022Screen(
    onF023Key: () -> Unit,
    onF024Key: () -> Unit,
    onF025Key: () -> Unit,
) {
    Column {
        Text("F022")
        Button(onClick = onF023Key) {
            Text("F022 -> F023")
        }
        Button(onClick = onF024Key) {
            Text("F022 -> F024")
        }
        Button(onClick = onF025Key) {
            Text("F022 -> F025")
        }
    }
}
