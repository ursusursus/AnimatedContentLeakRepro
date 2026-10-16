package example.feature102.contract

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
data class Feature102Key(val id: String) : NavKey
