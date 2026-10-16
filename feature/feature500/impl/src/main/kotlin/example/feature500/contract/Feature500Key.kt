package example.feature500.contract

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
data class Feature500Key(val id: String) : NavKey
