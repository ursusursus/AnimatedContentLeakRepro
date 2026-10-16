package example.feature211.contract

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
data class Feature211Key(val id: String) : NavKey
