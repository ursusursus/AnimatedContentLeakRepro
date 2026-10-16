package example.feature242.contract

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
data class Feature242Key(val id: String) : NavKey
