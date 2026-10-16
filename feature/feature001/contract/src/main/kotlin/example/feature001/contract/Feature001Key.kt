package example.feature001.contract

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
data class Feature001Key(val id: String) : NavKey
