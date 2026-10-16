package example.feature411.contract

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
data class Feature411Key(val id: String) : NavKey
