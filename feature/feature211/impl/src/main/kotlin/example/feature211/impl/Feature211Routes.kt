package example.feature211.impl

import example.feature211.contract.Feature211Key
import example.feature212.contract.Feature212Key

fun ownRoute() = Feature211Key("own")
fun nextRoute() = Feature212Key("next")
