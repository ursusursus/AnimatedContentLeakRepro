package example.feature180.contract

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
data class Feature180Key(val id: String) : NavKey
