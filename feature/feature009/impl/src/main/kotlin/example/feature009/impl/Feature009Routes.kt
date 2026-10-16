package example.feature009.impl

import example.feature009.contract.Feature009Key
import example.feature010.contract.Feature010Key

fun ownRoute() = Feature009Key("own")
fun nextRoute() = Feature010Key("next")
