package example.feature234.contract

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
data class Feature234Key(val id: String) : NavKey
