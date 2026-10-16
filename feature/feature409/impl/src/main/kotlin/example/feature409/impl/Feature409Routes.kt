package example.feature409.impl

import example.feature409.contract.Feature409Key
import example.feature410.contract.Feature410Key

fun ownRoute() = Feature409Key("own")
fun nextRoute() = Feature410Key("next")
