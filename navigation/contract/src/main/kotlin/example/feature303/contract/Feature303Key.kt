package example.feature303.contract

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
data class Feature303Key(val id: String) : NavKey
