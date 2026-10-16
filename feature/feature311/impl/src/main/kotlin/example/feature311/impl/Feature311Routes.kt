package example.feature311.impl

import example.feature311.contract.Feature311Key
import example.feature312.contract.Feature312Key

fun ownRoute() = Feature311Key("own")
fun nextRoute() = Feature312Key("next")
