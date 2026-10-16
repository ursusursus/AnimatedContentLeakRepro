package example.feature201.contract

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
data class Feature201Key(val id: String) : NavKey
