package example.feature301.contract

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
data class Feature301Key(val id: String) : NavKey
