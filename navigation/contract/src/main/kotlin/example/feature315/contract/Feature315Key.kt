package example.feature315.contract

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
data class Feature315Key(val id: String) : NavKey
