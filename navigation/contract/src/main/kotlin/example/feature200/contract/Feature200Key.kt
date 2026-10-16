package example.feature200.contract

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
data class Feature200Key(val id: String) : NavKey
