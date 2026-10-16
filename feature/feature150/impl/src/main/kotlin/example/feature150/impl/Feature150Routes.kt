package example.feature150.impl

import example.feature150.contract.Feature150Key
import example.feature151.contract.Feature151Key

fun ownRoute() = Feature150Key("own")
fun nextRoute() = Feature151Key("next")
