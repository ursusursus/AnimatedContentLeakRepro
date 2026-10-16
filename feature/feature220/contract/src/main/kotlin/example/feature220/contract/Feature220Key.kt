package example.feature220.contract

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
data class Feature220Key(val id: String) : NavKey
