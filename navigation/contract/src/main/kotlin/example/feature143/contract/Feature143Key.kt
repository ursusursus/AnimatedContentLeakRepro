package example.feature143.contract

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
data class Feature143Key(val id: String) : NavKey
