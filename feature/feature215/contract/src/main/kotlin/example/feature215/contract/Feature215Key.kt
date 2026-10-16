package example.feature215.contract

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
data class Feature215Key(val id: String) : NavKey
