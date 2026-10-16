package example.feature135.contract

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
data class Feature135Key(val id: String) : NavKey
