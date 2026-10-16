package example.feature103.impl

import example.feature103.contract.Feature103Key
import example.feature104.contract.Feature104Key

fun ownRoute() = Feature103Key("own")
fun nextRoute() = Feature104Key("next")
