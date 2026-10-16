package example.feature422.impl

import example.feature422.contract.Feature422Key
import example.feature423.contract.Feature423Key

fun ownRoute() = Feature422Key("own")
fun nextRoute() = Feature423Key("next")
