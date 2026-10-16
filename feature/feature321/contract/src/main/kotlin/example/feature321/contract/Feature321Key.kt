package example.feature321.contract

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
data class Feature321Key(val id: String) : NavKey
