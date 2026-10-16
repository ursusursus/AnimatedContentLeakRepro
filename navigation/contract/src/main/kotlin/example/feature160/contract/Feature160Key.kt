package example.feature160.contract

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
data class Feature160Key(val id: String) : NavKey
