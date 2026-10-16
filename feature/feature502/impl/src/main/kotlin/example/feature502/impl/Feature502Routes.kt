package example.feature502.impl

import example.feature502.contract.Feature502Key
import example.feature503.contract.Feature503Key

fun ownRoute() = Feature502Key("own")
fun nextRoute() = Feature503Key("next")
