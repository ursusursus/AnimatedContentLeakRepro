package example.feature165.contract

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
data class Feature165Key(val id: String) : NavKey
