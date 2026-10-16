package example.feature302.impl

import example.feature302.contract.Feature302Key
import example.feature303.contract.Feature303Key

fun ownRoute() = Feature302Key("own")
fun nextRoute() = Feature303Key("next")
