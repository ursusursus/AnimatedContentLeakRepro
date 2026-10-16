package example.feature132.contract

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
data class Feature132Key(val id: String) : NavKey
