package example.feature231.contract

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
data class Feature231Key(val id: String) : NavKey
