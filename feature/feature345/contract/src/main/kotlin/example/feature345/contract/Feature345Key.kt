package example.feature345.contract

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
data class Feature345Key(val id: String) : NavKey
