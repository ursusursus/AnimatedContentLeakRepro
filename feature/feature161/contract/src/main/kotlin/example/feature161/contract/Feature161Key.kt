package example.feature161.contract

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
data class Feature161Key(val id: String) : NavKey
