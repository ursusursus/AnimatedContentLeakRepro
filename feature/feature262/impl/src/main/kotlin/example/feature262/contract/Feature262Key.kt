package example.feature262.contract

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
data class Feature262Key(val id: String) : NavKey
