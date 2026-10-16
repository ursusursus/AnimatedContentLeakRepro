package example.feature111.contract

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
data class Feature111Key(val id: String) : NavKey
