package com.example.feature.f189.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f189.contract.F189Key
import com.example.feature.f190.contract.F190Key
import com.example.feature.f191.contract.F191Key
import com.example.feature.f192.contract.F192Key

fun EntryProviderScope<NavKey>.f189Entries(backStack: NavBackStack<NavKey>) {
    entry<F189Key> {
        F189Screen(
            onF190Key = {
                backStack.add(F190Key)
            },
            onF191Key = {
                backStack.add(F191Key)
            },
            onF192Key = {
                backStack.add(F192Key)
            },
        )
    }
}

@Composable
internal fun F189Screen(
    onF190Key: () -> Unit,
    onF191Key: () -> Unit,
    onF192Key: () -> Unit,
) {
    Column {
        Text("F189")
        Button(onClick = onF190Key) {
            Text("F189 -> F190")
        }
        Button(onClick = onF191Key) {
            Text("F189 -> F191")
        }
        Button(onClick = onF192Key) {
            Text("F189 -> F192")
        }
    }
}
