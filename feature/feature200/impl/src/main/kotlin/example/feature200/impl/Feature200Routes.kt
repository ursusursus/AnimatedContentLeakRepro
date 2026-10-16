package example.feature200.impl

import example.feature200.contract.Feature200Key
import example.feature201.contract.Feature201Key

fun ownRoute() = Feature200Key("own")
fun nextRoute() = Feature201Key("next")
