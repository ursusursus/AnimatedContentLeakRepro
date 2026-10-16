package example.feature171.contract

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
data class Feature171Key(val id: String) : NavKey
