package example.feature501.impl

import example.feature501.contract.Feature501Key
import example.feature502.contract.Feature502Key

fun ownRoute() = Feature501Key("own")
fun nextRoute() = Feature502Key("next")
