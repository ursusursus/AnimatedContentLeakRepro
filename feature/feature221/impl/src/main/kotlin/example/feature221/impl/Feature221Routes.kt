package example.feature221.impl

import example.feature221.contract.Feature221Key
import example.feature222.contract.Feature222Key

fun ownRoute() = Feature221Key("own")
fun nextRoute() = Feature222Key("next")
