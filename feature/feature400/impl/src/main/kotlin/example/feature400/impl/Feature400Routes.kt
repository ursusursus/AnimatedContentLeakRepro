package example.feature400.impl

import example.feature400.contract.Feature400Key
import example.feature401.contract.Feature401Key

fun ownRoute() = Feature400Key("own")
fun nextRoute() = Feature401Key("next")
