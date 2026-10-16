package example.feature011.impl

import example.feature011.contract.Feature011Key
import example.feature012.contract.Feature012Key

fun ownRoute() = Feature011Key("own")
fun nextRoute() = Feature012Key("next")
