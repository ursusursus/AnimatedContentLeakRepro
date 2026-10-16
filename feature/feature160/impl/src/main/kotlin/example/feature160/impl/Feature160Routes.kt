package example.feature160.impl

import example.feature160.contract.Feature160Key
import example.feature161.contract.Feature161Key

fun ownRoute() = Feature160Key("own")
fun nextRoute() = Feature161Key("next")
