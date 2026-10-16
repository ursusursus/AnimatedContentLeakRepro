package example.feature103.contract

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
data class Feature103Key(val id: String) : NavKey
