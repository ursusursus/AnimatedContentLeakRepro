package example.feature004.impl

import example.feature004.contract.Feature004Key
import example.feature005.contract.Feature005Key

fun ownRoute() = Feature004Key("own")
fun nextRoute() = Feature005Key("next")
