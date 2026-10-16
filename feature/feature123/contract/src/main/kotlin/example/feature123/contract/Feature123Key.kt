package example.feature123.contract

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
data class Feature123Key(val id: String) : NavKey
