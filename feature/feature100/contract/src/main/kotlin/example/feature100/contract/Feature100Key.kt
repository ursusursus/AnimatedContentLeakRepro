package example.feature100.contract

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
data class Feature100Key(val id: String) : NavKey
