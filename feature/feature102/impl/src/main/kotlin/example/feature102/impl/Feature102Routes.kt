package example.feature102.impl

import example.feature102.contract.Feature102Key
import example.feature103.contract.Feature103Key

fun ownRoute() = Feature102Key("own")
fun nextRoute() = Feature103Key("next")
