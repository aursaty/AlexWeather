package ua.alex.alexweather.models

import javax.annotation.Generated
import com.google.gson.annotations.SerializedName

@Generated("com.robohorse.robopojogenerator")
class Coord {

    @SerializedName("lon")
    var lon: Double = 0.toDouble()

    @SerializedName("lat")
    var lat: Double = 0.toDouble()

    override fun toString(): String {
        return "Coord{" +
                "lon = '" + lon + '\''.toString() +
                ",lat = '" + lat + '\''.toString() +
                "}"
    }
}