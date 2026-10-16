package example.feature250.contract

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
data class Feature250Key(val id: String) : NavKey
