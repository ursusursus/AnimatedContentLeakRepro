package example.feature101.contract

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
data class Feature101Key(val id: String) : NavKey
