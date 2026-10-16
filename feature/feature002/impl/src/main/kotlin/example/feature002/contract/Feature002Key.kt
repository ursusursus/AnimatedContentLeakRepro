package example.feature002.contract

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
data class Feature002Key(val id: String) : NavKey
