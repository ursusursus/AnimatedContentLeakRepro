package example.feature250.impl

import example.feature250.contract.Feature250Key
import example.feature251.contract.Feature251Key

fun ownRoute() = Feature250Key("own")
fun nextRoute() = Feature251Key("next")
