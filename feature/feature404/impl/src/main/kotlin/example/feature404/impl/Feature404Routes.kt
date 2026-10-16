package example.feature404.impl

import example.feature404.contract.Feature404Key
import example.feature405.contract.Feature405Key

fun ownRoute() = Feature404Key("own")
fun nextRoute() = Feature405Key("next")
