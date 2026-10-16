package example.feature172.impl

import example.feature172.contract.Feature172Key
import example.feature173.contract.Feature173Key

fun ownRoute() = Feature172Key("own")
fun nextRoute() = Feature173Key("next")
