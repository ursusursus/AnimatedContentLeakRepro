package example.feature503.contract

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
data class Feature503Key(val id: String) : NavKey
