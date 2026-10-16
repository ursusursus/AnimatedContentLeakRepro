package example.feature300.contract

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
data class Feature300Key(val id: String) : NavKey
