package example.feature100.impl

import example.feature100.contract.Feature100Key
import example.feature101.contract.Feature101Key

fun ownRoute() = Feature100Key("own")
fun nextRoute() = Feature101Key("next")
