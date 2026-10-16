package example.feature111.impl

import example.feature111.contract.Feature111Key
import example.feature112.contract.Feature112Key

fun ownRoute() = Feature111Key("own")
fun nextRoute() = Feature112Key("next")
