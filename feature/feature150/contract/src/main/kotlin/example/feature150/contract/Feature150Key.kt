package example.feature150.contract

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
data class Feature150Key(val id: String) : NavKey
