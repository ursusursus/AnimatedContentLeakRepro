package example.feature213.contract

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
data class Feature213Key(val id: String) : NavKey
