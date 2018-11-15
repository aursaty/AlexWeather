package ua.alex.alexweather.models

import javax.annotation.Generated
import com.google.gson.annotations.SerializedName

@Generated("com.robohorse.robopojogenerator")
class Wind {

    @SerializedName("deg")
    var deg: Double = 0.toDouble()

    @SerializedName("speed")
    var speed: Double = 0.toDouble()

    override fun toString(): String {
        return "Wind{" +
                "deg = '" + deg + '\''.toString() +
                ",speed = '" + speed + '\''.toString() +
                "}"
    }
}