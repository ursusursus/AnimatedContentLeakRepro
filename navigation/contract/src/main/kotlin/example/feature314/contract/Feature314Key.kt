package example.feature314.contract

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
data class Feature314Key(val id: String) : NavKey
