package ua.alex.alexweather.models

import javax.annotation.Generated
import com.google.gson.annotations.SerializedName

@Generated("com.robohorse.robopojogenerator")
class Sys {

    @SerializedName("pod")
    var pod: String? = null

    override fun toString(): String {
        return "Sys{" +
                "pod = '" + pod + '\''.toString() +
                "}"
    }
}