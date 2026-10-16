package example.feature360.contract

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
data class Feature360Key(val id: String) : NavKey
