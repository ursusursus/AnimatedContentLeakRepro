package example.feature309.contract

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
data class Feature309Key(val id: String) : NavKey
