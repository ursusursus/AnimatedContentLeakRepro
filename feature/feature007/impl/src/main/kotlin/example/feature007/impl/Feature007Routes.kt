package example.feature007.impl

import example.feature007.contract.Feature007Key
import example.feature008.contract.Feature008Key

fun ownRoute() = Feature007Key("own")
fun nextRoute() = Feature008Key("next")
