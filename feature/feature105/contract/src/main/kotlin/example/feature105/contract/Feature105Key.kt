package example.feature105.contract

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
data class Feature105Key(val id: String) : NavKey
