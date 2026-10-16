package example.feature404.contract

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
data class Feature404Key(val id: String) : NavKey
