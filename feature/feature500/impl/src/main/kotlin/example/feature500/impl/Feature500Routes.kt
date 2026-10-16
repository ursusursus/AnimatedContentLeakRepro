package example.feature500.impl

import example.feature500.contract.Feature500Key
import example.feature501.contract.Feature501Key

fun ownRoute() = Feature500Key("own")
fun nextRoute() = Feature501Key("next")
