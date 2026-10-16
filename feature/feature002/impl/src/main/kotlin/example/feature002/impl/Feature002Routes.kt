package example.feature002.impl

import example.feature002.contract.Feature002Key
import example.feature003.contract.Feature003Key

fun ownRoute() = Feature002Key("own")
fun nextRoute() = Feature003Key("next")
