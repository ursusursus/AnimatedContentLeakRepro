package example.feature123.impl

import example.feature123.contract.Feature123Key
import example.feature124.contract.Feature124Key

fun ownRoute() = Feature123Key("own")
fun nextRoute() = Feature124Key("next")
