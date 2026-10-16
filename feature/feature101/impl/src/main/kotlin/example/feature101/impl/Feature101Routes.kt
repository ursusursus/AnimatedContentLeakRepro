package example.feature101.impl

import example.feature101.contract.Feature101Key
import example.feature102.contract.Feature102Key

fun ownRoute() = Feature101Key("own")
fun nextRoute() = Feature102Key("next")
