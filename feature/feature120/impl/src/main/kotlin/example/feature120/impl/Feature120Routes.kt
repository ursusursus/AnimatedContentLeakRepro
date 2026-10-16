package example.feature120.impl

import example.feature120.contract.Feature120Key
import example.feature121.contract.Feature121Key

fun ownRoute() = Feature120Key("own")
fun nextRoute() = Feature121Key("next")
