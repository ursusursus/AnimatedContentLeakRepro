package example.feature183.contract

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
data class Feature183Key(val id: String) : NavKey
