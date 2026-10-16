package example.feature401.contract

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
data class Feature401Key(val id: String) : NavKey
