package example.feature163.contract

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
data class Feature163Key(val id: String) : NavKey
