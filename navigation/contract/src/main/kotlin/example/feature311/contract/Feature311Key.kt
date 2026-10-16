package example.feature311.contract

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
data class Feature311Key(val id: String) : NavKey
