package com.example.feature.f210.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f210.contract.F210Key
import com.example.feature.f211.contract.F211Key
import com.example.feature.f212.contract.F212Key
import com.example.feature.f213.contract.F213Key

fun EntryProviderScope<NavKey>.f210Entries(backStack: NavBackStack<NavKey>) {
    entry<F210Key> {
        F210Screen(
            onF211Key = {
                backStack.add(F211Key)
            },
            onF212Key = {
                backStack.add(F212Key)
            },
            onF213Key = {
                backStack.add(F213Key)
            },
        )
    }
}

@Composable
internal fun F210Screen(
    onF211Key: () -> Unit,
    onF212Key: () -> Unit,
    onF213Key: () -> Unit,
) {
    Column {
        Text("F210")
        Button(onClick = onF211Key) {
            Text("F210 -> F211")
        }
        Button(onClick = onF212Key) {
            Text("F210 -> F212")
        }
        Button(onClick = onF213Key) {
            Text("F210 -> F213")
        }
    }
}
