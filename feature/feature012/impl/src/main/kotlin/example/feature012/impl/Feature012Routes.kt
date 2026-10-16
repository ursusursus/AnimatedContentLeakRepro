package example.feature012.impl

import example.feature012.contract.Feature012Key
import example.feature013.contract.Feature013Key

fun ownRoute() = Feature012Key("own")
fun nextRoute() = Feature013Key("next")
