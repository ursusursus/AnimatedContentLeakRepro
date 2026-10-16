package example.feature221.contract

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
data class Feature221Key(val id: String) : NavKey
