package example.feature003.impl

import example.feature003.contract.Feature003Key
import example.feature004.contract.Feature004Key

fun ownRoute() = Feature003Key("own")
fun nextRoute() = Feature004Key("next")
