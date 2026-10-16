package example.feature003.contract

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
data class Feature003Key(val id: String) : NavKey
