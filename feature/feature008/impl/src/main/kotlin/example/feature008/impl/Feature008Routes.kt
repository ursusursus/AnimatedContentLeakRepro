package example.feature008.impl

import example.feature008.contract.Feature008Key
import example.feature009.contract.Feature009Key

fun ownRoute() = Feature008Key("own")
fun nextRoute() = Feature009Key("next")
