package example.feature365.contract

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
data class Feature365Key(val id: String) : NavKey
