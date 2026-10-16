package example.feature256.contract

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
data class Feature256Key(val id: String) : NavKey
