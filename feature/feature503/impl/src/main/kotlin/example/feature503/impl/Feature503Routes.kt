package example.feature503.impl

import example.feature503.contract.Feature503Key
import example.feature504.contract.Feature504Key

fun ownRoute() = Feature503Key("own")
fun nextRoute() = Feature504Key("next")
