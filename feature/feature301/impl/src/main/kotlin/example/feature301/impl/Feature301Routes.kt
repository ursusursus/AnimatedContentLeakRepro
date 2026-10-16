package example.feature301.impl

import example.feature301.contract.Feature301Key
import example.feature302.contract.Feature302Key

fun ownRoute() = Feature301Key("own")
fun nextRoute() = Feature302Key("next")
