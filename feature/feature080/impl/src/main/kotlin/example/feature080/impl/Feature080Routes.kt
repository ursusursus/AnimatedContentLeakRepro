package example.feature080.impl

import example.feature080.contract.Feature080Key
import example.feature081.contract.Feature081Key

fun ownRoute() = Feature080Key("own")
fun nextRoute() = Feature081Key("next")
