package example.feature401.impl

import example.feature401.contract.Feature401Key
import example.feature402.contract.Feature402Key

fun ownRoute() = Feature401Key("own")
fun nextRoute() = Feature402Key("next")
