package example.feature400.contract

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
data class Feature400Key(val id: String) : NavKey
