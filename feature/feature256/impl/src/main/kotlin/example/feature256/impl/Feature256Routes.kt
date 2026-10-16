package example.feature256.impl

import example.feature256.contract.Feature256Key
import example.feature257.contract.Feature257Key

fun ownRoute() = Feature256Key("own")
fun nextRoute() = Feature257Key("next")
