package example.feature403.impl

import example.feature403.contract.Feature403Key
import example.feature404.contract.Feature404Key

fun ownRoute() = Feature403Key("own")
fun nextRoute() = Feature404Key("next")
