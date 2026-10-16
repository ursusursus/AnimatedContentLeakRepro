package example.feature421.impl

import example.feature421.contract.Feature421Key
import example.feature422.contract.Feature422Key

fun ownRoute() = Feature421Key("own")
fun nextRoute() = Feature422Key("next")
