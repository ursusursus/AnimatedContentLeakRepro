package example.feature226.contract

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
data class Feature226Key(val id: String) : NavKey
