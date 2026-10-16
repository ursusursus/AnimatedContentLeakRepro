package example.feature225.contract

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
data class Feature225Key(val id: String) : NavKey
