package example.feature405.contract

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
data class Feature405Key(val id: String) : NavKey
