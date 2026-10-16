package example.feature201.impl

import example.feature201.contract.Feature201Key
import example.feature202.contract.Feature202Key

fun ownRoute() = Feature201Key("own")
fun nextRoute() = Feature202Key("next")
