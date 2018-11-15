package ua.alex.alexweather.models

import javax.annotation.Generated
import com.google.gson.annotations.SerializedName

@Generated("com.robohorse.robopojogenerator")
class Clouds {

    @SerializedName("all")
    var all: Int = 0

    override fun toString(): String {
        return "Clouds{" +
                "all = '" + all + '\''.toString() +
                "}"
    }
}