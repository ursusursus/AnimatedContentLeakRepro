package example.feature001.impl

import example.feature001.contract.Feature001Key
import example.feature002.contract.Feature002Key

fun ownRoute() = Feature001Key("own")
fun nextRoute() = Feature002Key("next")
