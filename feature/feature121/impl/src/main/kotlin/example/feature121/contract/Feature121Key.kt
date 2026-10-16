package example.feature121.contract

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
data class Feature121Key(val id: String) : NavKey
