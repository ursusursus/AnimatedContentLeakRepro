package com.example.feature.f147.impl

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.feature.f147.contract.F147Key
import com.example.feature.f148.contract.F148Key
import com.example.feature.f149.contract.F149Key
import com.example.feature.f150.contract.F150Key

fun EntryProviderScope<NavKey>.f147Entries(backStack: NavBackStack<NavKey>) {
    entry<F147Key> {
        F147Screen(
            onF148Key = {
                backStack.add(F148Key)
            },
            onF149Key = {
                backStack.add(F149Key)
            },
            onF150Key = {
                backStack.add(F150Key)
            },
        )
    }
}

@Composable
internal fun F147Screen(
    onF148Key: () -> Unit,
    onF149Key: () -> Unit,
    onF150Key: () -> Unit,
) {
    Column {
        Text("F147")
        Button(onClick = onF148Key) {
            Text("F147 -> F148")
        }
        Button(onClick = onF149Key) {
            Text("F147 -> F149")
        }
        Button(onClick = onF150Key) {
            Text("F147 -> F150")
        }
    }
}
