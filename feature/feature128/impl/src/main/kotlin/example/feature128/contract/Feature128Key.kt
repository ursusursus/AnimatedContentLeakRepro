package example.feature128.contract

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
data class Feature128Key(val id: String) : NavKey
