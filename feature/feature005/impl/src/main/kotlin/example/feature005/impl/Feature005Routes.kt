package example.feature005.impl

import example.feature005.contract.Feature005Key
import example.feature006.contract.Feature006Key

fun ownRoute() = Feature005Key("own")
fun nextRoute() = Feature006Key("next")
