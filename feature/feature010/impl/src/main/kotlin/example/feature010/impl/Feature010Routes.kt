package example.feature010.impl

import example.feature010.contract.Feature010Key
import example.feature011.contract.Feature011Key

fun ownRoute() = Feature010Key("own")
fun nextRoute() = Feature011Key("next")
