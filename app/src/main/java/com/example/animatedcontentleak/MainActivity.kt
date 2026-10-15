package com.example.animatedcontentleak

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.AnimatedContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.delay
import kotlin.time.Duration.Companion.seconds

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            AppRoot() // leaks
            AppRoot2() // doesn't leak
        }
    }
}

@Composable
private fun AppRoot() {
    var state: State by remember { mutableStateOf(State.Foo()) }

    LaunchedEffect(Unit) {
        repeat(5) {
            delay(1.seconds)
            state = if (state is State.Foo) State.Bar() else State.Foo()
        }
    }

    AnimatedContent(targetState = state) {
        when (it) {
            is State.Foo -> FooRoot(it)
            is State.Bar -> BarRoot(it)
        }
    }
}

@Composable
private fun AppRoot2() {
    var state: State by remember { mutableStateOf(State.Foo()) }

    LaunchedEffect(Unit) {
        repeat(5) {
            delay(1.seconds)
            state = if (state is State.Foo) State.Bar() else State.Foo()
        }
    }

    when (val s = state) {
        is State.Foo -> FooRoot(s)
        is State.Bar -> BarRoot(s)
    }
}

@Composable
private fun FooRoot(foo: State.Foo) {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Text("Foo root", fontSize = 20.sp)
    }
}

@Composable
private fun BarRoot(bar: State.Bar) {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Text("Bar root", fontSize = 20.sp)
    }
}

sealed class State {
    data class Foo(val payload: Payload = Payload()) : State()
    data class Bar(val payload: Payload = Payload()) : State()
}

class Payload {
    val bytes = ByteArray(1024 * 1024)
}
