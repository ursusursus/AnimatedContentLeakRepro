package example.feature300.impl

import example.feature300.contract.Feature300Key
import example.feature301.contract.Feature301Key

fun ownRoute() = Feature300Key("own")
fun nextRoute() = Feature301Key("next")
